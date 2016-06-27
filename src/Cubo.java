/**
 * Created by imf_1 on 15/06/2016.
 */

    public  class Cubo extends FiguraVolumetrica {

    public Cubo (double arista,long id,String color) {
        super(id,color,arista);

    }




    @Override
    public double calculaVolumen() {
        return (Math.pow(arista,3));
    }

    @Override
    public double calculaArea() {
        return (6*(Math.pow(arista,2)));
    }

    public double calculaDiagonal() {
        return(Math.sqrt(3)) * arista;

    }

    @Override
    public String toString() {
        return "Cubo{" +
                "arista=" + arista +
                "id=" + id +
                '}';
    }
}

