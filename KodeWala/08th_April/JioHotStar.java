class User {
    public static int totalLiveUser = 0;
    private String mobileNo;

    // Instance block
    {
        totalLiveUser = totalLiveUser + 1;

        if (totalLiveUser > 1) {
            System.out.println("Please logout from previous device:");
        }
    }

    public User(String mobileNo) {
        this.mobileNo = mobileNo;
    }
}

public class JioHotStar {

    public static void main(String[] args) {
        User u1 = new User("478956123");
        User u2 = new User("478956123");
        User u3 = new User("478956123");

        System.out.println("Total Live viewers are: " + User.totalLiveUser);
    }
}
