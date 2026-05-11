public class FindingException{
    public static void main(String args[]) {
        String name = "";
        System.out.println(name.length()); // NPE --> unchecked/ Runtime exception

        try {
            Class.forName("com.kodewala.EceptionalHandling.Driver");
            //load or read file
        }catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
