import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();

        ArrayList<String> aCourse = new ArrayList<>();
        ArrayList<String> aCoursep = new ArrayList<>();

        aCourse.add("Java 1.0");
        aCoursep.add("English");

        ArrayList<String> bCourse = new ArrayList<>();
        ArrayList<String> bCoursep = new ArrayList<>();

        bCourse.add("Java 1.0");
        bCourse.add("Math");

        ArrayList<String> cCourse = new ArrayList<>();
        ArrayList<String> cCoursep = new ArrayList<>();

        cCourse.add("Java 69.0");
        cCourse.add("Math");

        ArrayList<String> dCourse = new ArrayList<>();
        ArrayList<String> dCoursep = new ArrayList<>();

        dCourse.add("English");
        dCoursep.add("Java 1.0");

        ArrayList<String> eCourse = new ArrayList<>();
        ArrayList<String> eCoursep = new ArrayList<>();

        eCourse.add("Java 1.0");
        eCoursep.add("English");

        ArrayList<String> fCourse = new ArrayList<>();
        ArrayList<String> fCoursep = new ArrayList<>();

        fCourse.add("Java 1.0");
        fCoursep.add("Java 1.0");


        Student alpha = new Student("Alpha", aCourse, aCoursep);
        Student beta = new Student("Beta", bCourse, bCoursep);
        Student charlie = new Student("Charlie", cCourse, cCoursep);
        Student delta = new Student("Delta", dCourse, dCoursep);

        persons.add(alpha);
        persons.add(beta);
        persons.add(charlie);


        Teacher echo = new Teacher("Echo", eCourse, eCoursep);
        Teacher foxtrot = new Teacher("Foxtrot", fCourse, fCoursep);

        persons.add(delta);
        persons.add(echo);
        persons.add(foxtrot);

        for (Person p :
                persons) {
            boolean isPos = p.addCourse("Java 1.0");
            if (!isPos) {
                if(p instanceof Student) {
                    System.out.println(p.getName() + " har allerede bestået dette kursus");
                } else {
                    System.out.println(p.getName() + " kan ikke undervise i dette fag");
                }
            }
        }
    }
}