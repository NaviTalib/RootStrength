// do-while loop: Similar to a while loop, but it guarantees
// the code block will execute at least once because the condition is checked at the end of the loop.
public  class DoWhileExample{
    public static void main(String[] args) {
        System.out.println("-----DO WHILE LOOP-----");
        int x = 10;
        do{
            System.out.println("This runs atlest once. x is: "+x);
            x++;
        } while (x<5);
    }
}