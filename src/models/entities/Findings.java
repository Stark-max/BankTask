package models.entities;

public class Findings {
    public static void initialize(){
        Bank.initializationBank("Kutman", new String[]{"CreditCard","OwnCard","CreditCard"},new Double[]{-1258.0,7508.0,7845.0},3);
        Bank.initializationBank("Piter", new String[]{"OwnCard","CreditCard"},new Double[]{-8957.0,8574.0},2);
    }
}
