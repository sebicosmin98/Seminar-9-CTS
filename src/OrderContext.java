public class OrderContext {

    private int nOrder;
    private String name;
    private iState state;

    public OrderContext(int nOrder, String name, iState state) {

        this.nOrder = nOrder;

        this.name = name;

        this.state = state;

    }

    public void setState(iState state) {
        this.state = state;
    }

    public void nextState(){
        state.updateState(this);
    }

}
