/**
 * Created by professor on 16/06/2016.
 */
public class Octaedro extends FiguraVolumetrica {



    public Octaedro(double arista, long id,String color) {
        super(id,color,arista);
        this.arista = arista;
    }

    @Override
    public double calculaVolumen() {
        return (Math.sqrt(2)) / 3 * (Math.pow(arista, 3));

    }

    public double calculaArea() {
        return (Math.sqrt(3)) * (2) * (Math.pow(arista, 2));

    }
}




