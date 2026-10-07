import java.util.Scanner;

public class IT26102604Lab3Q2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double monthlySalary;
        double otHours;
        double otHourlyRate;
        double otAmount;
        double totalSalary;

        System.out.print("Enter Monthly Salary: ");
        monthlySalary = input.nextDouble();

        System.out.print("Enter OT Hours: ");
        otHours = input.nextDouble();

        System.out.print("Enter OT Hourly Rate: ");
        otHourlyRate = input.nextDouble();

        // Calculate OT amount
        otAmount = otHours * otHourlyRate;

        // Calculate total salary
        totalSalary = monthlySalary + otAmount;

        System.out.println("OT Amount = " + otAmount);
        System.out.println("Total Salary = " + totalSalary);

        input.close();
    }
}
