package excercise.one;

public class OrderProcessingHealthyShop implements OrderProcessing{

    public boolean calculatingNumberOfPackages(OrderRequest orderRequest){
        int productWeight = orderRequest.getProduct().amount;
        if (productWeight<10){
            System.out.println("We need one box.");
        } else if (productWeight>10){
            System.out.println("We need two boxes.");
        } else {
            System.out.println("Too much");
        }
        return true;
    }

    @Override
    public boolean process(OrderRequest orderRequest) {
        boolean isProcessed = calculatingNumberOfPackages(orderRequest);

        if (isProcessed){
            System.out.println("The order for HealthyShop was processed");
        } else {
            System.out.println("The order for HealthyShop was not processed");
        }
        return isProcessed;
    }
}
