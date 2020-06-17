package visitor.myVisitor;

public class PaisBrazil implements IPais {
    private int monto;


    @Override
    public int accept(IVisitor visitor, boolean cambio) {
        return visitor.visit(this, cambio);
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }
}
