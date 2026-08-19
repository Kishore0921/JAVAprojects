package DAY3;

public class Product {
        String PN; int PID; double PP;
        Product (String PN, int PID, double PP)
        {
            this.PN = PN;
            this.PID = PID;
            this.PP = PP;
        }
        public static void main(String[] args){
            DAY3.Product p1 = new DAY3.Product("Watch", 123, 65000);
            System.out.println("Name of Product: "+ p1.PN);
            System.out.println("ID of Product: "+ p1.PID);
            System.out.println("Price of Product: "+ p1.PP);
        }
}
