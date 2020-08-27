public class Main {

    public static void main(String[] args) {

        String subjectYessica[] = {"POO","estrucutura de datos","Diseño web"};
        String subjectCarlos[] = {"POO","estrucutura de datos","Diseño web","Deiseño de software por componentes"};

        Student gio = new Student("1","Gio","Jimenez",27,"13/08/1993","nose@nose.com","Unipanamericana","Sanitas","Ingenieria",7,4,4.5,4.6);
        Teacher yesica = new Teacher("2","Yessica","Andrade",20,"01/01/2000","yesica@unipanamericana.com","Unipanamericana","compensar","Software","ingenieria",3,subjectYessica,30);
        Teacher carlos = new Teacher("3","Carlos","Torres",40,"01/01/1980","carlos23@unipanamericana.com","Unipanamericana","compensar","Software","ingenieria",4,subjectCarlos,50);

        yesica.setEps("sanitas");

        System.out.println(gio.getName() +" "+ gio.getLastName() +" -edad: "+ gio.getAge()+" -Fecha de nacimiento: "+ gio.getBirthDate()+" -Email: "+ gio.getEmail()+" -institucion: "+ gio.getInstitution()+" -eps: "+ gio.getEps()+" -Facultad: "+ gio.getFaculty()+" -Semestre: "+ gio.getSemester()+" -numero de materias cursadas: "+ gio.getSubjectNumbers()+" -nota: "+ gio.getGradeSubject()+" -Promedio: "+ gio.getAverage());
        System.out.println(yesica.getName()+" "+ yesica.getLastName() +" -edad: "+ yesica.getAge()+" -Fecha de nacimiento: "+ yesica.getBirthDate()+" -Email: "+ yesica.getEmail()+" -institucion: "+ yesica.getInstitution()+" -eps: "+ yesica.getEps()+" -Facultad: "+ yesica.getFaculty()+" -Programa: "+ yesica.getProgram()+" -numero de materias "+ yesica.getSubjectsNumber()+" -Numero de estudaintes: "+ yesica.getStudentNumber());
        System.out.println(carlos.getName()+" "+ carlos.getLastName()+" -edad: "+ carlos.getAge()+" -Fecha de nacimiento: "+ carlos.getBirthDate()+" -Email: "+ carlos.getEmail()+" -institucion: "+ carlos.getInstitution()+" -eps: "+ carlos.getEps()+" -Facultad: "+ carlos.getFaculty()+" -Programa: "+ carlos.getProgram()+" -numero de materias "+ carlos.getSubjectsNumber()+" -Numero de estudaintes: "+ carlos.getStudentNumber());


    }
}
