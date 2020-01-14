package chellange;

import java.time.LocalDateTime;

public class DentalOrderService implements OrderService {
    @Override
    public boolean sell(User user, Purchase purchase, LocalDateTime when) {
        return false;
    }
}
