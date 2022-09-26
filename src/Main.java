import models.entities.Bank;

public class Main {
    public static void main(String[] args) {
        Bank.initializationBank();
        Bank.searchCliName("Kutman");
        Bank.searchAccount(10002);
        Bank.blockAccount(10002);
        Bank.newClient("Saadat","CreditCard",8574.0);
        Bank.unblockAccount(10002);
        Bank.printAllClient();
    }
}