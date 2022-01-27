import java.util.ArrayList;
import java.util.List;

public class ProgramaIntensivo extends OfertaAcademica {
    private double porcentajeBonificacion;
    private List<OfertaAcademica> programa = new ArrayList<>();

    @Override
    public double calcularPrecio() {
        double total = 0;
        for (OfertaAcademica oferta : programa) {
            total += oferta.calcularPrecio();
        }
        return total - total * (porcentajeBonificacion / 100);
    }

    public double getPorcentajeBonificacion() {
        return porcentajeBonificacion;
    }

    public void setPorcentajeBonificacion(double porcentajeBonificacion) {
        this.porcentajeBonificacion = porcentajeBonificacion;
    }

    public List<OfertaAcademica> getPrograma() {
        return programa;
    }

    public void setPrograma(List<OfertaAcademica> programa) {
        this.programa = programa;
    }
}
