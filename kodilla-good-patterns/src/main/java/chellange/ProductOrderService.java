package chellange;

public class ProductOrderService {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(InformationService informationService, OrderService orderService, OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.sell(orderRequest.getUser(), orderRequest.getPurchase(),
                orderRequest.getWhen());

        if (isOrdered) {
            informationService.informUser(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getPurchase(), orderRequest.getWhen());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            System.out.println("Oops. Something went wrong. Purchase was not processed");
            return new OrderDto(orderRequest.getUser(), false);

        }
    }
}
