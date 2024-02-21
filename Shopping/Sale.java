package Shopping;

public class Sale {
    private Customer customer;
    private String date;
    private double serviceExpense;
    private double productExpense;

    public Sale(Customer customer, String date) {
        this.customer = customer;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense() {
        double TotalExpense;
        TotalExpense = (serviceExpense - serviceExpense * customer.getServiceMemberDiscount()) + (productExpense - productExpense * customer.getProductMemberDiscount());
        return  TotalExpense;
    }

    public void displayInfo() {
        System.out.println("Date of Sale: " + date);
        System.out.println("Customer Name: " + customer.getCustomerName());
        System.out.println("Service Expense: " + serviceExpense);
        System.out.println("Product Expense: " + productExpense);
        System.out.println("Total Expense: " + getTotalExpense());
    }
}
