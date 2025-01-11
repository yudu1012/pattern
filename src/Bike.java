import com.sun.jdi.connect.Transport;

public class Bike implements Transport {
    @Override
    public void deliver() {
        System.out.println("deliver Bike");
    }
}
