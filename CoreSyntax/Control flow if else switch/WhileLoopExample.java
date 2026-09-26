// while loop: Best when you want to repeat code as long as a condition remains true,
// but you don't know the exact number of iterations beforehand.

public class WhileLoopExample {
    public static void main(String[] args) {
        System.out.println("----WHILE LOOP-----");
        int countdown = 5;
        while (countdown > 0) {
            System.out.println("Liftoff in:"+ countdown);
            countdown--;

        }
    }
}
