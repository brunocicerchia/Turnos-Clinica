public class Clinica {
    private FilaPediatria pediatria;
    private FilaJovenesAdultos jovenesAdultos;
    private FilaAdultosMayores adultosMayores;

    public Clinica() {
        this.pediatria = new FilaPediatria();
        this.jovenesAdultos = new FilaJovenesAdultos();
        this.adultosMayores = new FilaAdultosMayores();
    }

    public void agregarTurno(String tipoFila, String riesgo, String id) {
        switch (tipoFila) {
            case "P":
                pediatria.agregarTurno(riesgo, id);
                break;
            case "J":
                jovenesAdultos.agregarTurno(riesgo, id);
                break;
            case "M":
                adultosMayores.agregarTurno(riesgo, id);
                break;
        }
    }

    public void asignarTurnos() {
        for (int i = 0; i < 6; i++) {
            Turno turno;
            String turnoId = null;
            String sala = "Sala " + (i + 1);

            if (i < 2) {
                turnoId = pediatria.obtenerSiguienteTurno();
            } else if (i < 4) {
                turnoId = jovenesAdultos.obtenerSiguienteTurno();
            } else {
                turnoId = adultosMayores.obtenerSiguienteTurno();
            }

            if (turnoId != null) {
                turno = new Turno(turnoId, sala);
                System.out.println(turno);
            }
        }
    }
}