//develop an application to prove discount to users
// -user will provide item's value from cmd
// -to avail 10% discount minimum purchase value should be 1000 or customer should be gold type

class DiscountApplication {
    public static void main(String args[]) {
        String itemInput = args[0];
        int userInput = Integer.parseInt(itemInput);
        System.out.println("User input for item value: " + userInput);

        String userType = args[1];
        int minPurchase = 1000;

        if ((userInput > minPurchase) || userType.equalsIgnoreCase("gold")) {
            System.out.println("You are eligible for 10% discount");
            double discountedPrice = userInput * 0.9;
            System.out.println("Discounted price: " + discountedPrice);
        } else {
            System.out.println("You have to pay full amount");
        }
    }
}
