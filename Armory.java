package ExamPrep15October2021;

import java.util.Scanner;

public class Armory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        String[] commands = scanner.nextLine().split(", ");

        char[][] matrix = new char[size][size];

        for (int i = 0; i < size; i++) {
            matrix[i] = scanner.nextLine().replace(" ","").toCharArray();
        }

        int startPositionR = 0;
        int startPositionC = 0;
        int food = 0;
        int length = 1;
        boolean enemy = true;

        for (int i = 0; i <size ; i++) {
            for (int j = 0; j < size; j++) {
                if(matrix[i][j]=='s') {
                    startPositionR=i;
                    startPositionC =j;

                }

                if(matrix[i][j]=='f') {
                    food++;
                }
            }
        }

        for (String command : commands) {

            switch (command){
                case "up":
                    startPositionR--;
                    break;
                case"down":
                    startPositionR++;
                    break;
                case "right":
                    startPositionC++;
                    break;
                case "left":
                    startPositionC--;
                    break;
            }
            startPositionR = checkStartPositionR(size, startPositionR);
            startPositionC = checkStartPositionC(size, startPositionC);

            char currentSymbol = matrix[startPositionR][startPositionC];
            if (currentSymbol=='*'){

            } else if (currentSymbol=='f'){
                length++;
                food--;
            } else if (currentSymbol=='e'){
                enemy=false;
                break;
            }

        }

        if(!enemy) {
            System.out.println("You lose! Killed by an enemy!");
        } else if (food==0) {
            System.out.printf("You win! Final python length is %d",length);
        } else if (food>0){
            System.out.printf("You lose! There is still %d food to be eaten.",food);
        }

    }



    private static int checkStartPositionR(int size, int startPositionR) {
        if (startPositionR <0) {
            startPositionR = size -1;
        } else if (startPositionR >= size) {
            startPositionR =0;
        }
        return startPositionR;
    }

    private static int checkStartPositionC(int size, int startPositionC) {
        if (startPositionC < 0) {
            startPositionC = size - 1;
        } else if (startPositionC >= size) {
            startPositionC = 0;
        }
        return startPositionC;
    }
}
