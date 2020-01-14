package chellange;

public class ProductOrderService {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService,
                          final OrderService orderService,
                          final OrderRepository orderRepository) {
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
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
