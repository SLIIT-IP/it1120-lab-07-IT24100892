import java.util.Scanner;

public class IT24100892Lab7Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalBill;
        double discount;
        char paymentMode;

        for (int i = 1; i <= 5; i++) {
	    System.out.println("Customer " + i );
            System.out.print("Enter total bill amount :");
            totalBill = scanner.nextDouble();
            System.out.print("Enter payment mode (C for cash, O for other): ");
            paymentMode = scanner.next().charAt(0);

            if (paymentMode == 'C' || paymentMode == 'c') {
                discount = totalBill * 0.05;
                totalBill -= discount;
                System.out.println("Discount: " + discount);
            } else if (paymentMode == 'O' || paymentMode == 'o') {
                discount = 0;
            } else {
                System.out.println("Payment Mode is Not Valid");
                continue;
            }

            System.out.println("Total amount to be paid: " + totalBill);
        }
    }
}