import java.util.Scanner;

public class Quiz {
    static Scanner data = new Scanner(System.in);

    public static void main(String[] args) {
//        question1();  //COMPLATE......
//        question2();  //LAST STEP
//        question3();  //LAST STEP
//        question4();  //COMPLATE......
//        question5();  //LAST STEP

    }

    public static void question1() {
        int num1;
        int num2;
        int num3;
        System.out.println("please enter the first number: ");
        num1 = data.nextInt();
        System.out.println("please enter the second number: ");
        num2 = data.nextInt();
        System.out.println("please enter the third number: ");
        num3 = data.nextInt();

        if (num1 > num2 && num1 > num2) {
            System.out.println("The largest number is: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("The largest number is: " + num2);
        } else {
            System.out.println("The largest number is: " + num3);
        }
    }

    public static void question2() {
        String word;
        int num;
        System.out.println("Enter the sentence: ");
        word = data.nextLine();
        System.out.println("Enter the number of index: ");
        num = data.nextInt();

//        while(num < word.length()){
//            if (word.indexOf(num)){
//                System.out.println(num);
//            }else {
//                System.out.println("The charchater not exist.");
//            }
//            num++;
//        }
        for (int i = num; i < word.length(); i++) {
            if (word.charAt(i)){
                System.out.println(i);
            }else {
                System.out.println("The charchater not exist.");
            }

        }
        //NOT COMPLATE..
    }

    public static void question3() {

        // enter numbers till the user wants .. DONE
        // sum the number that have been enterend.
        int counter;
        System.out.print("How many numbers you want to enter? ");
        counter = data.nextInt();
        int numbers = 0;

        for (int i = 0; i < counter; i++) {
            System.out.print("Enter the numbers: ");
            numbers = data.nextInt();
        }
        int sum = 0;
        sum += numbers;
        System.out.println(sum);
    }//LAST STEP.

    public static void question4() {
        int[] arr = {10, -21, 30, 31, -25};
        for (int i : arr) {
            if (i > 0) {
                System.out.println(i + " is a Posititve");
            } else if (i < 0) {
                System.out.println(i + " is a Negative");
            } else {
                System.out.println(i + " Zero");
            }
        }
    }

    public static void question5() {
        String[] words = {"Tuwaiq", "Bootcamp", "Student", "JAVA"};
        int shrotest = 0;
        for (int i = 0; i < words.length; i++) {
//            if (words[i] < ){
//                System.out.println(i);
//            }
        }//LAST STEP..
    }
}
