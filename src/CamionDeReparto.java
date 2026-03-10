public class CamionDeReparto extends Transporte {

    private boolean tieneRefrigeracion;

    public CamionDeReparto(String idTransporte, double combustible, double capacidadCarga, boolean tieneRefrigeracion) {
        super(idTransporte, combustible, capacidadCarga);
        this.tieneRefrigeracion = tieneRefrigeracion;
    }

    public boolean isTieneRefrigeracion() {
        return tieneRefrigeracion;
    }

    public void setTieneRefrigeracion(boolean tieneRefrigeracion) {
        this.tieneRefrigeracion = tieneRefrigeracion;
    }

    @Override
    public void viajar(int distancia) { 
        double combustibleNecesario = (distancia / 10.0);
        if (tieneRefrigeracion) {
            combustibleNecesario *= 2; 
        }
        if (combustibleNecesario > getCombustible()) {
            System.out.println("No hay suficiente combustible en el " + getIdTransporte() + " para viajar " + distancia + " km.");
        } else {
            setCombustible(getCombustible() - combustibleNecesario);
            System.out.println("El camión de reparto " + getIdTransporte() + " ha viajado " + distancia + " km. Combustible restante: " + getCombustible() + "%.");
        }
    }

}
