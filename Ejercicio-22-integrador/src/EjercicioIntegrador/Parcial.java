package EjercicioIntegrador;

public class Parcial extends Examen {
    private int unidad;
    private int nroDeReintento;


    public Parcial(String titulo, String enuncaido, double nota, Alumno alumno, int unidad) {
        super(titulo, enuncaido, nota, alumno);
        this.unidad = unidad;
        this.nroDeReintento = 0;
    }

    public boolean sePuedeRecuperar() {
        boolean respuesta;
        if (unidad<=3) {
            respuesta = nroDeReintento<=2;
        } else {
            respuesta = nroDeReintento<=1;
        }
        return respuesta;
    }
}
