package Puerto;


public class Puerto{
    Hub[] hubs;


    public Puerto(){
        this.hubs = new Hub[3];
    }
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

    public boolean Desapilar(int nHub, int colum){

        if (colum < 0 || colum >= hubs.length) return false;
        for (int i = 0; i < hubs.length; i++) {
            if (hubs[nHub] != null) {
                Hub vacio = hubs[nHub];
                return true;
            }
        }
        return true;
    }

    public String toString() {
        String plano = new String();
        for (int i = 0; i < hubs.length; i++) {
            plano += hubs.toString() + "\n";
        }
        return plano;
    }
}
