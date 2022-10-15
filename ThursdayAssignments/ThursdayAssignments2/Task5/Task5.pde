Student[] students = new Student[10];

void setup() {

  Teacher myTeacher1 = new Teacher("Abel",30,false);
  Student myStudent1 = new Student("Bjarke",27,false,'b');
  Student myStudent2 = new Student("Julius",69,false,'b');
  students[0] = new Student("AA", 18, false, 'a');
  students[1] = new Student("AB", 19, true, 'a');
  students[2] = new Student("AC", 20, false, 'a');
  students[3] = new Student("AD", 21, true, 'a');
  students[4] = new Student("AE", 22, false, 'a');
  students[5] = new Student("BA", 18, true, 'b');
  students[6] = new Student("BB", 19, false, 'b');
  students[7] = new Student("BC", 20, true, 'b');
  students[8] = new Student("BD", 21, false, 'b');
  students[9] = new Student("BE", 22, true, 'b');
  
  
  
  println(myTeacher1.name);
  println(myStudent1.name +" "+ myStudent1.datamatikerTeam +" "+ myStudent2.name +" "+ myStudent2.datamatikerTeam);
  println(printStudentName(students, 4));
  println(getIndexName(students, "BE"));
  
}

String printStudentName (Student[] students, int i) {
  //println(students[i].name);
  return students[i].name;  
}

int getIndexName (Student[] students, String name) {
  int indexNum = 0;
  for (int i = 0; i < students.length; i++) {
    if (students[i].name == name)
    indexNum = i;
  }
  return indexNum;
}
