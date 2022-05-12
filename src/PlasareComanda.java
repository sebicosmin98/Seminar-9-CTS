public class PlasareComanda implements iState{

    private static PlasareComanda instanta = null;

    private PlasareComanda(){}

    public static PlasareComanda getInstance(){

        if(instanta == null){

            instanta = new PlasareComanda();

        }

        return instanta;
    }

    private void sendMessage(){

        System.out.println("Comanda plasata cu succes!");

    }


    private void changeContext(ContextComanda contextComanda){

        contextComanda.setStare(PreparareComanda.getInsance());

    }


    @Override
    public void updateStare(ContextComanda contextComanda) {

        sendMessage();

        changeContext(contextComanda);

    }



}
