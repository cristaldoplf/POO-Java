package Clinic;

import java.util.Date;

public class Main {

    public static void main(String[] args) throws PacienteException {
        try{
            Paciente paciente=new Paciente("Juan","Perez","12345",new Date());
            paciente.darAlta(new Date(2001,10,10));
        }catch (PacienteException e){
            e.printStackTrace();
        }




    }
}
