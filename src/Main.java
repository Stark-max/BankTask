import models.entities.Bank;
import models.entities.Findings;

public class Main {
    public static void main(String[] args) {
        Findings.initialize();
        Bank.searchCliName("Kutman");
        Bank.searchAccount(10002);
        Bank.blockAccount(10002);
        Bank.initClient("Saadat","CreditCard",8574.0);
        Bank.unblockAccount(10002);
        Bank.printAllClient();
    }
}