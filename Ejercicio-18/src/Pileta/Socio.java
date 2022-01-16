package Pileta;

public class Socio {
    private String numeroSocio;
    private String nombre;
    private Double cuotaMensual;
    private String actividad;

    public Socio(String numeroSocio, String nombre, String actividad, Double cuota) {
        this.numeroSocio = numeroSocio;
        this.nombre = nombre;
        cuotaMensual = cuota;
        this.actividad = actividad;
    }
}
