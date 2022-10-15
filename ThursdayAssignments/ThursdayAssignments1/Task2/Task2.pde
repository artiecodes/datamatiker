/*
 2.a store your name in a variable and print it.
 2.b store your age in a varible and print it.
 2.c store whether or not you are happy right now, as a boolean (true for happy, false for sad).
 2.d using the above variables print the following message: "Hi, my name is <name>"
 "I am <age> years old"
 "I <dont> clap my hands"
*/

//2.a
String myName = "Bjarke";
println(myName);

//2.b
int myAge = 27;
println(myAge);

//2.c+d
boolean happy = true;

println("Hi, my name is " +myName);
println("I am " +myAge + " years old");

if (happy) {
  println("I clap my hands");
} else {
  println("I don't clap my hands");
}
