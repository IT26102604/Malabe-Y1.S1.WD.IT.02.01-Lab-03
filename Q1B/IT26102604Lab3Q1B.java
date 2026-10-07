import java.util.Scanner;

public class IT26102604Lab3Q1B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the total bill: ");
        double totalBill = input.nextDouble();

        double discount = totalBill * 0.10;
        double amountToPay = totalBill - discount;

        System.out.println("Total Bill: " + totalBill);
        System.out.println("Discount (10%): " + discount);
        System.out.println("Amount to Pay: " + amountToPay);

        input.close();
    }
}
