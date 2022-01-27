import java.util.ArrayList;
import java.util.List;

public class ProgramaIntensivo extends OfertaAcademica {
    private double porcentajeBonificacion;
    List<OfertaAcademica> programa = new ArrayList<>();

    @Override
    public double calcularPrecio() {
        double total = 0;
        for (OfertaAcademica oferta : programa) {
            total += oferta.calcularPrecio();
        }
        return total;
    }


}
