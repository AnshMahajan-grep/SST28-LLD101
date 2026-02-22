import java.util.List;
public class Invoice {
    String invId;
    double subtotal;
    double taxPct;
    double tax;
    double discount;
    double total;
    List<InvoiceItem> items;

    public Invoice(String invId, double subtotal, double taxPct,double tax, double discount, double total,List<InvoiceItem> items) {
        this.invId = invId;
        this.subtotal = subtotal;
        this.taxPct = taxPct;
        this.tax = tax;
        this.discount = discount;
        this.total = total;
        this.items = items;
    }

    public String format() {

        StringBuilder out = new StringBuilder();
        out.append("Invoice# ").append(invId).append("\n");

        for (InvoiceItem item : items) {
            out.append(String.format("- %s x%d = %.2f\n", item.name, item.qty, item.lineTotal));
        }
        out.append(String.format("Subtotal: %.2f\n", subtotal));
        out.append(String.format("Tax(%.0f%%): %.2f\n", taxPct, tax));
        out.append(String.format("Discount: -%.2f\n", discount));
        out.append(String.format("TOTAL: %.2f\n", total));
        return out.toString();
    }
}