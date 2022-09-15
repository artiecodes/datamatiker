/*
2.a Look at the file TaskTwoA and fill out the missing line, using the happy boolean.
2.b Write a function that receives to integers as parameters and returns the sum of them.
2.c Write a function that receives a string and returns it as uppercase. (Hint: ".toUpperCase()".
Further hint: https://www.w3schools.com/jsref/jsref_toUpperCase.asp )
2.d Write a function that receives a string and returns true if the first letter of the string is uppercase.
(Hints: ".charAt(0)" and "Character.isUpperCase('a');" )
*/

//2.a
/*
boolean happy = true;

 void setup() {
   if (iAmHappy())
   {
     println("I clap my hands");
   }
   else
   {
     println("I don't clap my hands"); 
   }
}

boolean iAmHappy(){
  return happy;
}
*/
//2.b
int sum (int a, int b) {
  return a+b;
}

//2.c
String upperCase (String str) {
  return str.toUpperCase();
}

//2.d
String firstUpperCase (String str) {
  char[] charArray = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','Æ','Ø','Å'};
  if (str.charAt(0) && Character.isUpperCase(charArray)) {
    return str;
  }
}
