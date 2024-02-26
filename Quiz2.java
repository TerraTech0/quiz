import java.util.Objects;
import java.util.Scanner;

public class Quiz2 {
    static Scanner data = new Scanner(System.in);
    public static void main(String[] args) {

//        question1();
//        question2();
//        question3();
        question4();//almost.
    }
    public static void question1(){
        System.out.println("Enter first number: ");
        int number1 = data.nextInt();
        System.out.println("Enter first number: ");
        int number2 = data.nextInt();
        System.out.println("Enter first number: ");
        int number3 = data.nextInt();
        if (number1 > number2 && number1 > number3){
            System.out.println("the biggest is: " + number1);
        }else if(number2 > number1 && number2 > number3){
            System.out.println("the biggest is: " + number2);
        }else if(number3 > number1 && number3 > number2){
            System.out.println("the biggest is: " + number3);
        }
    }
    public static void question2(){
        System.out.println("Enter the names: ");
        String names = data.nextLine();
        int len = 0;
        String sum = "";
        while(!Objects.equals(names, "finish")){
            sum += names;
            names = data.nextLine();
        }
        System.out.println("The names: "+sum+"\n"+ "thier length: "+sum.length());
    }
    public static void question3(){
        System.out.println("Enter your word: ");
        String word = data.nextLine();
        System.out.println("Enter the index: ");
        int index = data.nextInt();
        System.out.println(word.charAt(index));
    }
    public static void question4(){
        System.out.println("Enter your word: ");
        String word = data.nextLine();
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a'){
                count += i;
                System.out.println("Numbers of a's are: "+count);
            }
        }


    }
}
