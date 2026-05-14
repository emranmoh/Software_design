/**
 * Concrete implementations for each channel
 */
class EmailNotification implements Notification {
    public void send(String studentName, String foodName) {
        System.out.println("Sending EMAIL: Dear " + studentName + ", your " + foodName + 
                           " order is received by " + AppConfig.getInstance().getUniversityName());
    }
}

