public class ElectronicItems {
    public static void main(String[] args){
        String[] product = {"Laptop","Smartphone","Tablet","SmartWatch","HeadPhone"};
        int[] prices = {50000,12000,24000,4000,3500};
        int maxPriceIndex =0;
        for(int i =1;i<prices.length;i++){
            if(prices[i] <prices[maxPriceIndex]){
                maxPriceIndex=i;
            }
        }
        System.out.println("The product with the high price is :"+product[maxPriceIndex]+
                "with a price of Rs."+prices[maxPriceIndex]);
    }
}