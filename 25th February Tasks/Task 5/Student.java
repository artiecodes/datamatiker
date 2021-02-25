public class Student {
    
    String name;
    int age;
    boolean isFemale;
    String datamatikerTeam;

    public Student(String name, int age, boolean isFemale, String datamatikerTeam) {

    this.name = name;
    this.age = age;
    this.isFemale = isFemale;
    this.datamatikerTeam = datamatikerTeam;
    
    Student[] studentArray = new Student[10];

    studentArray[0] = new Student("Bjarke", 25, false, "Team E");
    studentArray[1] = new Student("Oliver", 22, false, "Team E");
    studentArray[2] = new Student("Philippe", 21, false, "Team E");
    studentArray[3] = new Student("Jantie", 22, true, "Team E");
    studentArray[4] = new Student("Frederik", 23, false, "Team A");
    studentArray[5] = new Student("Inga", 24, true, "Team A");

    }
}
