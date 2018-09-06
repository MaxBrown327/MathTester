public class mathTester {

    public static void main(String[] args) {
        String firstWord;
        String secondWord;
        int firstNumber;
        int secondNumber;

        firstWord = "Dog";
        secondWord = "House";
        firstNumber = 25;
        secondNumber = 42;


        System.out.println(firstNumber-secondNumber);
        System.out.println(firstWord+(firstNumber+secondNumber));
        System.out.println("The answer to 25 plus 42 is " + (firstNumber+secondNumber));
        System.out.println("the answer to 25 minus 42 is " +(firstNumber-secondNumber));
        System.out.println("The answer to 25 times 42 is " + (firstNumber*secondNumber));
        System.out.println("42 divided by 25 is " + (secondNumber/firstNumber));
        System.out.println("the modulus of 42 by 25 is " + (secondNumber%firstNumber));
        System.out.println();
    }
}
