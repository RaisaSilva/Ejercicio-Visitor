package visitor.myVisitor;

public class ConcreateVisitor1 implements IVisitor {
    @Override
    public int visit(PaisArgentina paisArgentina, boolean cambio) {
        System.out.println("Visitando Argentina... ");
        paisArgentina.setMonto(1000);
        if (cambio) {
            int cambioRelizado = paisArgentina.getMonto()*7;
            System.out.println("****** cambiando de Dolar -> Peso Argentino ");
            System.out.println("El cambio de Dolar a peso Argentino es: "+cambioRelizado );
            return cambioRelizado;
        } else {
            int cambioRelizado = paisArgentina.getMonto()/5;
            System.out.println("****** cambiando de Peso Argentino -> Dolar ");
            System.out.println("El cambio de peso Argentino a Dolar es: "+cambioRelizado);
            return cambioRelizado;
        }


    }

    @Override
    public int visit(PaisBrazil paisBrazil, boolean cambio) {

        System.out.println("Visitando Brazil... ");
        paisBrazil.setMonto(5000);

        if (cambio) {
            int cambioRelizado = paisBrazil.getMonto()*5;
            System.out.println("****** cambiando de Dolar -> Reales ");
            System.out.println("El cambio de Dolar a Reales es: "+cambioRelizado);
            return cambioRelizado;
        } else {
            int cambioRelizado = paisBrazil.getMonto()/5;
            System.out.println("****** cambiando de Reales -> Dolar ");
            System.out.println("El cambio de Reales a Dolar es: "+cambioRelizado);
            return cambioRelizado;

        }
    }

    @Override
    public int visit(PaisBolivia paisBolivia, boolean cambio) {

        System.out.println("Visitando Bolivia...");
        paisBolivia.setMonto(5000);

        if (cambio) {
            int cambioRelizado = paisBolivia.getMonto()*7;
            System.out.println("****** cambiando de Dolar -> Boliviana ");
            System.out.println("El cambio de Dolar a Bolivianos es: "+cambioRelizado);

            return cambioRelizado;
        } else {
            int cambioRelizado = paisBolivia.getMonto()/7;
            System.out.println("****** cambiando de Boliviano -> Dolar ");
            System.out.println("El cambio de Bolivianos a Dolar: "+cambioRelizado);

            return cambioRelizado;

        }

    }
}
