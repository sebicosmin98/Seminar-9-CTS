public class PreparareComanda implements iState{

    private static PreparareComanda insanta = null;

    private PreparareComanda(){}

    public static PreparareComanda getInsance(){

        if(insanta == null){

            insanta = new PreparareComanda();

        }

        return insanta;

    }

    @Override
    public void updateStare(ContextComanda contextComanda) {

        System.out.println("Comanda pregatita!");
    }



}
