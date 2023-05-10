package Puerto;

public class Contenedor {
    private final int id;
    private int peso, prio;
    private String procedencia, descripcion, nomEnvia, nomRecibe;
    private boolean inspeccion;

    public Contenedor(int id){
        this.id=id;
    }
    public Contenedor(int id, int peso, int prio, boolean inspeccion, String procedencia, String descripcion, String nomRecibe, String nomEnvia){
        this(id);

        if(peso>0) this.peso = peso;
        if(prio>0 && prio<4) this.prio = prio;
        this.inspeccion = inspeccion;
        if(procedencia!=null) this.procedencia = procedencia;
        if(descripcion!=null) this.descripcion = descripcion;
        if(nomEnvia!=null) this.nomEnvia = nomEnvia;
        if(nomRecibe!=null) this.nomRecibe = nomRecibe;
    }

    public int getId() {
        return id;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getPrio() {
        return prio;
    }

    public void setPrio(int prio) {
        this.prio = prio;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNomEnvia() {
        return nomEnvia;
    }

    public void setNomEnvia(String nomEnvia) {
        this.nomEnvia = nomEnvia;
    }

    public String getNomRecibe() {
        return nomRecibe;
    }

    public void setNomRecibe(String nomRecibe) {
        this.nomRecibe = nomRecibe;
    }

    public boolean isInspeccion() {
        return inspeccion;
    }

    public void setInspeccion(boolean inspeccion) {
        this.inspeccion = inspeccion;
    }

    @Override
    public String toString() {
        return "Contenedor: " +
                "ID:" + id + "\n" +
                ", Peso: " + peso + "\n" +
                ", Prioridad: " + prio + "\n" +
                ", Procedencia: " + procedencia + "\n" +
                ", Descripcion: " + descripcion + "\n" +
                ", Empresa emisora: " + nomEnvia + "\n" +
                ", Empresa Receptora: " + nomRecibe + "\n" +
                ", ¿Ha sido inspeccionado? " + inspeccion;
    }
}
