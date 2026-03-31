public class Switch {



    public static void main(String[] args) {
        String customerType = "Gold";
        int amount = 10000;

        switch (customerType) {
            case "Gold":
                double discountAmount = amount - (amount * 0.1);
                System.out.println("After discount is: " + discountAmount);
                break;

            case "Silver":
                System.out.println("You will not get any Discount.");
                break;

            case "Platinum":
                double discountAmount2 = amount - (amount * 0.15);
                System.out.println("After discount is: " + discountAmount2);
                break;

            default:
                System.out.println("Unwanted Value");
                break;
        }
    }
}