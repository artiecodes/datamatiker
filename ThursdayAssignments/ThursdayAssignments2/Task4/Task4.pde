/*
4.a Create arrays of the following type and assign it at least 3 different values:

Integer array
String array
boolean array
4.b Write a function that takes in an array of strings as parameter and prints each string.

4.c Write a function that receives an integer array as a parameter and returns the sum of all elements in the array.

4.d Write a function that receives an integer array as a parameter and returns the average value.

4.e Consider how you could write a function that takes in an integer array as a parameter and returns the array sorted from lowest to highest value.
*/


int[] myIntArray = new int[3];
String[] myStringArray = {"Hej", "med", "dig"};
String[] functionArray = {"Receive", "array", "and", "print", "string"};
String str = functionArray.toString();
//functionArray[0] = "Receive";
//functionArray[1] = "array";
//functionArray[2] = "and";
//functionArray[3] = "print";
//finctionArray[4] = "string";
boolean[] myBooleanArray = new boolean[3];
int[] additionArr = new int[5];
float[] avgArr = new float [6];
int[] checkThis = {3, 4, 7, 1, 2, 5, 9, 8, 0, 6, 10};

//4.A
void setup() {
  for(int i = 0; i < myIntArray.length; i++) {
    myIntArray[i] += i;
  }
  
  for(int i = 0; i < myBooleanArray.length; i++) {
  }
  
  for(int i = 0; i < functionArray.length; i++) {
    functionArray[i] += i;
  }
  
 println(myIntArray);
 println(myStringArray);
 println(myBooleanArray);
 printArray1(functionArray);
 sumArray(additionArr);
 avgValue(avgArr);
  
}

//4.B
String printArray1 (String[] str) {
  println(str);
  return str.toString();
}

//4.C
int sumArray (int[] additionArr) {
  int sum = 0;
  for (int i = 0; i < additionArr.length; i++) {
    additionArr[i] += i;
    sum += additionArr[i];
  }
  println(sum);
  return sum;
}

//4.D
float avgValue (float[] avgArr) {
  float avg = 0;
  float sum = 0;
  for (int i = 0; i < avgArr.length; i++) {
    avgArr[i] += i;
    sum += avgArr[i];
    avg = sum/avgArr.length;
  }
  println(avg);
  return avg;
}

//4.E
//int sortedSize (int[] checkThis) {
//  Arrays.sort(checkThis);
//  println(Arrays.asList(checkThis));
//  return sorted;
//}
