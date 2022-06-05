package DefinigClassesL03;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer,BankAccount> accountInfo = new TreeMap<>();

        String[] input = scanner.nextLine().split("\\s+");
        while (!input[0].equals("End")){
            String command = input[0];
            switch (command){
                case ("Create"):
                    BankAccount newPerson = new BankAccount();
                    accountInfo.put(newPerson.getId(),newPerson);
                    System.out.printf("Account ID%d created%n",
                            newPerson.getId());
                    break;
                case("Deposit"):
                    int ID = Integer.parseInt(input[1]);
                    if (ID>accountInfo.size()) {
                        System.out.println("Account does not exist");

                    } else {
                        Double depositToPut = Double.parseDouble(input[2]);
                        accountInfo.get(ID).deposit(depositToPut);
                        System.out.printf("Deposited %.0f to ID%d%n",
                                depositToPut,ID);
                    }
                    break;
                case("SetInterest"):
                    Double interestToSet = Double.parseDouble(input[1]);
                    BankAccount.setInterestRate(interestToSet);
                    break;
                case ("GetInterest"):
                    int getID = Integer.parseInt(input[1]);
                    if (getID>accountInfo.size()) {
                        System.out.println("Account does not exist");
                    } else {
                        int year = Integer.parseInt(input[2]);
                        System.out.printf("%.2f%n",accountInfo.get(getID).getInterest(year));
                        break;
                    }
            }


            input = scanner.nextLine().split("\\s+");
        }
    }
}
