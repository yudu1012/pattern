public class Main {
    public static void main(String[] args) {
        Notifier basicNotifier = new BasicNotifier();
        Notifier emailNotifier = new EmailNotifier(basicNotifier);
        Notifier smsAndEmailNotifier = new SMSNotifier(emailNotifier);
        System.out.println("Basic Notifier:");
        basicNotifier.send("Hello!");
        System.out.println("\nEmail Notifier:");
        emailNotifier.send("Hello!");
        System.out.println("\nSMS and Email Notifier:");
        smsAndEmailNotifier.send("Hello!");
    }
}

