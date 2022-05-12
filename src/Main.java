public class Main {

    public static void main(String[] args){

                                                        // STATE

        OrderContext o1 = new OrderContext(1,"Pizza", PlacedOrder.getInstance());

        o1.nextState();

        o1.nextState();

        o1.nextState();


    }
}
