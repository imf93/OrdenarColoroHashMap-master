public abstract class FiguraVolumetrica {
    protected long id;
    private String color;
    protected double arista;
   //private String color;

    public FiguraVolumetrica(long id, String color, double arista){

        this.id = id;
       this.color=color;
        this.arista=arista;

    }
    public FiguraVolumetrica(long id,double arista,String color) {

        this.id=id;
        this.color = "blue";
        this.arista=arista;

    }
    public long getId() {
        return id;
    }
    public abstract double calculaVolumen();
    public abstract double calculaArea();

    public String getColor() {
        return color;
    }
}
