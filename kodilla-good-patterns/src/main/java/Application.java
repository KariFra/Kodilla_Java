public class Application {
    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

         ProductOrderService productOrderService = new ProductOrderService(new MailService(),new DentalOrderService(), new DentalOrderRepository());
        productOrderService.process(orderRequest);

    }
}
