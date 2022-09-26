package models.entities;

public class Display {
    public static void printAllClient(Client[] client) {
        int quantityClient=0;
        int quantityAcc=0;
        int n;
        double all=0.0;
        double plus=0.0;
        double minus=0.0;
        double balance;
        Account [] account;

        if (client != null) {
            client = Loading.clearClient(client);
            quantityClient = client.length;
            for(int i = 0; i<quantityClient; i++){
                if (client[i] != null) {
                    System.out.println("ИМЯ КЛИЕНТА: " + client[i].getName());
                    account = client[i].getAccounts();
                    account = Loading.clearAccount(account);
                    n=account.length;
                    all=0.0;
                    plus=0.0;
                    minus=0.0;
                    for (int j = 0; j<n; j++){
                        if (account[j]!=null) {
                            quantityAcc++;
                            balance=account[j].getBalance();
                            all = all + balance;
                            System.out.println(" "+quantityAcc+" счет - номер счета: "+account[j].getNumAcc()+", тип счета: "+account[j].getType()+", блокировка: "+account[j].isStatus()+  ", баланс: "+balance);
                            if(balance>0){
                                plus = plus+balance;
                            }
                            if(balance<0){
                                minus = minus+balance;
                            }
                        }
                    }
                    quantityAcc=0;
                    System.out.println("   Общий баланс на все счетах: "+ all+"; баланс на счетах с положительным остатком: "+plus+"; баланс на счетах с отрицательным остатком: "+minus);
                }

            }
            printLine();
        }
    }

    public static void printNewClient() {
        System.out.println("ЗАРЕГИСТРИРОВАН НОВЫЙ КЛИЕНТ: ");
    }

    public static void printClient(Client[] client, int clientId) {
        int quantityAcc=0;
        int n;
        double all=0.0;
        double plus=0.0;
        double minus=0.0;
        double balance;
        Account [] account;
        int numberCli;
        numberCli = clientId-1;
        if (client != null) {
            if (client[numberCli] != null) {
                System.out.println("Имя клиента: " + client[numberCli].getName());
                account = client[numberCli].getAccounts();
                account = Loading.clearAccount(account);
                n=account.length;
                all=0.0;
                plus=0.0;
                minus=0.0;
                for (int j = 0; j<n; j++){
                    if (account[j]!=null) {
                        quantityAcc++;
                        balance=account[j].getBalance();
                        all = all + balance;
                        System.out.println(" "+quantityAcc+" счет - номер счета: "+account[j].getNumAcc()+", тип счета: "+account[j].getType()+", блокировка: "+account[j].isStatus()+  ", баланс: "+balance);
                        if(balance>0){
                            plus = plus+balance;
                        }
                        if(balance<0){
                            minus = minus+balance;
                        }
                    }
                }
                quantityAcc=0;
                System.out.println("   Общий баланс на все счетах: "+ all+"; баланс на счетах с положительным остатком: "+plus+"; баланс на счетах с отрицательным остатком: "+minus);
            }

        }
    }

    public static void printLine() {
        System.out.println("---------------------------------------------------------------------------");
    }

    public static void printSearchName(String nameClient) {
        if (("").equals(nameClient)==false) {
            System.out.println("РЕЗУЛЬТАТЫ ПОИСКА ПО ЗАПРОСУ "+ "\""+nameClient+"\""+":");
        }
    }

    public static void searchName(Client[] client, String nameClient) {
        int quantityClient;
        int s=0;
        String name;
        if ((("").equals(nameClient)==false)&&(client!=null)) {
            client = Loading.clearClient(client);
            quantityClient = client.length;
            for(int i = 0; i<quantityClient; i++){
                name = client[i].getName();
                if (nameClient.equals(name)){
                    printClient (client, i+1);
                    s++;
                }

            }

        }
        if (s==0) {
            System.out.println("ПОИСК НЕ ДАЛ РЕЗУЛЬАТОВ");
        }
        printLine();
    }

    public static void searchAccount(int numberAcc) {
        if (numberAcc!=0) {
            System.out.println("РЕЗУЛЬТАТЫ ПОИСКА ПО НОМЕРУ СЧЕТА - "+ "\""+numberAcc+"\""+":");
        }
    }

    public static void printUnblock() {
        System.out.println("СЧЕТ РАЗБЛОКИРОВАН!!!");
    }
    public static void printBlock() {
        System.out.println("СЧЕТ ЗАБЛОКИРОВАН!!!");
    }

    public static void noBlock() {
        System.out.println("Счета не найден, блокировка не выполнена");
    }

    public static void printAccount(Client[] client, Account[] account, int i, int j) {
        if ((client!=null)&(account!=null)) {
            System.out.println("Владелец: "+client[i].getName()+", номер счета: "+account[j].getNumAcc()+", тип счета: "+account[j].getType()+", блокировка: "+account[j].isStatus()+ ", баланс: "+account[j].getBalance());
        }
    }


    public static void printNumAcc() {
        System.out.println("Счета с таким номером не найдено");
    }
}
