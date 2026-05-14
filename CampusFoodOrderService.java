/**
 * The Final Service Layer
 */
public class CampusFoodOrderService {
    public void placeOrder(String studentName, String foodName, String notificationType) {
        AppConfig config = AppConfig.getInstance();
        System.out.println("Order for: " + studentName + " | Fee: " + config.getDeliveryFee() + "TL");

        Notification n = NotificationFactory.createNotification(notificationType);
        if (n!= null) {
            n.send(studentName, foodName);
        } else {
            System.out.println("Error: We don't support " + notificationType + " yet.");
        }
    }

    public static void main(String[] args) {
        CampusFoodOrderService service = new CampusFoodOrderService();
        service.placeOrder("Ali", "Chicken Sandwich", "EMAIL");
        service.placeOrder("Zeynep", "Vegetarian Pizza", "SMS");
    }
}