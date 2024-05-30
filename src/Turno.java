public class Turno {
    private String id;
    private String sala;

    public Turno(String id, String sala) {
        this.id = id;
        this.sala = sala;
    }

    public String getId() {
        return id;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    @Override
    public String toString() {
        return "Turno: " + id + " | Sala: " + sala;
    }
}
