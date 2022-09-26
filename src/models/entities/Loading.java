package models.entities;

public class Loading {
    /*public static Client []  IncreasArr( Client [] client ){
        int length;
        length = client.length;
        Client [] client2 = new Client [length+7];
        for (int i = 0; i<length; i++){
            client2[i]=client[i];
        }

        return client2;
    }*/
    public static Client []  clearClient(Client [] client){
        int size;
        int g=1;
        size = client.length;

        if (client != null) {
            for (int i = 1; i<size; i++ ) {
                if ((client[i]==null)&&(client[i-1]==null)) {
                    g=i-1;
                    break;
                }
            }
            Client [] client2 = new Client [g];
            for (int i = 0; i<g; i++ ) {
                client2[i]=client[i];
            }
            client=client2;
        }
        return client;
    }
    public static Account[]  clearAccount(Account [] account){
        int size;
        int g=1;
        size = account.length;

        if (account != null) {
            for (int i = 1; i<size; i++ ) {
                if ((account[i]==null)&&(account[i-1]==null)) {
                    g=i-1;
                    break;
                }
            }
            Account[] account2 = new Account [g];
            for (int i = 0; i<g; i++ ) {
                account2[i]=account[i];
            }
            account=account2;
        }
        return account;
    }
    public static void searchAccount(Client[] client, int numberAccount){
        int quantityClient=0;
        int n;
        int search=0;
        int namberAcc;
        Account [] account;

        if (client != null) {
            client = clearClient(client);
            quantityClient = client.length;
            for(int i = 0; i<quantityClient; i++){
                if (client[i] != null) {
                    account = client[i].getAccounts();
                    account = Loading.clearAccount(account);
                    n=account.length;
                    for (int j = 0; j<n; j++){
                        if (account[j]!=null) {
                            namberAcc=account[j].getNumAcc();
                            if (namberAcc==numberAccount) {
                                search++;
                                Display.printAccount(client, account, i, j);
                            }
                        }
                    }
                }

            }

        }
        if (search==0){
            Display.printNumAcc();
        }
        Display.printLine();
    }
    public static void blockAccount(Client[] client, int numberAccount){
        int quantityClient=0;
        int n;
        int search=0;
        int numberAcc;
        Account [] account;

        if (client != null) {
            client = clearClient(client);
            quantityClient = client.length;
            for(int i = 0; i<quantityClient; i++){
                if (client[i] != null) {
                    account = client[i].getAccounts();
                    account = Loading.clearAccount(account);
                    n=account.length;
                    for (int j = 0; j<n; j++){
                        if (account[j]!=null) {
                            numberAcc=account[j].getNumAcc();
                            if (numberAcc==numberAccount) {
                                search++;
                                account[j].setStatus(true);
                                Display.printAccount(client, account, i, j);
                            }
                        }
                    }
                }

            }

        }
        if (search==0){
            Display.noBlock();
        } else {
            Display.printBlock();
        }
        Display.printLine();
    }

    public static void unblockAccount(Client[] client, int numberAcc) {
        int quantityClient=0;
        int n;
        int search=0;
        int numberA;
        Account [] account;

        if (client != null) {
            client = clearClient(client);
            quantityClient = client.length;
            for(int i = 0; i<quantityClient; i++){
                if (client[i] != null) {
                    account = client[i].getAccounts();
                    account = Loading.clearAccount(account);
                    n=account.length;
                    for (int j = 0; j<n; j++){
                        if (account[j]!=null) {
                            numberA=account[j].getNumAcc();
                            if (numberA==numberAcc) {
                                search++;
                                account[j].setStatus(false);
                                Display.printAccount(client, account, i, j);
                            }
                        }
                    }
                }

            }

        }
        if (search==0){
            Display.noBlock();
        } else {
            Display.printUnblock();
        }
        Display.printLine();
    }
}
