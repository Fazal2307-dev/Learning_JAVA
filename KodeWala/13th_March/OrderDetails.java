//write a programme about OrderDetails through  cmd
class OrderDetails{
    public static void main(String[] args){
        String Order_ID = args[0];
        String Item_Name = args[1];
        String Price = args[2];
        String Qty = args[3];
        String Address = args[4];
        System.out.println("Order_ID:"+Order_ID);
        System.out.println("Item_Name:"+Item_Name);
        System.out.println("Price:"+Price);
        System.out.println("Qty:"+Qty);
        System.out.println("Address:"+Address);
    }
}