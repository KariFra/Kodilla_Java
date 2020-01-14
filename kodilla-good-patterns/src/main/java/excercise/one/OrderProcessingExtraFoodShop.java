package excercise.one;

import java.time.LocalDateTime;

public class OrderProcessingExtraFoodShop implements OrderProcessing {



    public boolean informTheMagazine(OrderRequest orderRequest){
        Product product = orderRequest.getProduct();
        LocalDateTime deliveryTime = orderRequest.getRequestedDelivery();
      return true;
    }

    @Override
    public boolean process(OrderRequest orderRequest) {
      boolean isProcessed = informTheMagazine(orderRequest);

      if (isProcessed){
          System.out.println("The order for ExtraFoodShop was processed");
      } else {
          System.out.println("The order for ExtraFoodShop was not processed");
      }
       return isProcessed;
    }



}
