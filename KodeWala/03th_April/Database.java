class Database{
    String dbName,user,password;
    Database(){
        this("mydb","root","admin123");
    }
    Database(String dbName,String user,String password){
        this.dbName=dbName;
        this.user=user;
        this.password=password;
        connect();
    }
    void connect(){
        System.out.println("Connecting to DB: " +dbName+"as"+user);
    }
    public static void main(String[] args){
        Database db1 = new Database();
        Database db2 = new Database("testdb","admin","pass123");
        System.out.println(db1);
        System.out.println(db2);
    }

}