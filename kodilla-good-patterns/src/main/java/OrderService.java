import java.time.LocalDateTime;

public interface OrderService {
    boolean rent (User user, Purchase purchase, LocalDateTime when);
}
