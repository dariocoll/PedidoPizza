
package clase;

/**
 *
 * @author Dario    
 * @version 0.1
 */
public class Pizza {
    /*Atributos de clases*/
    private static int totalPedidas = 0;
    private static int totalServidas = 0;
    
    /*
    *tamaños posibles: 
    */
    
    private String tamaño;
    private Tipo tipo;
    
    /*
    estado false = pedida/ true = servida
    */
    
    private boolean estado;
    
    public Pizza(){
        this.estado = false;
        this.tamaño = "mediana";
        this.tipo = Tipo.MARGARITA;
        
    }
    
    public Pizza(String tamaño, Tipo tipo){
        this.estado = false;
        this.tamaño = tamaño;
        this.tipo = tipo;
    }

    /**
     * @return the totalPedidas
     */
    public static int getTotalPedidas() {
        return totalPedidas;
    }

    /**
     * @return the totalServidas
     */
    public static int getTotalServidas() {
        return totalServidas;
    }

    /**
     * @return the tamaño
     */
    public String getTamaño() {
        return tamaño;
    }

    /**
     * @return the tipo
     */
    public Tipo getTipo() {
        return tipo;
    }

    /**
     * @return the estado
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     * @param aTotalPedidas the totalPedidas to set
     */
    public static void setTotalPedidas(int aTotalPedidas) {
        totalPedidas = aTotalPedidas;
    }

    /**
     * @param aTotalServidas the totalServidas to set
     */
    public static void setTotalServidas(int aTotalServidas) {
        totalServidas = aTotalServidas;
    }

    /**
     * @param tamaño the tamaño to set
     */
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public String toString(){
        String estadoString = "";
        if(estado){
            estadoString = "servida";
        }else{
            estadoString = "pedidas";
        }
        return ("pizza " + tipo + " " + tamaño + " " + estadoString);
                
    }
    
    public void sirve(){
        if(estado){
            System.out.println("Esta Pizza ya esta servida");
        }else{
            this.setEstado(true);
            
        }
    }
    
}
