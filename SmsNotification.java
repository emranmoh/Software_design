class SmsNotification implements Notification {
    public void send(String studentName, String foodName) {
        System.out.println("Sending SMS: Hi " + studentName + ", your order is confirmed.");
    }
}