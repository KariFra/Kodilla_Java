package excercise.one;

public class Application {
    public static void main(String[] args) {

        OrderRetriever orderRetriever = new OrderRetriever();
        OrderRequest orderRequest = orderRetriever.retrieve();
        OrderService orderService = new OrderService(new OrderProcessingExtraFoodShop(), new MailService());
        orderService.orderEaluation(orderRequest);
    }
}
