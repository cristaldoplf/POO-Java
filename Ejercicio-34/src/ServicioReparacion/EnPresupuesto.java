package ServicioReparacion;

public class EnPresupuesto implements Estado{
    Reparacion reparacion;

    public EnPresupuesto(Reparacion rep){
        reparacion = rep;
    }

    @Override
    public void cambiarDireccion(String nuevaDireccion) {

    }

    @Override
    public void darValorPresupusto(double valor) {

    }

    @Override
    public void pasarSigPaso() {

    }

    @Override
    public void agregarRepuesto(double valor) {

    }

    public Reparacion getReparacion() {
        return reparacion;
    }

    public void setReparacion(Reparacion reparacion) {
        this.reparacion = reparacion;
    }
}
