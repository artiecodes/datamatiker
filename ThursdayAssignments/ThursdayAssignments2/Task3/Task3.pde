void setup() {

  Teacher myTeacher1 = new Teacher("Abel",30,false);
  Student myStudent1 = new Student("Bjarke",27,false,'b');
  Student myStudent2 = new Student("Julius",69,false,'b');
  
  println(myTeacher1.name);
  println(myStudent1.name +" "+ myStudent1.datamatikerTeam +" "+ myStudent2.name +" "+ myStudent2.datamatikerTeam);
  
}
