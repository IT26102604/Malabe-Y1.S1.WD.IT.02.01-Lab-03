import java.util.Scanner;

public class IT26102604Lab3Q4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter amount: ");
        int amount = input.nextInt();

        int[] denominations = {5000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

        for (int denomination : denominations) {
            int count = amount / denomination;
            amount = amount % denomination;

            System.out.println(denomination + " Notes - " + count);
        }

        input.close();
    }
}
