package excercise.one;

import java.time.LocalDateTime;

public class OrderDto {

    FoodProducer foodProducer;
    Product product;
    LocalDateTime createTheOrder;
    LocalDateTime requestedDelivery;
    boolean isOrdered;

    public OrderDto(FoodProducer foodProducer, Product product, LocalDateTime createTheOrder, LocalDateTime requestedDelivery, boolean isOrdered) {
        this.foodProducer = foodProducer;
        this.product = product;
        this.createTheOrder = createTheOrder;
        this.requestedDelivery = requestedDelivery;
        this.isOrdered = isOrdered;
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

    public boolean isOrdered() {
        return isOrdered;
    }
}
