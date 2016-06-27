import java.util.*;

/**
 * Created by imf_1 on 15/06/2016.
 */
//comprobacion de cambios
public class MapColores {
    static Map<String, List<Cubo>> coloresMap = new HashMap<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cantidad de cubos de color Rojo  ");
        int numero = sc.nextInt();
        System.out.println("Introduce la cantidad de cubos de color Amarillo  ");
        int numero2 = sc.nextInt();
        System.out.println("Introduce la cantidad de cubos de color Verde  ");
        int numero3 = sc.nextInt();
        System.out.println(coloresMap);
        ObtenerCubo(sc, numero, "Rojo");
        ObtenerCubo(sc, numero2, "Amarillo");
        ObtenerCubo(sc, numero3, "Verde");

        System.out.println(coloresMap);

    }



        private static void ObtenerCubo(Scanner sc,int numero,String color) {


            List<Cubo> cuboList = new ArrayList<>();
            for (int i = 1; i <= numero; i++) {
                System.out.println("Introduce los datos del cubo " + i);
                System.out.println("Introduce la arista del cubo:");
                double aristaCubo = sc.nextDouble();
                System.out.println("El color seleccionado es: " + color);

                Cubo cubo = new Cubo(aristaCubo, i + numero, color);

                cuboList.add(cubo);
            }
            coloresMap.put(color,cuboList);
        }

       /* private static void ObtenerOctaedro(Scanner sc,int numero,String color) {

            List<Octaedro> octaedroList=new ArrayList<>();

            for (int i = 1; i <= numero; i++) {
                System.out.println("Introduce los datos del Octaedro " + i);
                System.out.println("Introduce la arista del Octaedro:");
                double aristaOctaedro = sc.nextDouble();
                System.out.println("El color seleccionado es: " + color);

                Octaedro octaedro = new Octaedro(aristaOctaedro,i+numero*(2),color);
                octaedroList.add(octaedro);




            }
            coloresMap.put(color,octaedroList);





*/
            }













