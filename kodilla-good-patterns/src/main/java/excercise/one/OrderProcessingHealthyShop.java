package excercise.one;

public class OrderProcessingHealthyShop implements OrderProcessing{


    @Override
    public boolean process(OrderRequest orderRequest) {
        boolean isProcessed = true;

        if (isProcessed){
            System.out.println("The order for HealthyShop was processed");
        } else {
            System.out.println("The order for HealthyShop was not processed");
        }
        return isProcessed;
    }
}
