package lab;
class Event {
    protected int eventId;
    protected String eventName;
    protected String date;
    protected String venue;

    public Event(int eventId, String eventName, String date, String venue) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.date = date;
        this.venue = venue;
    }

    public void displayEventDetails() {
        System.out.println("Event ID   : " + eventId);
        System.out.println("Name       : " + eventName);
        System.out.println("Date       : " + date);
        System.out.println("Venue      : " + venue);
    }
}

// Interface
interface Registrable {
    void registerParticipant(String name);
    void showParticipants();
}

// Subclass: Coding Event
class CodingEvent extends Event implements Registrable {
    private int maxTeamSize;
    private String[] participants;
    private int count = 0;

    public CodingEvent(int eventId, String date, String venue, int maxTeamSize) {
        super(eventId, "Coding Competition", date, venue);
        this.maxTeamSize = maxTeamSize;
        this.participants = new String[maxTeamSize];
    }

    @Override
    public void displayEventDetails() {
        super.displayEventDetails();
        System.out.println("Max Team Size: " + maxTeamSize);
    }

    @Override
    public void registerParticipant(String name) {
        if (count < maxTeamSize) {
            participants[count++] = name;
            System.out.println(name + " registered successfully for " + eventName);
        } else {
            System.out.println("Registration closed! Max team size reached.");
        }
    }

    @Override
    public void showParticipants() {
        System.out.print("Participants in " + eventName + ": ");
        for (int i = 0; i < count; i++) {
            System.out.print(participants[i] + " ");
        }
        System.out.println();
    }
}

// Subclass: Robotics Event
class RoboticsEvent extends Event implements Registrable {
    private int duration; // in hours
    private String[] participants = new String[50]; // fixed size
    private int count = 0;

    public RoboticsEvent(int eventId, String date, String venue, int duration) {
        super(eventId, "Robotics Competition", date, venue);
        this.duration = duration;
    }

    @Override
    public void displayEventDetails() {
        super.displayEventDetails();
        System.out.println("Duration (hours): " + duration);
    }

    @Override
    public void registerParticipant(String name) {
        if (count < participants.length) {
            participants[count++] = name;
            System.out.println(name + " registered successfully for " + eventName);
        } else {
            System.out.println("No more slots available!");
        }
    }

    @Override
    public void showParticipants() {
        System.out.print("Participants in " + eventName + ": ");
        for (int i = 0; i < count; i++) {
            System.out.print(participants[i] + " ");
        }
        System.out.println();
    }
}

// Subclass: Hackathon Event
class HackathonEvent extends Event implements Registrable {
    private String theme;
    private String[] participants = new String[100]; // fixed size
    private int count = 0;

    public HackathonEvent(int eventId, String date, String venue, String theme) {
        super(eventId, "Hackathon", date, venue);
        this.theme = theme;
    }

    @Override
    public void displayEventDetails() {
        super.displayEventDetails();
        System.out.println("Theme: " + theme);
    }

    @Override
    public void registerParticipant(String name) {
        if (count < participants.length) {
            participants[count++] = name;
            System.out.println(name + " registered successfully for " + eventName);
        } else {
            System.out.println("No more slots available!");
        }
    }

    @Override
    public void showParticipants() {
        System.out.print("Participants in " + eventName + ": ");
        for (int i = 0; i < count; i++) {
            System.out.print(participants[i] + " ");
        }
        System.out.println();
    }
}

// Main class to demonstrate
public class EventManagement {
    public static void main(String[] args) {
        // Runtime Polymorphism
        Event e1 = new CodingEvent(101, "12-Sep-2025", "Auditorium", 3);
        Event e2 = new RoboticsEvent(102, "13-Sep-2025", "Lab-1", 5);
        Event e3 = new HackathonEvent(103, "14-Sep-2025", "Innovation Hub", "AI & IoT");

        System.out.println("----- Event Details -----");
        e1.displayEventDetails();
        System.out.println();
        e2.displayEventDetails();
        System.out.println();
        e3.displayEventDetails();
        System.out.println();

        // Interface usage
        Registrable r1 = (Registrable) e1;
        Registrable r2 = (Registrable) e2;
        Registrable r3 = (Registrable) e3;

        r1.registerParticipant("Alice");
        r1.registerParticipant("Bob");
        r1.registerParticipant("Charlie");
        r1.registerParticipant("David"); // exceeds max team size
        r1.showParticipants();

        System.out.println();

        r2.registerParticipant("Eva");
        r2.registerParticipant("Frank");
        r2.showParticipants();

        System.out.println();

        r3.registerParticipant("Grace");
        r3.registerParticipant("Heidi");
        r3.showParticipants();
    }
}