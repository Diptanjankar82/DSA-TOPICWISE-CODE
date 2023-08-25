public class Main {
    public static void main(String[] args) {
        BankAccunt myAcc = new BankAccunt();
        myAcc.username = "Diptanjan";
        myAcc.setPassword("dipefubeb");
    }
}

class BankAccunt {
    public String username;
    private String Password;
    public void setPassword(String pwd){
        Password = pwd;
    }
}