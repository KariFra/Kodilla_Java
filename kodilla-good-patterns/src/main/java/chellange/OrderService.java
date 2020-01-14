package chellange;

import java.time.LocalDateTime;

public interface OrderService {
    boolean sell (User user, Purchase purchase, LocalDateTime when);
}
