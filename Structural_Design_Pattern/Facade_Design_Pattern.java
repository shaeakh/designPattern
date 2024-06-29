package Structural_Design_Pattern;

class Restaurant{
    public void prepare_order(){

    }
}

class DeliveryTeam{
    public void assignDeliveryBoy(){

    }
}

class DeliveryBoy{
    public void pickUpOrder(){

    }
    public void Deliver_order(){
        
    }
}

class zomato_facade{
    private Restaurant restaurant;
    private DeliveryTeam deliveryTeam;
    private DeliveryBoy deliveryBoy;

    public void placeOrder(){
        restaurant.prepare_order();
        deliveryTeam.assignDeliveryBoy();
        deliveryBoy.pickUpOrder();
        deliveryBoy.Deliver_order();
    }
}

public class Facade_Design_Pattern {
    public static void main(String[] args) {
        
    }
}
