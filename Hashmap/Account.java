public class Account {
    private String username;
    private String password;
    private Bank bank;
    private boolean locked = false; // Default no lock

    public Account(String username, String password, Bank bank) {
        this.username = username;
        this.password = password;
        this.bank = bank;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Bank getBank() {
        return bank;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }
}
