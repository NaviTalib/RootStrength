package ArraysPractice;

public  class TwoDArray{
    public static void main(String[] args) {
        int matrix[][] = {
            {1,2,3},
            {4,5,6}
        };
        // Access individual element: matrix[row][column]
        System.out.println("Row 1,Column 2 value: "+matrix[1][2]);

        // Iterating through a 2D array
        System.out.println("\nFull Grid");
        for( int row = 0;row<matrix.length;row++){
            for( int col = 0; col<matrix[row].length;col++){
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }
    }
}