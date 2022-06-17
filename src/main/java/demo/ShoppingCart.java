package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkout(String status){


        System.out.println("Checkout Method from Shoppping Cart");
    }

    public int quantity() {
        return 2;
    }
}
