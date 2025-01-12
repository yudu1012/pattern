public class EmailNotifier extends NotifierDecorator{
    protected Notifier notifier;

    public EmailNotifier(Notifier notifier) {
        super(notifier);

    }

    @Override
    public void send(String message) {
        super.send(message);
        sendEmail(message);
    }
    public void sendEmail(String message){
        System.out.println("Sending email notification: " + message);
    }
}
