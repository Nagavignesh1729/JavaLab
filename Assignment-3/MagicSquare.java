import java.util.Scanner;

public class MagicSquare {
    static void verifyMagicSquare(int[][] square, int magicConstant) {
        
        int n = square.length;
        boolean isMagic = true;

        for (int i = 0; i < n; i++) {
            int rowSum = 0, colSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += square[i][j];
                colSum += square[j][i];
            }
            if (rowSum != magicConstant || colSum != magicConstant) {
                isMagic = false;
                break;
            }
        }
        
        int diag1Sum = 0, diag2Sum = 0;
        
        for (int i = 0; i < n; i++) {
            diag1Sum += square[i][i];
            diag2Sum += square[i][n - 1 - i];
        }
        
        if (diag1Sum != magicConstant || diag2Sum != magicConstant) {
            isMagic = false;
        }
        
        if (isMagic)
            System.out.println("The grid is a magic square with a magic constant of " + magicConstant);
        else
            System.out.println("The grid is not a magic square.");
    }
    public static void main(String[] args) {
        int size = 3;
        int[][] magicSquare = new int[size][size];
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name: Nagavignesh M\t\t Reg No: 2022503565");
        System.out.print("Enter any integer for the middle position: ");
        
        int middleValue = scanner.nextInt();
        int magicConstant = 3 * middleValue;
        int row = 0, col = size / 2;
        
        for (int num = middleValue - 4; num <= middleValue + 4; num++) {
            magicSquare[row][col] = num;
            int newRow = (row - 1 + size) % size;
            int newCol = (col + 1) % size;
            if (magicSquare[newRow][newCol] != 0) {
                row = (row + 1) % size;
            } else {
                row = newRow;
                col = newCol;
            }
        }

        magicSquare[1][1] = middleValue;
        System.out.println("Magic Square:");

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(magicSquare[i][j] + "\t");
            }
            System.out.println();
        }

        verifyMagicSquare(magicSquare, magicConstant);
        scanner.close();
    }
}