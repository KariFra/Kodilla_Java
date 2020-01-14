package excercise.one;

import java.time.LocalDateTime;

public class OrderRetriever {

    public OrderRequest retrieve() {
        FoodProducer foodProducer = new FoodProducer("ExtraFoodShop");
        Product product = new Product("Apples", 5);

        LocalDateTime createTheOrder = LocalDateTime.of(2019, 8, 25, 9, 30);
        LocalDateTime requestedDelivery = LocalDateTime.of(2019, 8, 30, 8, 00);

        return new OrderRequest(foodProducer, product, createTheOrder, requestedDelivery);
    }

}