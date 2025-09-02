// import java.util.Random;

// class TicketSystem {
//     private int ticketsAvailable = 10;  // initial tickets

//     public void bookTicket(int count) {
//         ticketsAvailable -= count; // no synchronization → race conditions may occur
//         System.out.println(Thread.currentThread().getName() +
//                 " booked " + count + " → Tickets left: " + ticketsAvailable);
//     }

//     public void cancelTicket(int count) {
//         ticketsAvailable += count;
//         System.out.println(Thread.currentThread().getName() +
//                 " canceled " + count + " → Tickets left: " + ticketsAvailable);
//     }

//     public int getTicketsAvailable() {
//         return ticketsAvailable;
//     }
// }

// public class TicketSystemDemo {
//     public static void main(String[] args) {
//         TicketSystem system = new TicketSystem();
//         Random rand = new Random();

//         // Create 3 user threads
//         Thread t1 = new Thread(() -> simulateUser(system, rand), "User-1");
//         Thread t2 = new Thread(() -> simulateUser(system, rand), "User-2");
//         Thread t3 = new Thread(() -> simulateUser(system, rand), "User-3");

//         t1.start();
//         t2.start();
//         t3.start();

//         try {
//             t1.join();
//             t2.join();
//             t3.join();
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }

//         System.out.println("\nFinal tickets available: " + system.getTicketsAvailable());
//     }

//     private static void simulateUser(TicketSystem system, Random rand) {
//         for (int i = 0; i < 5; i++) {  // repeat several times
//             int toBook = rand.nextInt(3) + 1;  // 1–3 tickets
//             system.bookTicket(toBook);

//             try {
//                 Thread.sleep(50); // short pause
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }

//             int toCancel = rand.nextInt(2) + 1; // 1–2 tickets
//             system.cancelTicket(toCancel);

//             try {
//                 Thread.sleep(50);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
//}
package Task;
class TicketSystem{
int count;
TicketSystem(int count){
    this.count=count;
}
public void bookTicket(int count) { 
 
}
public void cancelTicket(int count) { 
   
}
}
public class TicketMain {
    
}
