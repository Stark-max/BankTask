package models.entities;

import javax.smartcardio.Card;

public class Bank {
    /* public static final int NUMBER = 3;*/
    private static int maxList = 5;
    private static Client[] client =new Client[maxList];
    private static Account[] account;
    private static int numAcc = 10000;
    private static int clientId = 0;


    public static void initializationBank(String name, String[] type, Double[] balance, int quantity) {
        client[clientId] = new Client();
        client[clientId].setName(name);
        account = new Account[5];
        for (int i = 0; i <= quantity-1; i++) {
            if (("CreditCard").equals(type[i])) {
                account[i] = new CreditCard();
                account[i].setBalance(balance[i]);
                numAcc++;
                account[i].setNumAcc(numAcc);
                client[clientId].setAccounts(account);
            } else if (("OwnCard").equals(type[i])) {
                account[i] = new OwnCard();
                account[i].setBalance(balance[i]);
                numAcc++;
                account[i].setNumAcc(numAcc);
                System.out.println(clientId);
                client[clientId].setAccounts(account);

            }
        }
        clientId++;
    }

    public static void printAllClient() {
        Display.printAllClient(client);
    }

    public static void initClient(String Name, String typeAccount, double balance) {
       /* int size= client.length+1;
        if ((size - clientId)<NUMBER) {
            client = Loading.IncreasArr(client);
        }else {
            client[clientId] = new Client();
        }*/
        client[clientId] = new Client();

        client[clientId].setName(Name);
        account = new Account[5];
        if (("CreditCard").equals(typeAccount)) {
            account[0] = new CreditCard();
        } else {
            if (("OwnCard").equals(typeAccount)) {
                account[0] = new OwnCard();
            } else {
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
        if (("").equals(nameClient) == false) {
            Display.printSearchName(nameClient);
            Display.searchName(client, nameClient);
        }

    }

    public static void searchAccount(int numberAccount) {
        Display.searchAccount(numberAccount);
        Loading.searchAccount(client, numberAccount);
    }

    public static void blockAccount(int numberAccount) {
        if (numberAccount > 0) {
            Loading.blockAccount(client, numberAccount);
        }
    }

    public static void unblockAccount(int numberAcc) {
        if (numberAcc > 0) {
            Loading.unblockAccount(client, numberAcc);
        }
    }
}

