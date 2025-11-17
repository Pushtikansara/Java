import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Arrays;

interface Payable {
    double calculateSalary();
    double calculateOvertimePay();
}

interface Searchable {
    boolean matchesId(int id);
    void displayDetails();
}

class EmployeeNotFoundException extends Exception {
    public EmployeeNotFoundException(String message) {
        super(message);
    }
}

class Employee implements Payable, Searchable {
    private int empId;
    private String name;
    private String department;
    protected double baseSalary;
    private double[] weeklyHours;
    private static int employeeCount = 0;

    public Employee(String name, String department, double baseSalary) {
        this.empId = ++employeeCount;
        this.name = name;
        this.department = department;
        this.baseSalary = baseSalary;
        this.weeklyHours = new double[4];
    }

    @Override
    public double calculateOvertimePay() {
        double totalOvertimeHours = 0;
        for (double hours : weeklyHours) {
            if (hours > 40) {
                totalOvertimeHours += (hours - 40);
            }
        }
        double hourlyRate = baseSalary / 160.0;
        return totalOvertimeHours * hourlyRate * 1.5;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + calculateOvertimePay();
    }

    public void recordWeeklyHours(int week, double hours) {
        if (week >= 1 && week <= 4) {
            this.weeklyHours[week - 1] = hours;
            System.out.println("Hours recorded for week " + week + " for employee ID " + empId);
        } else {
            System.out.println("Invalid week number.");
        }
    }

    @Override
    public boolean matchesId(int id) {
        return this.empId == id;
    }

    @Override
    public void displayDetails() {
        System.out.println(" Employee Details ");
        System.out.println("ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.printf("Base Salary: $%.2f%n", baseSalary);
        System.out.println("Weekly Hours: " + Arrays.toString(weeklyHours));
        System.out.printf("Total Salary (with Overtime): $%.2f%n", calculateSalary());
    }

    public int getEmpId() {
        return empId;
    }

    public String getDepartment() {
        return department;
    }

    public void setBaseSalary(double salary) {
        this.baseSalary = salary;
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager(String name, String department, double baseSalary, double bonus) {
        super(name, department, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + bonus;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.printf("Manager Bonus: $%.2f%n", bonus);
        System.out.printf("Final Salary (with Bonus): $%.2f%n", calculateSalary());
    }
}

public class PayrollSystem {
    private ArrayList<Employee> employees;
    private HashSet<String> departments;
    private Scanner scanner;

    public PayrollSystem() {
        this.employees = new ArrayList<>();
        this.departments = new HashSet<>();
        this.scanner = new Scanner(System.in);
    }

    public void addEmployee() {
        System.out.println("Adding a new employee...");
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter department: ");
        String department = scanner.nextLine();
        System.out.print("Enter base salary: ");
        double baseSalary = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Is this employee a Manager? (yes/no): ");
        String isManager = scanner.nextLine();

        if (!departments.contains(department)) {
            departments.add(department);
            System.out.println("New department '" + department + "' added to the system.");
        }

        if (isManager.equalsIgnoreCase("yes")) {
            System.out.print("Enter manager bonus: ");
            double bonus = scanner.nextDouble();
            scanner.nextLine();
            employees.add(new Manager(name, department, baseSalary, bonus));
        } else {
            employees.add(new Employee(name, department, baseSalary));
        }

        System.out.println("Employee added successfully!");
    }

    public void displayAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees in the system.");
            return;
        }
        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("-------------------------");
        }
    }

    public Employee searchEmployeeById(int id) throws EmployeeNotFoundException {
        for (Employee emp : employees) {
            if (emp.matchesId(id)) {
                return emp;
            }
        }
        throw new EmployeeNotFoundException("Employee with ID " + id + " not found.");
    }

    public double calculateTotalPayroll() {
        double total = 0;
        for (Employee emp : employees) {
            total += emp.calculateSalary();
        }
        return total;
    }

    public void showMenu() {
        int choice;
        do {
            System.out.println("\n--- Payroll System Menu ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Record Weekly Hours");
            System.out.println("5. Calculate Total Payroll");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        addEmployee();
                        break;
                    case 2:
                        displayAllEmployees();
                        break;
                    case 3:
                        System.out.print("Enter Employee ID to search: ");
                        int searchId = scanner.nextInt();
                        scanner.nextLine();
                        try {
                            Employee foundEmployee = searchEmployeeById(searchId);
                            foundEmployee.displayDetails();
                        } catch (EmployeeNotFoundException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 4:
                        System.out.print("Enter Employee ID to record hours: ");
                        int empId = scanner.nextInt();
                        scanner.nextLine();
                        try {
                            Employee targetEmployee = searchEmployeeById(empId);
                            for (int i = 1; i <= 4; i++) {
                                System.out.print("Enter hours for week " + i + ": ");
                                double hours = scanner.nextDouble();
                                targetEmployee.recordWeeklyHours(i, hours);
                            }
                        } catch (EmployeeNotFoundException e) {
                            System.out.println(e.getMessage());
                        }
                        scanner.nextLine();
                        break;
                    case 5:
                        System.out.printf("Total Monthly Payroll: $%.2f%n", calculateTotalPayroll());
                        break;
                    case 6:
                        System.out.println("Exiting system. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
                choice = 0;
            }

        } while (choice != 6);
    }

    public static void main(String[] args) {
        PayrollSystem system = new PayrollSystem();
        system.showMenu();
    }
}
