1. Project Overview
This project involves the architectural modernization of the Istanbul Aydin University (IAU) campus food delivery system. The original "legacy" code relied on a monolithic service with complex if-else chains for notifications. This refactored version implements professional design patterns to improve maintainability and scalability, allowing the system to handle thousands of daily orders across the Florya campus more efficiently.  

2. Design Patterns Used
Factory Method Pattern: We implemented a NotificationFactory to handle the creation of Email, Sms, and Push notification objects. This ensures that the CampusFoodOrderService does not need to know the specific implementation details of each notification type, making the system easy to extend with new channels like WhatsApp or Telegram.  

Singleton Pattern: The AppConfig class uses the Singleton pattern to provide a centralized point of access for global configuration data, such as the university name and the 25.0 TL delivery fee. This prevents data redundancy and ensures that every part of the application uses the same settings.  

3. Folder Structure
The project follows a standard Java directory structure to ensure reproducibility :  

src/: Contains all Java source code files, including the Notification interface, concrete classes, factory, and the configuration singleton.  

bin/: The output directory for compiled .class bytecode files.  

4. How to Compile
To compile the project on Windows using the Command Prompt or PowerShell, navigate to the root directory and run :
javac -d bin src/*.java  

5. How to Run
Once compiled, you can execute the application by running the main service class :
java -cp bin CampusFoodOrderService  

6. Expected Output
When the program runs successfully, the console will display the processed orders and their respective notification types :
Order for: Ali | Fee: 25.0TL
Sending EMAIL: Dear Ali, your Chicken Sandwich order is received by Istanbul Aydin University.
Order for: Zeynep | Fee: 25.0TL
Sending SMS: Hi Zeynep, your order is confirmed.
Order for: Omar | Fee: 25.0TL
Sending PUSH: Your Coffee order is being prepared!

7. Else an editor environment like vs code can be used. Add all files to vs code then run to get the same output. Strongly suggest vs code or similar environments for testing.
