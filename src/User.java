import java.sql.SQLOutput;
import java.util.Scanner;

public class User {
    String username;
    String fname;
    String lname;
    String userType;

    private String password;

    Boolean loggedin;
    int userCount = 0;

    public User(String username, String fname, String lname, String userType,String password) {
        this.username = username;
        this.fname = fname;
        this.lname = lname;
        this.userType = userType;
        this.userCount = userCount;
        this.password = password;
        userCount++;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String uername) {
        this.username = uername;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public int getUserCount() {
        return userCount;
    }

    public void setUserCount(int userCount) {
        this.userCount = userCount;
    }

    public void register() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert Username:");
        String username = scanner.nextLine();

        System.out.println("Insert Name:");
        String name = scanner.nextLine();

        System.out.println("Insert Surname:");
        String surname = scanner.nextLine();

        System.out.println("Insert Role (client, seller, administrator):");
        String role = scanner.nextLine();

        System.out.println("Insert Password:");
        String password = scanner.nextLine();

        User newUser = new User(username,name,surname,role,password);

        // Indicate successful registration
        System.out.println("New user registered: " + newUser.getUsername());
    }

    public void login(String username, String password) {
        // Λογική σύνδεσης χρήστη
        if (this.username.equals(username) && this.password.equals(password)) {
            System.out.println("Ο χρήστης " + username + " συνδέθηκε.");
            loggedin = true;
        }
        else
        {
            System.out.println("Λανθασμένα στοιχεία σύνδεσης.");
        }
    }
    public void logout() {
        if(loggedin)
        {
            System.out.println("Ο χρήστης " + username + " αποσυνδέθηκε.");

        }
        else
        {
            System.out.println("Ο χρήστης" + username + "δεν ήταν συνδεδεμένος");
        }
    }

}
