class Datamatik { // I don't understand the "Teacher/Student cannot be resolved to a type" when the program runs

    public static void main(String[] args) {

        Teacher teacher1;
        teacher1 = new Teacher("Jesper", 29, false);

        Student student1;
        Student student2;

        student1 = new Student("Bjarke", 25, false, "Team E");
        student2 = new Student("Oliver", 22, false, "Team E");

        System.out.println("My male teacher is " + teacher1.name);
        System.out.println("My name is " + student1.name + " and a friend from my group is called " + student2.name);
        System.out.println("Together with two other students we make up " + student1.datamatikerTeam);
    }
}