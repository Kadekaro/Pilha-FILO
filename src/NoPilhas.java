public class NoPilhas {
    private int dado;

    private NoPilhas referenciaNoPilhas = null;
    public NoPilhas(){
    }

    public NoPilhas(int dado){
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public NoPilhas getReferenciaNoPilhas() {
        return referenciaNoPilhas;
    }

    public void setReferenciaNoPilhas(NoPilhas referenciaNoPilhas) {
        this.referenciaNoPilhas = referenciaNoPilhas;
    }

    @Override
    public String toString() {
        return "NoPilhas{" +
                "dado=" + dado +
                '}';
    }
}
