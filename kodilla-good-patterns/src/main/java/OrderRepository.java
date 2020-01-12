import java.time.LocalDateTime;

public interface OrderRepository {
    boolean createOrder(User user, Purchase purchase, LocalDateTime when);
}
