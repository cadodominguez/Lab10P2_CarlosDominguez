
package lab10p2_carlosdominguez_;

public class Nadador {
    String nombre;
    String nacionalidad;
    String edad;
    String estatura;
    String estilo;
    String DistanciaC;
    int segundosMR;
    int numMedallas;

    public Nadador(String nombre, String nacionalidad, String edad, String estatura, String estilo, String DistanciaC, int segundosMR, int numMedallas) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.estatura = estatura;
        this.estilo = estilo;
        this.DistanciaC = DistanciaC;
        this.segundosMR = segundosMR;
        this.numMedallas = numMedallas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getEstatura() {
        return estatura;
    }

    public void setEstatura(String estatura) {
        this.estatura = estatura;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getDistanciaC() {
        return DistanciaC;
    }

    public void setDistanciaC(String DistanciaC) {
        this.DistanciaC = DistanciaC;
    }

    public int getSegundosMR() {
        return segundosMR;
    }

    public void setSegundosMR(int segundosMR) {
        this.segundosMR = segundosMR;
    }

    public int getNumMedallas() {
        return numMedallas;
    }

    public void setNumMedallas(int numMedallas) {
        this.numMedallas = numMedallas;
    }
    
}
