public class ElectricityBill {
    public static void main(String[] args) {
        eBill(300);

    }

    public static void eBill(int units) {
        int bill;
        if (units <= 100) {
            bill = units * 10;
            System.out.println("Electricity bill for " + units + " is " + bill);
        } else if (units > 100 && units <= 200) {
            bill = (100 * 10) + (units - 100) * 15;

            System.out.println("Electricity bill for " + units + " is " + bill);
        } else if (units > 200 && units <= 300) {
            bill = (100 * 10) + (100 * 15) + (units - 200) * 20;

            System.out.println("Electricity bill for " + units + " is " + bill);
        }

        else {
            bill = (100 * 10) + (100 * 15) + (100 * 20) + (units - 100) * 25;

            System.out.println("Electricity bill for " + units + " is " + bill);
        }
    }

}
