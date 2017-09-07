
package clase;
import java.util.Scanner;

public class PedidoPizza {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tipo, tamaño, opcion;
        Tipo tipoSel = null;
        String tamañoSel="";
        System.out.println("\"PROGRAMA PARA HACER PIZZA\"");
        do{
            System.out.println("¿Que Desea Hacer?"
                   + "\n1: Hacer Pedido"
                   + "\n2: Servir Pizza"
                   + "\n3: Salir");
            opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Seleccione el tipo de Pizza:"
                            + "\n1: Margarita"
                            + "\n2: Cuatro Queso"
                            + "\n3: Funghi");
                    tipo = sc.nextInt();
                    System.out.println("Seleccione el Tamaño"
                            + "\n1: Mediano"
                            + "\n2: Familiar");
                    tamaño = sc.nextInt();
                    switch(tipo){
                        case 1:
                            tipoSel = Tipo.MARGARITA;
                            break;
                        case 2:
                            tipoSel = Tipo.CUATROQUESO;
                            break;
                        case 3:
                            tipoSel = Tipo.FUNGHI;
                            break;
                        default:
                            System.out.println("Ingrese una Opcion valida.");
                    }
                    switch(tamaño){
                        case 1:
                            tamañoSel = "mediana";
                        case 2:
                            tamañoSel = "familiar";
                        default:
                            System.out.println("Ingrese una Opcion Valida");
                    }
                    Pizza nuevapizza = new Pizza(tamañoSel, tipoSel);
                    System.out.println("Pedido Realizado");
                    System.out.println(nuevapizza);
                    break;
                case 2:
                    System.out.println("Servir pizza");
                    break;
                default:
                    System.out.println("Ingrese una Opcion valida");
                    break;
            }
            System.out.println("Servidas: " + Pizza.getTotalServidas());
            System.out.println("Pedidas: " + Pizza.getTotalPedidas());
        }while(opcion!=3);
        
        /*Pizza p1 = new Pizza("mediana", Tipo.MARGARITA);
        Pizza p2 = new Pizza("familiar", Tipo.FUNGHI);
        p2.sirve();
        Pizza p3 = new Pizza("mediana", Tipo.CUATROQUESO);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        p2.sirve();
        System.out.println("pedidas: " + Pizza.getTotalPedidas());
        System.out.println("servidas: " + Pizza.getTotalServidas());*/
    }
    
}
