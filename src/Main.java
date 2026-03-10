public class Main {
    public static void main(String[] args) throws Exception {
        
        CamionDeReparto camion1 = new CamionDeReparto("CAMION-001", 80.0, 5000.0, true);

        BuqueCarga buque1 = new BuqueCarga("BUQUE-001", 90.0, 20000.0, 50);

        //Demonstración de polimorfismo creando un array que se llame flota y agregue al camion1 y al buque1, luego usando un bucle for para que ambos viajen 100 km.
        Transporte[] flota = new Transporte[2];
        flota[0] = camion1;
        flota[1] = buque1;
        for (Transporte transporte : flota) {
            transporte.viajar(100);
        }
        // Llamada al método atracarEnPuerto del buque1 para mostrar su funcionamiento.
        buque1.atracarEnPuerto();
        // Llamada al método mostrarDatos del buque1 para mostrar su información completa.
        buque1.mostrarDatos();

        // Prueba de fuego intentando usar setCombustible con un valor negativo de -20
        camion1.setCombustible(-20.0);
        System.out.println("Nivel de combustible: " + camion1.getCombustible() + "%"); 
    }
}
