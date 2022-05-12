public class PreparingOrder implements iState{

    private static PreparingOrder insanta = null;

    private PreparingOrder(){}

    public static PreparingOrder getInsance(){

        if(insanta == null){

            insanta = new PreparingOrder();

        }

        return insanta;

    }

    @Override
    public void updateState(OrderContext orderContext) {

        System.out.println("Comanda pregatita!");
    }



}
