import TipoDocente.Profesor;
import TipoDocente.ProfesorInterino;
import TipoDocente.ProfesorTitular;

import java.util.LinkedList;

public class ListinProfesores {
    private LinkedList<Profesor>listaProfesores;

    public ListinProfesores() {
        this.listaProfesores = new LinkedList<>();
    }


    public void cargarProfesores()
    {
        listaProfesores.add(new ProfesorTitular("Pedro","Gomez",35,"Programacion",1500.0f));
        listaProfesores.add(new ProfesorTitular("Juan","Romario",30,"Legislacion",1500f));
        listaProfesores.add(new ProfesorTitular("Pedro","Gomez",31,"Matematica",1500f));

        listaProfesores.add(new ProfesorInterino("Rodolfo","Depaoli",55,"Eduacion fisica",1500f));
        listaProfesores.add(new ProfesorInterino("Milagros","Joaquina",32,"Robotica",1500f));
        listaProfesores.add(new ProfesorInterino("Seba","Benffa",44,"Sociedad logistica",1500f));
    }

    public String mostrarProfesores()
    {
        String devolver= "";
        for(Profesor aux : listaProfesores)
        {
            devolver+=aux.toString();
        }
        return devolver;
    }

    public String mostrarTitulares()
    {
        String devolver="";
        for(Profesor aux : listaProfesores)
        {
            if(aux instanceof ProfesorTitular)
            {
                devolver+=aux.toString();
            }
        }
        return devolver;
    }

    public String mostrarInterinos()
    {
        String devolver="";
        for(Profesor aux : listaProfesores)
        {
            if(aux instanceof ProfesorInterino)
            {
                devolver+=aux.toString();
            }
        }
        return devolver;
    }

    public float importeTotalNominaProfesorado()
    {
        float totalNomina=0;
        for(Profesor aux: listaProfesores)
        {
            totalNomina+=aux.importeNomina();
        }
        return totalNomina;
    }
}
