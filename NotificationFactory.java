/**
 * NotificationFactory (The Creator)
 */
class NotificationFactory {
    public static Notification createNotification(String type) {
        if (type == null) return null;
        // Using switch to handle types in one place [6, 17]
        switch (type.toUpperCase()) {
            case "EMAIL": return new EmailNotification();
            case "SMS": return new SmsNotification();
            case "PUSH": return new PushNotification();
            default: return null;
        }
    }
}