package Puerto;


public class Puerto{
    Hub[] hubs = new Hub[3];


    public Puerto(){}
    public Puerto(Hub[] hubs){
        if(hubs != null) this.hubs = hubs;
    }

    public boolean Apilar(Contenedor cont) {
        if (cont != null) {
            for (int i = 0; i < hubs.length; i++) {
                if (hubs[i].apilar(cont)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean Desapilar(int nHub, int columna){
        return false;
    }

    public String toString() {
        String resultado = "";

        for (int i = 0; i < hubs.length; i++) {
             resultado += hubs[i].toString();
        }
        return resultado;
    }

}
