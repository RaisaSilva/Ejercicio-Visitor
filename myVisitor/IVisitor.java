package visitor.myVisitor;

public interface IVisitor {

    int visit(PaisArgentina paisArgentina, boolean cambio);
    int visit(PaisBrazil paisBrazil, boolean cambio);
    int visit(PaisBolivia paisBolivia, boolean cambio);

}
