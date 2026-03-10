public class Transporte {

    private String idTransporte;
    private double combustible;
    private double capacidadCarga;

    public Transporte(String idTransporte, double combustible, double capacidadCarga) {
        this.idTransporte = idTransporte;
        this.combustible = combustible;
        this.capacidadCarga = capacidadCarga;
    }

    public String getIdTransporte() {
        return idTransporte;
    }

    public void setIdTransporte(String idTransporte) {
        this.idTransporte = idTransporte;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double nivel) {
        if (nivel < 0) {
            System.out.println("El nivel de combustible no puede ser negativo.");
            this.combustible = 0;
        } else if (nivel > 100) {
            System.out.println("El nivel de combustible no puede exceder el 100%.");
            this.combustible = 100;
        } else {
            this.combustible = nivel;
        }
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double carga) {
        if (carga < 0) {
            System.out.println("La capacidad de carga no puede ser negativa.");
        } else {
            this.capacidadCarga = carga;
        }
    }

    public void viajar(int distancia) {
        double combustibleNecesario = (distancia / 10.0);
        if (combustibleNecesario > combustible) {
            System.out.println("No hay suficiente combustible en el " + getIdTransporte() + " para viajar " + distancia + " km.");
        } else {
            combustible -= combustibleNecesario;
            System.out.println("El transporte " + getIdTransporte() + " ha viajado " + distancia + " km. Combustible restante: " + combustible + "%.");
        }
    }

}
