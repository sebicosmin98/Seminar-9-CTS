public class Main {

    public static void main(String[] args){

                                                        // STATE

        ContextComanda o1 = new ContextComanda(1,"Pizza", PlasareComanda.getInstance());

        o1.nextState();

        o1.nextState();

        o1.nextState();


    }
}
