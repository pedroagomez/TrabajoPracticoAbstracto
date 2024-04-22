package TipoDocente;

public class ProfesorInterino extends Profesor{
    public ProfesorInterino(String nombre, String apellido, int edad, String materia, float sueldo) {
        super(nombre, apellido, edad, materia, sueldo);
    }

    @Override
    public float importeNomina() {
        float resultado = (float) ((super.getSueldo())- (super.getSueldo() *0.15));
        return resultado;
    }


    @Override
    public String toString() {
        return "Profesor interino " +super.toString() +"Sueldo :"+importeNomina() +" \n";
    }
}
