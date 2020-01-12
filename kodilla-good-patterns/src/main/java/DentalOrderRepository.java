import java.time.LocalDateTime;

public class DentalOrderRepository implements OrderRepository{
    @Override
    public boolean createOrder(User user, Purchase purchase, LocalDateTime when) {
        return false;
    }
}
