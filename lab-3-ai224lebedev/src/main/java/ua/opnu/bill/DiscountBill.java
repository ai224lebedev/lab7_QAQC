package ua.opnu.bill;

import ua.opnu.java.inheritance.bill.Employee;
import ua.opnu.java.inheritance.bill.GroceryBill;
import ua.opnu.java.inheritance.bill.Item;

public class DiscountBill extends GroceryBill {
    private double discountAmount;
    private boolean isCustomerRegular;
    private int discountCount;

    public DiscountBill(Employee clerk, boolean isCustomerRegular) {
        super(clerk);
        this.isCustomerRegular = isCustomerRegular;
    }

    public int getDiscountCount() {
        return this.discountCount;
    }

    public double getDiscountAmount() {
        return this.discountAmount;
    }

    public double getDiscountPercent() {
        String formattedNumber = String.format("%.13f", 100 - getTotal() * 100 / super.getTotal()).replace(',', '.');
        String correctedString = formattedNumber.replace(',', '.');
        return Double.parseDouble(correctedString);
    }

    @Override
    public void add(Item i) {
        super.add(i);
        if (this.isCustomerRegular && i.getDiscount() > 0) {
            this.discountCount++;
            this.discountAmount += i.getDiscount();
        }
    }

    @Override
    public double getTotal() {
        return super.getTotal() - this.discountAmount;
    }
}
