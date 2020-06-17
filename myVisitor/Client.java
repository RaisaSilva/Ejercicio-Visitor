package visitor.myVisitor;

public class Client {

    public static void main (String []args  ){
        PaisArgentina paisArgentina = new PaisArgentina();
        PaisBrazil paisBrazil = new PaisBrazil();
        PaisBolivia paisBolivia = new PaisBolivia();

        ConcreateVisitor1 visitor= new ConcreateVisitor1();

        System.out.println("---------------------");
        paisArgentina.accept(visitor, true);

        System.out.println("---------------------");
        paisBrazil.accept(visitor, false);

        System.out.println("---------------------");
        paisBolivia.accept(visitor, false);







    }
}
