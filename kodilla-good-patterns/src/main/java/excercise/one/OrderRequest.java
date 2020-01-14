package excercise.one;

import java.time.LocalDateTime;

public class OrderRequest {

    FoodProducer foodProducer;
    Product product;
    LocalDateTime createTheOrder;
    LocalDateTime requestedDelivery;

    public OrderRequest(FoodProducer foodProducer, Product product, LocalDateTime createTheOrder, LocalDateTime requestedDelivery) {
        this.foodProducer = foodProducer;
        this.product = product;
        this.createTheOrder = createTheOrder;
        this.requestedDelivery = requestedDelivery;
    }

    public FoodProducer getFoodProducer() {
        return foodProducer;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getCreateTheOrder() {
        return createTheOrder;
    }

    public LocalDateTime getRequestedDelivery() {
        return requestedDelivery;
    }
}
