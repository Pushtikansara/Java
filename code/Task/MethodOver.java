
package Task;
   abstract class Instrument {
    abstract void play();
    abstract String what();
    abstract void adjust();
}


class Wind extends Instrument {
    @Override
    void play() {
        System.out.println("Wind instrument played");
    }

    @Override
    String what() {
        return "Wind Instrument";
    }

    @Override
    void adjust() {
        System.out.println("Wind instrument tuned properly");
    }
}


class Percussion extends Instrument {
    @Override
    void play() {
        System.out.println("Percussion instrument played");
    }

    @Override
    String what() {
        return "Percussion Instrument";
    }

    @Override
    void adjust() {
        System.out.println("Percussion instrument tuned properly");
    }
}


class Stringed extends Instrument {
    @Override
    void play() {
        System.out.println("Stringed instrument played");
    }

    @Override
    String what() {
        return "Stringed Instrument";
    }

    @Override
    void adjust() {
        System.out.println("Stringed instrument tuned properly");
    }
}


class Woodwind extends Wind {
    @Override
    void play() {
        System.out.println("Woodwind instrument played");
    }

    @Override
    String what() {
        return "Woodwind Instrument";
    }

    @Override
    void adjust() {
        System.out.println("Woodwind instrument tuned properly");
    }
}


class Brass extends Wind {
    @Override
    void play() {
        System.out.println("Brass instrument played");
    }

    @Override
    String what() {
        return "Brass Instrument";
    }

    @Override
    void adjust() {
        System.out.println("Brass instrument tuned properly");
    }
}


public class MethodOver {
    public static void main(String[] args) {
        // Individual calls for each class
        Instrument i1 = new Wind();
        i1.play();
        System.out.println(i1.what());
        i1.adjust();

        System.out.println();

        Instrument i2 = new Percussion();
        i2.play();
        System.out.println(i2.what());
        i2.adjust();

        System.out.println();

        Instrument i3 = new Stringed();
        i3.play();
        System.out.println(i3.what());
        i3.adjust();

        System.out.println();

        Instrument i4 = new Woodwind();
        i4.play();
        System.out.println(i4.what());
        i4.adjust();

        System.out.println();

        Instrument i5 = new Brass();
        i5.play();
        System.out.println(i5.what());
        i5.adjust();
    }
}
