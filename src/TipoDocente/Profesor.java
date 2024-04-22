package TipoDocente;

public abstract class Profesor extends Persona {

    private String materia;
    private float sueldo;

    public Profesor(String nombre, String apellido, int edad, String materia, float sueldo) {
        super(nombre, apellido, edad);
        this.materia = materia;
        this.sueldo = sueldo;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public abstract float importeNomina();

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "materia='" + materia + '\'' +
                '}';
    }
}
