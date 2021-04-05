import java.io.*;
import lombok.Setter;
import lombok.Getter;

@Setter
@Getter
class Invoice {
    private String product_number;
    private String prodcut_description;
    private int quantity;
    private double pricePerItem;

    public Invoice(String product_number, String prodcut_description, int quantity, double pricePerItem) {
        this.setProduct_number(product_number);
        this.setProdcut_description(prodcut_description);
        this.setQuantity(quantity);
        this.setPricePerItem(pricePerItem);
    }

    public double Amount() {
        if (this.quantity < 0 || this.pricePerItem < 0) {
            return 0;
        }

        return this.quantity * this.pricePerItem;
    }
}

class InvoiceTest {
    public static void main(String[] args) throws IOException {
        Invoice invoice = new Invoice("x123", "jakiś produkt za 9,99", 121, 9.99);

        System.out.println(invoice.getProduct_number());
        System.out.println(invoice.getProdcut_description());
        System.out.println(invoice.getQuantity());
        System.out.println(invoice.getPricePerItem());
        System.out.println(invoice.Amount());
    }
}
