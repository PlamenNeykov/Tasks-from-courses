package ExamPrep15October2021;

import java.util.*;
import java.util.stream.Collectors;

public class Blacksmith {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> queueSteel = new ArrayDeque<>();
        ArrayDeque<Integer> stackCarbon = new ArrayDeque<>();

        String[] queueInput = scanner.nextLine().split("\\s+");
        String[] stackInput  = scanner.nextLine().split("\\s+");

        for (String value : queueInput) {
            queueSteel.offer(Integer.parseInt(value));
        }

        for (String s : stackInput) {
            stackCarbon.push(Integer.parseInt(s));
        }

        Map<String,Integer> swordMap = new HashMap<>();
        swordMap.put("Gladius",70);
        swordMap.put("Shamshir",80);
        swordMap.put("Katana",90);
        swordMap.put("Sabre",110);

        Map<String,Integer> swordAmount = new TreeMap<>();

        while (queueSteel.size()!=0&&stackInput.length!=0) {
            int steel = queueSteel.peek();
            int carbon = stackCarbon.peek();
            int sum = steel+carbon;

            if (sum==70) {

                fillSwords(swordMap, swordAmount, sum);

                queueSteel.poll();
                stackCarbon.pop();
            } else if (sum==80) {

                fillSwords(swordMap, swordAmount, sum);

                queueSteel.poll();
                stackCarbon.pop();

            }else if (sum==90) {

                fillSwords(swordMap, swordAmount, sum);

                queueSteel.poll();
                stackCarbon.pop();

            } else if (sum==110) {

                fillSwords(swordMap, swordAmount, sum);

                queueSteel.poll();
                stackCarbon.pop();
            } else {
                queueSteel.poll();
                int newCarbonValue = stackCarbon.pop()+5;
                stackCarbon.push(newCarbonValue);
            }
        }

        if (swordAmount.size()==0) {
            System.out.println("You did not have enough resources to forge a sword.");
            System.out.println("Steel left: none");
            System.out.print("Carbon left: ");

            StringJoiner print = new StringJoiner(", ");
            for (Integer element : stackCarbon) {
                print.add(String.valueOf(element));
            }
            System.out.print(print);
        } else {
            int count = 0;
            for (Map.Entry<String, Integer> entry : swordAmount.entrySet()) {
                count =count+ entry.getValue();
            }
            System.out.printf("You have forged %d swords.%n",count);
            System.out.println("Steel left: none");
            System.out.print("Carbon left: ");

            StringJoiner print = new StringJoiner(", ");
            for (Integer element : stackCarbon) {
                print.add(String.valueOf(element));
            }
            System.out.println(print);


            for (Map.Entry<String, Integer> entry : swordAmount.entrySet()) {
                System.out.printf("%s: %d%n",entry.getKey(),entry.getValue());
            }

        }

    }

    private static void fillSwords(Map<String, Integer> swordMap, Map<String, Integer> swordAmount, int sum) {
        String name = "";
        for (Map.Entry<String, Integer> entry : swordMap.entrySet()) {
            if (entry.getValue()== sum){
                name = entry.getKey();
            }
        }
        if (!swordAmount.containsKey(name)) {
            swordAmount.putIfAbsent(name,1);
        } else {
            int newValue = swordAmount.get(name)+1;
            swordAmount.replace(name,newValue);
        }
    }
}
