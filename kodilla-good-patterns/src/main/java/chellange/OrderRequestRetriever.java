package chellange;

import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrieve(){
        User user = new User("Olivia","Newton");
        Purchase purchase = new Purchase("toothbrush",2);
        LocalDateTime when = LocalDateTime.of(2019,6,10,12,0);

         return new OrderRequest(user,purchase,when);
    }
}
