class InvoiceMgmt{
    public void doSomthing() {
        System.out.println("Parent class");
    }

}
class GSTInvoice extends InvoiceMgmt{
    @Override
    public void doSomthing() {
        System.out.println("child class");
    }

}

public class InvoiceGen {

    public static void main(String[] args) {

        //parent class can refer child class objects
		InvoiceMgmt invoiceMgmt =  new GSTInvoice(); //auto up casting
		invoiceMgmt.doSomthing();
//		GSTInvoice gstInvoice = new InvoiceMgmt();//Down Casting
//		gstInvoice.doSomthing();

    }

}

