public class IfElseExample { 
    public static void main(String[] args){ 
        int marks = 59; 
        
        if (marks >= 60) { 
            System.out.println("You got first division"); 
        } else if (marks >= 50) { 
            System.out.println("You got second division"); 
        } else if (marks >= 33) { 
            System.out.println("You got third division"); 
        } else { 
            System.out.println("You failed"); 
        } 
    } 
}
