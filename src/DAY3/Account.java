package DAY3;

public class Account {
    String name;
    int accno;
    double balance;
    Account (String name,int accno, double balance ){ this.name=name; this.accno=accno; this.balance=balance ;}
    void display(){System.out.println("ACC holder name is "+this.name);
    System.out.println("Account no is "+this.accno);
    System.out.println("Balance is"+this.balance);}

    public static void main(String[] args){
        new Account("Hari", 123, 55000).display();

    }
}
