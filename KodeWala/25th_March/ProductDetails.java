class ProductDetails{
         int balance =1000;
        String name = "Shirts";

}

class ProductPrice{
    public static void main(String args[]){
        ProductDetails price = new ProductDetails();
        int output = price.balance;
        System.out.println("output :"+output);
    }
}