import api.PilaTF;

class Fila {
    protected PilaTF altoRiesgo;
    protected PilaTF bajoRiesgo;
    protected PilaTF auxiliar;

    public Fila() {
        this.altoRiesgo = new PilaTF();
        this.bajoRiesgo = new PilaTF();
        this.auxiliar = new PilaTF();
        this.altoRiesgo.inicializarPila();
        this.bajoRiesgo.inicializarPila();
        this.auxiliar.inicializarPila();
    }

    public void agregarTurno(String tipo, String id) {
        if (tipo.equals("A")) {
            altoRiesgo.apilar(id);
        } else if (tipo.equals("B")) {
            bajoRiesgo.apilar(id);
        }
    }

    public String obtenerSiguienteTurno() {
        if (!altoRiesgo.pilaVacia()) {
            return desapilarTodosYRetornar(altoRiesgo);
        } else if (!bajoRiesgo.pilaVacia()) {
            return desapilarTodosYRetornar(bajoRiesgo);
        } else {
            return null;
        }
    }

    private String desapilarTodosYRetornar(PilaTF pila) {
        while (!pila.pilaVacia()) {
            auxiliar.apilar(pila.tope());
            pila.desapilar();
        }
        String turnoId = auxiliar.tope();
        auxiliar.desapilar();
        while (!auxiliar.pilaVacia()) {
            pila.apilar(auxiliar.tope());
            auxiliar.desapilar();
        }
        return turnoId;
    }
}

class FilaPediatria extends Fila {}
class FilaJovenesAdultos extends Fila {}
class FilaAdultosMayores extends Fila {}
