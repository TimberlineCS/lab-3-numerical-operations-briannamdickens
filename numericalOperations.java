public class numericalOperations{
  public static void main(String args[]){
    //Challenge 1
    double d1 = 37.9;
    double d2 = 1004.128;
    int i1 = 12;
    int i2 = 18;

    String firstProblem = "I predict the answer of the problem 57.2 * (i1 / i2) + 1 is 58.2. The actual answer is = ";
    double firstEquation = 57.2*(i1 / i2) + 1;
    System.out.println(firstProblem + firstEquation);

    String secondProblem = "I predict the answer of the problem 57.2 * ((double)i1 / i2) + 1 is 58.2. The actual answer is = ";
    double secondEquation = 57.2 * ((double)i1 / i2) + 1;
    System.out.println(secondProblem + secondEquation);

    String thirdProblem = "I predict the answer of the problem 15 - i1*(d1*3) + 4 is 117.7. The actual answer is = ";
    double thirdEquation = 15 - i1*(d1*3) + 4;
    System.out.println(thirdProblem + thirdEquation);

    String fourthProblem = "I predict the answer of the problem 15 - i1*((int)d1*3) + 4 is 346. The actual answer is = ";
    double fourthEquation = 15 - i1*((int)d1*3) + 4;
    System.out.println(fourthProblem + fourthEquation);

    String fifthProblem = "I predict the answer of the problem 15 - i1*(int)(d1*3) + 4 is 346. The actual answer is = ";
    double fithEquation = (15 - i1*(int)(d1*3) + 4);
    System.out.println(fifthProblem + fithEquation);
    
    //Challenge 2
    String  number = "1234";
    int midpoint = number.length()/2;
    String firstPart = number.substring(0, midpoint);
    String secondPart = number.substring(midpoint);
    System.out.print(secondPart + firstPart);


  }
}