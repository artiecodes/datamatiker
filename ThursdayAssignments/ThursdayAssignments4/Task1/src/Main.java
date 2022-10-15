public class Main {

    public static void main(String[] args) {
        // Create a student object
        Student student = new Student("Bjarke");

        // Add courses to the student
        Student.addCourse(new Course("Mathematics"));
        Student.addCourse(new Course("Datamatik"));
        Student.addCourse(new Course("English"));

        // Utilise toString method in student class
        System.out.println(student);

    }

}