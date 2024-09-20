
package lab10p2_carlosdominguez_;

import java.util.ArrayList;

public class Pais {
    String nombre;
    ArrayList <Nadador> lista_n = new ArrayList();
    int num_de_medallas;

    public Pais(String nombre, int num_de_medallas) {
        this.nombre = nombre;
        this.num_de_medallas = num_de_medallas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Nadador> getLista_n() {
        return lista_n;
    }

    public void setLista_n(ArrayList<Nadador> lista_n) {
        this.lista_n = lista_n;
    }

    public int getNum_de_medallas() {
        return num_de_medallas;
    }

    public void setNum_de_medallas(int num_de_medallas) {
        this.num_de_medallas = num_de_medallas;
    }
    
}
