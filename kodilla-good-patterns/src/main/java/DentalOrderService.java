import java.time.LocalDateTime;

public class DentalOrderService implements OrderService {
    @Override
    public boolean rent(User user, Purchase purchase, LocalDateTime when) {
        return false;
    }
}
