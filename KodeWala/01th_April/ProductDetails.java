class ProductDetails {

    String customerName ;
    String itemName;
    String delDelete;
    String status;

    ProductDetails(){
        System.out.println("customerName :"+customerName);
        System.out.println("itemName :"+itemName);
        System.out.println("deDelte:"+delDelete);
        System.out.println("Status:"+status);
    }


    public  ProductDetails(String _customerName,String _itemName,String _delDelete,String _status){
        System.out.println("customerName :"+_customerName);
        System.out.println("itemName :"+_itemName);
        System.out.println("deDelte:"+_delDelete);
        System.out.println("Status:"+_status);

    }

}


class Product{
    public static void main(String[] args) {
        ProductDetails  person= new ProductDetails();
        ProductDetails person1 = new ProductDetails("MD FAZAl","Shirt","25/04/2026","ongoing");
        ProductDetails person2 = new ProductDetails("sumit","Jeans","26/04/2026","ongoing");
        ProductDetails person3 = new ProductDetails(" amit ","joggers","28/04/2026","Delivered");


    }
}