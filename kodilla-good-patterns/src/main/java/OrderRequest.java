import java.time.LocalDateTime;

public class OrderRequest {

    User user;
    Purchase purchase;
    LocalDateTime when;

    public OrderRequest(User user, Purchase purchase, LocalDateTime when) {
        this.user = user;
        this.purchase = purchase;
        this.when = when;
    }

    public User getUser() {
        return user;
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public LocalDateTime getWhen() {
        return when;
    }
}
