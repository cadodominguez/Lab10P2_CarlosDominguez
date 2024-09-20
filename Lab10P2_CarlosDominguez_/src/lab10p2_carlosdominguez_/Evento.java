
package lab10p2_carlosdominguez_;

public class Evento {
    String DistanciaC;
    String ganador;
    double tiempoW;

    public Evento(String DistanciaC, String ganador, double tiempoW) {
        this.DistanciaC = DistanciaC;
        this.ganador = ganador;
        this.tiempoW = tiempoW;
    }

    public String getDistanciaC() {
        return DistanciaC;
    }

    public void setDistanciaC(String DistanciaC) {
        this.DistanciaC = DistanciaC;
    }

    public String getGanador() {
        return ganador;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }

    public double getTiempoW() {
        return tiempoW;
    }

    public void setTiempoW(double tiempoW) {
        this.tiempoW = tiempoW;
    }
    
}
