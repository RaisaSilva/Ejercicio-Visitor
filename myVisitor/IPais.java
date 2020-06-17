package visitor.myVisitor;

public interface IPais {

    int accept(IVisitor visitor, boolean cambio);
    //true -> Doolar a moneda del país
    //false -> Moneda del país a Dolar
}
