package Massive;
import java.util.Arrays;
import java.util.Scanner;

public class MassiveMain {
    public static void main(String[] args) {
        //Task 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you number for massive ");
        int x = scanner.nextInt();
        int [][] arr =  {{1,5,9},
                        {2,6,10},
                        {3,8,15}};
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + x + " ");
            }
            System.out.println();
        }
        //Task 2 chessBoard
        String[][] chessBoard = new String[8][8];
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                if ((i + j) % 2 == 0) chessBoard[i][j] = "W";
                else chessBoard[i][j] = "B";
                System.out.print(" " + chessBoard[i][j]);
            }
            System.out.println();
        }
        //Task 3
                int[][] arrayOne = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
                int[][] arrayTwo = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
                int[][] result = new int[arrayOne.length][arrayTwo.length];
                for (int k = 0; k < result.length; k++) {
                    for (int i = 0; i < result[k].length; i++) {
                        for (int j = 0; j < arrayTwo.length; j++) {
                            result[k][i] += arrayOne[k][j] * arrayTwo[j][i];
                        }
                        System.out.println(result[k][i]);
                    }
                }
        //Task 4
                int [][] array = {{15,66,9}, {12,5,44}};
                int x1 = array.length;
                int summ = 0;
                for (int i = 0; i < x1; i++){
                    for (int j = 0; j < x1;  j++){
                        summ +=array[i][j];
                    }
                }
        System.out.println("Summ massive equals " + summ);

        //Task 5
                int [][] array1 = {{80,12,11,22,66}, {16,33,2,44,12}};
                int Str1 = 0;
                Str1 +=array1[0][0] + array1 [1][1];
        System.out.println("The sum of the elements of the diagonal " + Str1);

        //Task 6
                int [][] array2 = {{9,12,1,20,7},{6,19,1,55,2}};
                for(int e = 0; e < array2.length; e++){
                    Arrays.sort(array2[e]);
                    //проходим по горизонталям массива и внутри осуществляем сортировку
                }
                for( int i = 0; i < array2.length; i++){
                    for( int j = 0; j < array2[i].length; j++){
                        System.out.print(array2[i][j]+ "\t");
                    }
                    }
                }
            }
