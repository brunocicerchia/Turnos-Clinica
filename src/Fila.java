class Fila {
    protected PilaTF altoRiesgo;
    protected PilaTF bajoRiesgo;

    public Fila() {
        this.altoRiesgo = new PilaTF();
        this.bajoRiesgo = new PilaTF();
        this.altoRiesgo.InicializarPila();
        this.bajoRiesgo.InicializarPila();
    }

    public void agregarTurno(String tipo, String id) {
        if (tipo.equals("A")) {
            altoRiesgo.Apilar(id);
        } else if (tipo.equals("B")) {
            bajoRiesgo.Apilar(id);
        }
    }

    public String obtenerSiguienteTurno() {
        if (!altoRiesgo.PilaVacia()) {
            String turnoId = String.valueOf(altoRiesgo.Tope());
            altoRiesgo.Desapilar();
            return turnoId;
        } else if (!bajoRiesgo.PilaVacia()) {
            String turnoId = String.valueOf(bajoRiesgo.Tope());
            bajoRiesgo.Desapilar();
            return turnoId;
        } else {
            return null;
        }
    }
}

class FilaPediatria extends Fila {}
class FilaJovenesAdultos extends Fila {}
class FilaAdultosMayores extends Fila {}
