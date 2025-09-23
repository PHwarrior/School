import java.util.Scanner;
public class ItemList
{
    static int itemName = 0;
    static Scanner scanner = new Scanner(System.in);
    public static void main (String[] args) {
        boolean sold = true;

        System.out.println("===== Store =====");
        System.out.println("(1) Buy food");
        System.out.println("(2) Exit");
        System.out.print("Process: ");
        itemName = scanner.nextInt();
        switch (itemName) {
            case 1 -> logDetails();
            case 2 -> sold = false;
            default -> System.out.println("Invalid!");
        }
        scanner.close();
    }
    static void logDetails() {
        boolean sold = true;
        System.out.println("==== Item List =====");
        System.out.println("(1) Apple = $4");
        System.out.println("(2) Exit");
        System.out.print("Process: ");
        itemName = scanner.nextInt();
        switch (itemName) {
            case 1 -> buy();
            case 2 -> sold = false;
            default -> System.out.println("Invalid!");
        }
        scanner.close();
    }
    static void buy() {
        boolean status = true;
        int choose;
        int stock = 20, sold;
        System.out.println("===== Stock =====");
        System.out.println("We have total of 20 apples");
        System.out.print("How many apples would you like to buy?: ");
        sold = scanner.nextInt();
        if (sold < stock) {
            stock -= sold;
        }
        else {
            System.out.println("Invalid!");
        }
        System.out.println("You brought " + sold + " total of apples");
        System.out.println("Remaining apples " + stock);
        System.out.println("If ever you change your mind do you like a refund?");
        System.out.println("(1 = Yes) & (2 = No):");
        choose = scanner.nextInt();
        switch (choose) {
            case 1 -> returns(sold);
            case 2 -> status = false;
            default -> System.out.println("Invalid!");
        }
    }
    static void returns(int sold) {
        int refund;
        System.out.println("===== Stock =====");
        System.out.println("You have " + sold + " apples");
        System.out.println("How many apples would you like to refund?: ");
        refund = scanner.nextInt();
        if (refund < sold) {
            sold -= refund;
        }
        System.out.println("You return " + refund + " apples");
        System.out.println("Your remaining apples " + sold);
        System.out.print("Total price $");
        System.out.println(sold *= 4);
    }
}