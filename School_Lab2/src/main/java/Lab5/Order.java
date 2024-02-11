package Lab5;

import java.time.LocalDate;
import java.util.Date;

public class Order {
    private String orderNo;
    private Date orderDate;
    private int orderAmount;

    public String getOrderNo() {
        return orderNo;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public int getOrderAmount() {
        return orderAmount;
    }

    Order(String orderNo, Date orderDate, int orderAmount){
        this.orderNo = orderNo;
        this.orderDate = orderDate;
        this.orderAmount = orderAmount;
    }
}
