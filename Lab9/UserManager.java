
package sample1;

public class UserManager {
    private String username;
    private String password;  
    private String email;
    private String pin;
    private String phoneNumber;
    public UserManager(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public UserManager(String username, String password, String email) {
        this(username, password);  
        this.email = email;
    }
    public UserManager(String username, String password, String email, String phoneNumber, String pin) {
        this(username, password, email);  
        this.phoneNumber = phoneNumber;
        this.pin = pin;
    }
    public void display() {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        if (email != null) {
            System.out.println("Email: " + email);
        }
        if (phoneNumber != null) {
            System.out.println("Phone Number: " + phoneNumber);
        }
        if (pin != null) {
            System.out.println("PIN: " + pin);
        }
    }

    public static void main(String[] args) {
     
        UserManager u1 = new UserManager("abc", "12");
        u1.display();
        System.out.println();

        UserManager u2 = new UserManager("nikki", "ashika", "nikkiashikagmail.com");
        u2.display();
        System.out.println();

        UserManager u3 = new UserManager("AshikaKomati", "komati", "ashikgmail.com", "1234567890", "1827");
        u3.display();
    }
}
