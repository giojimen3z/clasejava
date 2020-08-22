public class Main {

    public static void main(String[] args) {

        String subjectYessica[] = {"POO","estrucutura de datos","Diseño web"};
        String subjectCarlos[] = {"POO","estrucutura de datos","Diseño web","Deiseño de software por componentes"};

        Student gio = new Student("1","Gio","Jimenez",27,"13/08/1993","nose@nose.com","Unipanamericana","Sanitas","Ingenieria",7,4,4.5,4.6);
        Teacher yesica = new Teacher("2","Yessica","nomelose",20,"01/01/2000","nosemenos@nose.com","Unipanamericana","compensar","Software","ingenieria",3,subjectYessica,30);
        Teacher carlos = new Teacher("3","Carlos","nomelose",40,"01/01/1980","nosemenos@nose.com","Unipanamericana","compensar","Software","ingenieria",4,subjectCarlos,50);

        System.out.println(gio.getName() +" "+ gio.getLastName());
        System.out.println(yesica.getName());
        System.out.println(carlos.getName());


    }
}
