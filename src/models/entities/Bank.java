package models.entities;

public class Bank {
    private static Client [] client;
    private static Account [] account;
    private static int numAcc =10000;
    private static int clientId =0;
    private static int maxList = 5;

    public static void  initializationBank(){

        client = new Client [maxList];
        client[clientId] = new Client();
        client[clientId].setName("Kutman");
        account = new Account[5];
        account[0] = new CreditCard();
        numAcc++;
        account[0].setNumAcc(numAcc);
        account[0].setBalance(-1525.0);
        account[1] = new OwnCard();
        numAcc++;
        account[1].setNumAcc(numAcc);
        account[1].setBalance(7508.0);
        account[2] = new OwnCard();
        numAcc++;
        account[2].setNumAcc(numAcc);
        account[2].setBalance(7845.0);
        client[clientId].setAccounts(account);
        clientId++;

        client[clientId] = new Client();
        client[clientId].setName("Piter");
        account = new Account[5];
        account[0] = new CreditCard();
        numAcc++;
        account[0].setNumAcc(numAcc);
        account[0].setBalance(-8957.0);
        account[1] = new OwnCard();
        numAcc++;
        account[1].setNumAcc(numAcc);
        account[1].setBalance(8574.0);
        client[clientId].setAccounts(account);
        Display.printAllClient(client);
        clientId++;
    }

    public static void printAllClient(){
        Display.printAllClient(client);
    }
    public static void newClient(String Name, String typeAccount, double balance ){
       /* int size= client.length+1;
        if ((size - clientId)<NUMBER) {
            client = Loading.IncreasArr(client);
        }else {
            client[clientId] = new Client();
        }*/
        client[clientId]=new Client();
        client[clientId].setName(Name);
        account = new Account[5];
        if (("CreditCard").equals(typeAccount)) {
            account[0] = new CreditCard();
        } else {
            if (("OwnCard").equals(typeAccount)) {
                account[0] = new OwnCard();
            }  else {
                account[0] = new OwnCard();
            }
        }
        account[0].setBalance(balance);
        numAcc++;
        account[0].setNumAcc(numAcc);
        client[clientId].setAccounts(account);
        clientId++;
        Display.printNewClient();
        Display.printClient(client, clientId);
        // Display.printAllClient(client);
        Display.printLine();
    }
    public static void searchCliName(String nameClient) {
        if (("").equals(nameClient)==false) {
            Display.printSearchName(nameClient);
            Display.searchName(client, nameClient);
        }

    }
    public static void searchAccount(int numberAccount){
        Display.searchAccount(numberAccount);
        Loading.searchAccount(client, numberAccount);
    }
    public static void blockAccount(int numberAccount){
        if (numberAccount>0) {
            Loading.blockAccount(client, numberAccount);
        }
    }

    public static void unblockAccount(int numberAcc) {
        if (numberAcc>0) {
            Loading.unblockAccount(client, numberAcc);
        }
    }
}

