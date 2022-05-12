public class PlacedOrder implements iState{

    private static PlacedOrder instanta = null;

    private PlacedOrder(){}

    public static PlacedOrder getInstance(){

        if(instanta == null){

            instanta = new PlacedOrder();

        }
        else{

            return instanta;
        }

        return null;
    }

    private void sendMessage(){

        System.out.println("Comanda cu succes!");

    }


    private void changeContext(OrderContext orderContext){

        orderContext.setState(PreparingOrder.getInsance());

    }


    @Override
    public void updateState(OrderContext orderContext) {

        sendMessage();

        changeContext(orderContext);

    }



}
