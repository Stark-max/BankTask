package models.entities;

public class Account {
    private String type;
    private double balance =0.0;
    private boolean status;
    private int numAcc;

    public Account() {
    }

    public Account(String typeAcc, double balance, boolean status, int numAcc) {
        this.type = typeAcc;
        this.balance = balance;
        this.status = status;
        this.numAcc = numAcc;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result =1;
        long temp;
        temp =Double.doubleToLongBits(balance);
        result = prime * result + (int) (temp ^(temp >>>32));
        result = prime * result + numAcc;
        result = prime * result + (status ? 1231 : 1237);
        result = prime * result + ((type == null)? 0 : type.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Account other = (Account) obj;
        if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
            return false;
        if (numAcc != other.numAcc)
            return false;
        if (status != other.status)
            return false;
        if (type == null) {
            if (other.type != null)
                return false;
        } else if (!type.equals(other.type))
            return false;
        return true;
    }

    public String getType() {
        return type;
    }

    public void setTypeAccount(String type) {
        this.type = type;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getNumAcc() {
        return numAcc;
    }

    public void setNumAcc(int numAcc) {
        this.numAcc = numAcc;
    }
}
