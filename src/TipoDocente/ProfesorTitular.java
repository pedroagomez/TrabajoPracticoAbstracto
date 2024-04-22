package TipoDocente;

public class ProfesorTitular extends  Profesor{
    public ProfesorTitular(String nombre, String apellido, int edad, String materia, float sueldo) {
        super(nombre, apellido, edad, materia, sueldo);
    }

    @Override
    public float importeNomina() {
        return getSueldo();
    }

    @Override
    public String toString() {
        return "Profesor titular " +super.toString() + "Sueldo :"+importeNomina() +" \n";
    }
}
