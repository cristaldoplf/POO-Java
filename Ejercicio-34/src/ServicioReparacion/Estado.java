package ServicioReparacion;

public interface Estado {
    public void cambiarDireccion(String nuevaDireccion);
    public void darValorPresupusto(double valor);
    public void pasarSigPaso();
    public void agregarRepuesto(double valor);
}
