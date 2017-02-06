/**
 * This contains private fields that are initialised by a constructor and also by
 * get and set methods. It also contains a public method that is used to calculate
 * the invoice amount.
 *
 * Created by Lori on 2/6/2017.
 */
public class Invoice {

    private String partDescription;
    private int quantity;
    private double price;

    public Invoice() {
    }

    ;

    private Invoice(String partDescription, int quantity, int price) {
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.price = price;
    }

    public String getPartDescription() {
        return this.partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * This method is used to calculate the invoice amount.
     *
     * @return the invoice amount by multiplying the quantity but the price.
     */
    public double getInvoiceAmount() {
        int quantity = 0;
        double price = 0.0d;
        double invoiceAmount = 0.0d;

        quantity = getQuantity();
        price = getPrice();
        if (quantity < 0)
            setQuantity(0);
        else if (price < 0)
            setPrice(0.0);
        else
            invoiceAmount = quantity * price;
        return invoiceAmount;
    }
}
