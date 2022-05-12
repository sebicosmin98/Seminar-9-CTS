public class ContextComanda {

    private int nrComanda;
    private String numeComanda;
    private iState stare;

    public ContextComanda(int nrComanda, String numeComanda, iState stare) {

        this.nrComanda = nrComanda;

        this.numeComanda = numeComanda;

        this.stare = stare;

    }

    public void setStare(iState stare) {
        this.stare = stare;
    }

    public void nextState(){
        stare.updateStare(this);
    }

}
