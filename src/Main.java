public class Main {
    public static void main(String[] args) {
        Clinica clinica = new Clinica();

        // Añadir 18 turnos de prueba
        clinica.agregarTurno("P", "A", "PA1");
        clinica.agregarTurno("P", "B", "PB1");
        clinica.agregarTurno("P", "A", "PA2");
        clinica.agregarTurno("P", "B", "PB2");
        clinica.agregarTurno("J", "A", "JA1");
        clinica.agregarTurno("J", "B", "JB1");
        clinica.agregarTurno("J", "A", "JA2");
        clinica.agregarTurno("J", "B", "JB2");
        clinica.agregarTurno("M", "A", "MA1");
        clinica.agregarTurno("M", "B", "MB1");
        clinica.agregarTurno("M", "A", "MA2");
        clinica.agregarTurno("M", "B", "MB2");
        clinica.agregarTurno("P", "A", "PA3");
        clinica.agregarTurno("P", "B", "PB3");
        clinica.agregarTurno("J", "A", "JA3");
        clinica.agregarTurno("J", "B", "JB3");
        clinica.agregarTurno("M", "A", "MA3");
        clinica.agregarTurno("M", "B", "MB3");

        // Asignar y mostrar turnos
        for(int i = 0; i < 4; i++) {
            System.out.println("Siguientes turnos");
            clinica.asignarTurnos();
        }
    }
}