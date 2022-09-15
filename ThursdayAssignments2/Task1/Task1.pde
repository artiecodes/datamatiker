/*
1.a Create a sketch and name it Task1. Write a void setup()-function in the sketch.

1.b Write a function that prints an empty line and call it from setup();

1.c Write a function that receives a string as a parameter and prints it. call this function from setup()

1.d Write a function that receives a string called "name" and an integer called "age" and call it from setup with your own name and age.
Have the function print the text "My name is <name>, I am years old".
*/

String str1 = ("Print this string");

void setup() {
  printEmpty();
  receiveString(str1);
  nameAge("Bjarke", 27);
}

void printEmpty() {
  println("'' ''");
}

String receiveString(String str1) {
  println(str1);
  return str1;
}

void nameAge (String name, int age) {
  print("My name is "+name+",");
  print(" I am "+age+" years old.");
}
