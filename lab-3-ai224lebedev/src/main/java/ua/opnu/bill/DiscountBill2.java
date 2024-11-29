package ua.opnu.bill;

import ua.opnu.java.inheritance.bill.Employee;

public class DiscountBill2 extends DiscountBill {
    public DiscountBill2(Employee clerk, boolean isCustomerRegular) {
        super(clerk, isCustomerRegular);
    }
}
