public class Client extends User {
    String afm;
    int phoneNumber;

    public Client(String username, String name, String surname, String afm, int phoneNumber,String password) {
        super(username, name, surname, "client",password); // Καλεί τον constructor της υπερκλάσης Users
        this.afm = afm;
        this.phoneNumber = phoneNumber;
    }

    public String getAfm() {
        return afm;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    // Setters (μόνο για το phoneNumber)
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void viewBill(int billCycle)
    {

    }

    // Μέθοδοι
    @Override // Υπερισχύει του αντίστοιχου constructor στην υπερκλάση Users
    public void register() {
        super.register(); // Καλεί την μέθοδο register της υπερκλάσης Users
        System.out.println("Ο χρήστης " + username + " με ΑΦΜ " + afm + " έγινε εγγραφή.");
    }
}

