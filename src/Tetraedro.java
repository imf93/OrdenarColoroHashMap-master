/**
 * Created by imf_1 on 15/06/2016.
 */
public  class Tetraedro extends FiguraVolumetrica {



    public Tetraedro(double arista,long id,String color) {

        super(id,color,arista);


    }



    @Override
    public double calculaVolumen() {
       return(Math.sqrt(2)/12) * (Math.pow(arista,3));
    }
    public double calculaArea() {

        return(Math.sqrt(3)) * (Math.pow(arista,2));
    }


    @Override
    //devulve el maximo
    public String toString() {
        return "Tetraedro{" +
                "arista=" + arista +
                "id=" + id +
                '}';
    }
}
