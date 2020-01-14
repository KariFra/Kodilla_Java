package excercise.one;

public class OrderService {


    OrderProcessing orderProcessing;
    InformationService informationService;

    public OrderService(final OrderProcessing orderProcessing, final InformationService informationService) {

        this.orderProcessing = orderProcessing;
        this.informationService = informationService;
    }

    public OrderProcessing getOrderProcessing() {
        return orderProcessing;
    }

    public InformationService getInformationService() {
        return informationService;
    }

    public OrderDto orderEaluation (OrderRequest orderRequest){
        boolean isProcessed = orderProcessing.process(orderRequest);

        if(isProcessed){
            informationService.informAboutOrderPlacement(orderRequest.getFoodProducer());
            return new OrderDto(orderRequest.getFoodProducer(),orderRequest.getProduct(), orderRequest.getCreateTheOrder(),orderRequest.getRequestedDelivery(),true);
        } else{
            System.out.println("Order was not processed");
            return new OrderDto(orderRequest.getFoodProducer(),orderRequest.getProduct(), orderRequest.getCreateTheOrder(),orderRequest.getRequestedDelivery(),false);
        }
    }


}
