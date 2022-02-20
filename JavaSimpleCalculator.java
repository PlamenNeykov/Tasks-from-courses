import java.util.ArrayDeque;
import java.util.Scanner;

public class JavaSimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        ArrayDeque<String> numbersAndCommand = new ArrayDeque<>();

        for (int i = 0; i < input.length; i++) {
            numbersAndCommand.push(input[i]);
        }
        int sum = 0;
        int firstNum = Integer.parseInt(numbersAndCommand.getLast());

        sum = firstNum;

        numbersAndCommand.removeLast();

        int currentValue = 0;
        String command = "";
        while (numbersAndCommand.size() > 0) {
            for (int i = 0; i < 2; i++) {
                String task = numbersAndCommand.getLast();
                numbersAndCommand.removeLast();

                if (i == 0) {
                    command=task;
                } else {
                    currentValue = Integer.parseInt(task);
                    if (command.equals("+")) {
                        sum = sum + currentValue;
                    } else if (command.equals("-")) {
                        sum = sum - currentValue;
                    }
                }
            }
        }
        System.out.println(sum);

    }
}
