class Fila {
    protected PilaTF altoRiesgo;
    protected PilaTF bajoRiesgo;

    public Fila() {
        this.altoRiesgo = new PilaTF();
        this.bajoRiesgo = new PilaTF();
        this.altoRiesgo.inicializarPila();
        this.bajoRiesgo.inicializarPila();
    }

    public void agregarTurno(String tipo, String id) {
        if (tipo.equals("A")) {
            altoRiesgo.apilar(Integer.parseInt(id));
        } else if (tipo.equals("B")) {
            bajoRiesgo.apilar(Integer.parseInt(id));
        }
    }

    public String obtenerSiguienteTurno() {
        if (!altoRiesgo.pilaVacia()) {
            String turnoId = String.valueOf(altoRiesgo.tope());
            altoRiesgo.desapilar();
            return turnoId;
        } else if (!bajoRiesgo.pilaVacia()) {
            String turnoId = String.valueOf(bajoRiesgo.tope());
            bajoRiesgo.desapilar();
            return turnoId;
        } else {
            return null;
        }
    }
}

class FilaPediatria extends Fila {}
class FilaJovenesAdultos extends Fila {}
class FilaAdultosMayores extends Fila {}
