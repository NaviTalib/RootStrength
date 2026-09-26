package ArraysPractice;
public class ArrayBasic {
    public static void main(String[] args){

        // Method A: Two-Step Creation (Declare size first)

        // 1 . declaration and size allocation
        int[] numbers = new int[3];

        // 2. assign values by index
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        System.out.println("first number: "+ numbers[0]);

        // Method B: Direct Literal Initialization

        String[] students = {"Aman","Rahul","Akash"};
        System.out.println("Total Students: "+ students.length);

    }
}
