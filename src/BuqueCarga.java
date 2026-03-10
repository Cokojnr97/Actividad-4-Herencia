public class BuqueCarga extends Transporte {

    private int cantidadContenedores;

    public BuqueCarga(String idTransporte, double combustible, double capacidadCarga, int cantidadContenedores) {
        super(idTransporte, combustible, capacidadCarga);
        this.cantidadContenedores = cantidadContenedores;
    }
    
    public int getCantidadContenedores() {
        return cantidadContenedores;
    }

    public void setCantidadContenedores(int cantidadContenedores) {
        this.cantidadContenedores = cantidadContenedores;
    }

    public void atracarEnPuerto() {
        System.out.println("El buque de carga con ID " + getIdTransporte() + " ha atracado en el puerto con " + cantidadContenedores + " contenedores, y está listo para descargar.");
    }

    public void mostrarDatos() {
        System.out.println("ID del Buque de Carga: " + getIdTransporte());
        System.out.println("Nivel de Combustible: " + getCombustible() + "%");
        System.out.println("Capacidad de Carga: " + getCapacidadCarga() + " toneladas");
        System.out.println("Cantidad de Contenedores: " + cantidadContenedores);    
    }
}
