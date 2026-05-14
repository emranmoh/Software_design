class PushNotification implements Notification {
    public void send(String studentName, String foodName) {
        System.out.println("Sending PUSH: Your " + foodName + " is being prepared!");
    }
}