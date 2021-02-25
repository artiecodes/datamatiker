class Datamatik { // I don't understand the "Teacher/Student cannot be resolved to a type" when
                  // the program runs just fine?

    public static void main(String[] args) {

        Student[] studentArray = new Student[10];

        studentArray[0] = new Student("Bjarke", 25, false, "Team E");
        studentArray[1] = new Student("Oliver", 22, false, "Team E");
        studentArray[2] = new Student("Philippe", 21, false, "Team E");
        studentArray[3] = new Student("Jantie", 22, true, "Team E");
        studentArray[4] = new Student("Frederik", 23, false, "Team A");
        studentArray[5] = new Student("Inga", 24, true, "Team A");
        studentArray[6] = new Student("Martin", 25, false, "Team B");
        studentArray[7] = new Student("Mads", 26, false, "Team B");
        studentArray[8] = new Student("Jonas", 27, false, "Team B");
        studentArray[9] = new Student("Mie", 28, true, "Team B");

        studentName(studentArray, 3);
        studentName(studentArray, 5);
        studentName(studentArray, 9);
        findName(studentArray, "Bjarke");
        findName(studentArray, "Jonas");
        findName(studentArray, "Inga");

    }

    public static String studentName(Student[] studentArray, int index) {

        System.out.println(studentArray[index].name);
        return studentArray[index].name;
    }

    public static String findName(Student[] studentArray, String name) {

        for (int i = 0; i < studentArray.length; i++) {
            if(studentArray[i].name.contains(name)) {
                System.out.println("This is your student");
                System.out.println(studentArray[i].name);
                System.out.println(""+ studentArray[i].name+"'s index is: "+i+".");
            }
        }
        return name; // Also why does this give me an overflow error?
    }
}