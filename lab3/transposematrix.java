package lab3;

public class transposematrix {

	public static void main(String[] args) {
		int[][] originalMatrix = {{1, 2, 3}, {4, 5, 6}};
        int rows = originalMatrix.length;
        int columns = originalMatrix[0].length;
        int[][] transposedMatrix = new int[columns][rows];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposedMatrix[j][i] = originalMatrix[i][j];
            }
        }
        
        System.out.println("TRANSPOSE:");
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
	}

}
