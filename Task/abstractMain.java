/*Create a abstract class game which has one abstact method of play create another class based on the abstract class cricket and tennis override the abstract method of game class on that with an appropriate message    */
package Task;
abstract class Game {
    abstract void play();
}

class Cricket extends Game {
    void play() {
        System.out.println("Playing Cricket");
    }
}
class Tennis extends Game {
    void play() {
        System.out.println("Playing tennis");
    }
}

public class abstractMain {
    public static void main(String[] args) {
        Game g = new Cricket();
        g.play();
    }
}
