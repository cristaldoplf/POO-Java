package Excepciones;

public class Cliente {
    private String nombre;
    private String apellido;
    private String DNI;
    private double saldoEnCuenta;
    private double limite;

    public Cliente(String nombre, String apellido, String DNI, double limite) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.limite = limite;
        saldoEnCuenta = 0;
    }

    public void comprar(double importe) throws ClienteException {
        if (saldoEnCuenta + importe > limite) {
            throw new ClienteException("Error. No puede pasar su limite establecido.");
        } else {
            saldoEnCuenta += importe;
        }
    }

    public void saldarDeuda(double importe) throws ClienteException{
        if(importe > saldoEnCuenta && saldoEnCuenta > 0){
            throw new ClienteException("Error. No puede pagar mas de lo que adeuda.");
        }else if(saldoEnCuenta <= 0){
            throw new ClienteException("Error. Esta intentando pagar y no tiene deuda.");
        }else {
            saldoEnCuenta-=importe;
        }
    }


}
