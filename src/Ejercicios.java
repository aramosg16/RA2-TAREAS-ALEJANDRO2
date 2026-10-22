
import java.util.Scanner;

public class Ejercicios {


    public static void main(){
        // ejercicio1();
        // ejercicio2();
        // ejercicio3();
        // ejercicio4();
        // ejercicio5();
        // ejercicio6();
        // ejercicio7();
        // ejercicio8();
         ejercicio9();
    }

    private static void ejercicio9() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("I will tell you a story, but I need some information first.\n" +
                "What is the main character called?");
        String nombre = scanner.nextLine();
        System.out.println("What is their job?");
        String trabajo = scanner.nextLine();
        System.out.println("Here is the story:\n" +
                "Once upon a time there was Bob, who was a builder.\n" +
                "On the way to work, Bob reflected on life.\n" +
                "Perhaps Bob will not be a "+trabajo+" forever.");
    }

    private static void ejercicio8() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Greetings! How are you doing? ");
        String first= scanner.nextLine();
        System.out.println("Oh, how interesting. Tell me more! ");
        String second= scanner.nextLine();
        System.out.println("Thanks for sharing!");
    }

    private static void ejercicio7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name? ");
        String nombre=scanner.nextLine();
        System.out.print("Hi "+nombre);

    }

    private static void ejercicio6() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message: ");
        String nombre = scanner.nextLine();
        System.out.println(nombre+" "+nombre+" "+nombre);
    }

    private static void ejercicio5() {
        String name = "Ada Lovelace";
        System.out.println("Hi "+name);
    }

    private static void ejercicio4() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message: ");
        String nombre = scanner.nextLine();
        System.out.println(nombre);
    }

    private static void ejercicio3() {
        System.out.println("Once upon a time there was a dinosaur");
    }

    private static void ejercicio2() {
        System.out.println("Once upon a time");
        System.out.println("there was");
        System.out.println("a program");
    }

    private static void ejercicio1() {
        System.out.println("Ada Lovelace");
    }
}
