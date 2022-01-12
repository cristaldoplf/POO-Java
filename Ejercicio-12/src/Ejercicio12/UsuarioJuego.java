package Ejercicio12;

public class UsuarioJuego {
   String nombre;
   String clave;
   Double puntaje;
   int nivel;

    public UsuarioJuego(String nombre, String clave) {
        this.nombre = nombre;
        this.clave = clave;
        this.puntaje = 0d;
        this.nivel = 0;
    }

    public void aumentarPuntaje(){
        puntaje++;
    }

    public void subirNivel(){
        nivel++;
    }

    public void bonus(int valor){
        puntaje = puntaje + valor;
    }
}
