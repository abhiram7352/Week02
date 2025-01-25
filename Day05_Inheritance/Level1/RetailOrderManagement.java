package Day05_Inheritance.Level1;


class Order {
    // Attribute to store order ID and store order date
    int orderId;
    String orderDate;

    // Constructor to initialize order ID and date
    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to get the current status of the order
    String getOrderStatus() {
        return "Order placed";
    }

    // Method to display order details
    void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }
}

class ShippedOrder extends Order {
    // Attribute to store tracking number
    int trackingNumber;

    // Constructor to initialize order ID, date, and tracking number
    ShippedOrder(int orderId, String orderDate, int trackingNumber) {
        // Call to superclass constructor
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    // Overridden method to get the current status of the order
    @Override
    String getOrderStatus() {
        return "Order shipped";
    }

    // Overridden method to display order details including tracking number
    @Override
    void displayOrderDetails() {
        // Call to superclass method to display common details
        super.displayOrderDetails();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}

class DeliveredOrder extends ShippedOrder {
    // Attribute to store delivery date
    String deliveryDate;

    // Constructor to initialize order ID, date, tracking number, and delivery date
    DeliveredOrder(int orderId, String orderDate, int trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber); // Call to superclass constructor
        this.deliveryDate = deliveryDate;
    }

    // Overridden method to get the current status of the order

    String getOrderStatus() {
        return "Order delivered";
    }

    // Overridden method to display order details including delivery date
    void displayOrderDetails() {
        // Call to superclass method to display common details
        super.displayOrderDetails();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}

public class RetailOrderManagement {
    public static void main(String[] args) {
        // Creating Order object
        Order order = new Order(1, "10-01-2025");

        // Creating ShippedOrder object
        ShippedOrder shippedOrder = new ShippedOrder(1, "10-01-2025", 3);

        // Creating DeliveredOrder object
        DeliveredOrder deliveredOrder = new DeliveredOrder(1, "10-01-2025", 3, "14-01-2025");

        // Displaying details and status of Order object
        System.out.println("Order details:");
        order.displayOrderDetails();
        System.out.println("Order Status: " + order.getOrderStatus());

        System.out.println();

        // Displaying details and status of ShippedOrder object
        System.out.println("Shipped Order Details:");
        shippedOrder.displayOrderDetails();
        System.out.println("Order Status: " + shippedOrder.getOrderStatus());

        System.out.println();

        // Displaying details and status of DeliveredOrder object
        System.out.println("Delivery Details:");
        deliveredOrder.displayOrderDetails();
        System.out.println("Delivery Status: " + deliveredOrder.getOrderStatus());
    }
}
