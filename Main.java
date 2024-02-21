import Shopping.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("======== Exercise 1 =======");

        ArrayStore.ArrayStoreFun();

        System.out.println("\n\n======== End Exercise 1 =======\n\n");
        System.out.println("======== Exercise 2 =======\n\n");

        Customer customer = new Customer("Van Soriya", "Premium");
        Sale sale = new Sale(customer, "2024-02-21");
        sale.setServiceExpense(200.0);
        sale.setProductExpense(150.0);
        sale.displayInfo();
        System.out.println("\n\n======== End Exercise 2 =======\n\n");

    }
}