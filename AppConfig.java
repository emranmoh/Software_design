/**
 * AppConfig (Singleton)
 * Holds our global settings like the 25.0 TL delivery fee.
 */
public class AppConfig {
    private static AppConfig instance;
    private String universityName = "Istanbul Aydin University";
    private double deliveryFee = 25.0;

    private AppConfig() {} // Private constructor so no one can use 'new' [10, 12]

    public static synchronized AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }

    public String getUniversityName() { return universityName; }
    public double getDeliveryFee() { return deliveryFee; }
}