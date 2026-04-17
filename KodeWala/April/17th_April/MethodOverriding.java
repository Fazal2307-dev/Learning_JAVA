class Engineering {
    public void doingEngineering(){
        System.out.println("Doing Engineering");
    }
}
class CSE extends Engineering {
    public void doingEngineering(){
        String Branch = "CSE";
        System.out.println("Doing Engineering thorugh :"+Branch);
    }
}

class ECE extends Engineering{
    public void doingEngineering(){
        String Branch = "ESE";
        System.out.println("Doing Engineering through :"+Branch);
    }
}

public class MethodOverriding{
    public static void main(String args[]){
        ECE ece = new ECE();
        ece.doingEngineering();
        CSE cse = new CSE();
        cse.doingEngineering();
    }
}