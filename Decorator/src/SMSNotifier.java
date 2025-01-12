public class SMSNotifier extends NotifierDecorator {
    public SMSNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        sendSmS(message);
    }
    public void sendSmS(String message){
        System.out.println("Sending SMS notification: " + message);
    }
}
