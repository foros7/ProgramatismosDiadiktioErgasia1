public class Seller extends User {

    private String sellerID;
    private double commissionRate;

    public Seller(String username, String name, String surname, String sellerID, double commissionRate, String password) {
        super(username, name, surname, "seller",password);
        this.sellerID = sellerID;
        this.commissionRate = commissionRate;
    }

    // Getters and setters for additional attributes

    public String getSellerID() {
        return sellerID;
    }

    public void setSellerID(String sellerID) {
        this.sellerID = sellerID;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }


    // Additional methods
    public void registerNewClient(Client client) {
        // Λογική καταχώρησης νέου πελάτη
        System.out.println("Ο πωλητής " + username + " καταχώρησε τον πελάτη " + client.getUsername());
    }

    public void issueInvoice(Client client, double amount) {
        // Λογική έκδοσης τιμολογίου
        System.out.println("Ο πωλητής " + username + " εξέδωσε τιμολόγιο ύψους " + amount + " στον πελάτη " + client.getUsername());
    }

    public void changeClientPlan(Client client, String newPlan) {
        // Λογική αλλαγής προγράμματος πελάτη
        System.out.println("Ο πωλητής " + username + " άλλαξε το πρόγραμμα του πελάτη " + client.getUsername() + " σε " + newPlan);
    }
}
