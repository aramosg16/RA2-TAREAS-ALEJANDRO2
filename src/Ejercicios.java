
import java.net.StandardSocketOptions;
import java.sql.SQLOutput;
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
        // ejercicio9();
        // ejercicio10();
        // ejercicio11();
        // ejercicio12();
        // ejercicio13();
        // ejercicio14();
        // ejercicio15();
        // ejercicio16();
        // ejercicio17();
        // ejercicio18();
        // ejercicio19();
        // ejercicio20();
        // ejercicio21();
        // ejercicio22();
        // ejercicio23();
        // ejercicio24();
        // ejercicio25();
        // ejercicio26();
        // ejercicio27();
        // ejercicio28();
        // ejercicio29();
        // ejercicio30();
        // ejercicio31();
        // ejercicio32();
        // ejercicio33();
        // ejercicio34();
        // ejercicio35();
    }

    private static void ejercicio35() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Value of the gift?");
        double gift = Double.parseDouble(scanner.nextLine());

        if (gift < 5000) {
            System.out.println("No tax!");
        } else if (gift <= 25000) {
            System.out.println("Tax: " + (100 + (gift - 5000) * 0.08));
        } else if (gift <= 55000) {
            System.out.println("Tax: " + (1700 + (gift - 25000) * 0.10));
        } else if (gift <= 200000) {
            System.out.println("Tax: " + (4700 + (gift - 55000) * 0.12));
        } else if (gift <= 1000000) {
            System.out.println("Tax: " + (22100 + (gift - 200000) * 0.15));
        } else {
            System.out.println("Tax: " + (142100 + (gift - 1000000) * 0.17));
        }
    }

    private static void ejercicio34() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a year:");
        int year = Integer.parseInt(scanner.nextLine());

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }
    }

    private static void ejercicio33() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        if (age < 0 || age > 120) {
            System.out.println("Impossible!");
        } else {
            System.out.println("OK");
        }
    }

    private static void ejercicio32() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String first = scanner.nextLine();

        System.out.println("Enter the second string:");
        String second = scanner.nextLine();

        if (first.equals(second)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }

    private static void ejercicio31() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Password?");
        String password = scanner.nextLine();

        if (password.equals("Caput Draconis")) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
    }

    private static void ejercicio30() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Number " + number + " is even.");
        } else {
            System.out.println("Number " + number + " is odd.");
        }
    }

    private static void ejercicio29() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give points [0-100]");
        int points = scanner.nextInt();

        if (points < 0) {
            System.out.println("Impossible!");
        } else if (points < 50) {
            System.out.println("Failed");
        } else if (points < 60) {
            System.out.println("1");
        } else if (points < 70) {
            System.out.println("2");
        } else if (points < 80) {
            System.out.println("3");
        } else if (points < 90) {
            System.out.println("4");
        } else if (points <= 100) {
            System.out.println("5");
        } else {
            System.out.println("incredible!");
        }
    }

    private static void ejercicio28() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = scanner.nextInt();

        System.out.println("Give the second number:");
        int second = scanner.nextInt();

        if (first > second) {
            System.out.println("Greater number is: " + first);
        } else if (second > first) {
            System.out.println("Greater number is: " + second);
        } else {
            System.out.println("The numbers are equal!");
        }
    }

    private static void ejercicio27() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How old are you? ");

        int numero = scanner.nextInt();
        if (numero>=18){
            System.out.println("You are an adult");
        }else{
            System.out.println("You are not an adult");
        }
    }

    private static void ejercicio26() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a number: ");

        int numero = scanner.nextInt();
        if (numero>0){
            System.out.println("The number is positive");
        }else{
            System.out.println("The number is negative");
        }
    }

    private static void ejercicio25() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a number: ");

        int numero = scanner.nextInt();
        if (numero<2015){
            System.out.print("Ancient history");
        }
    }

    private static void ejercicio24() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a number: ");

        int numero = scanner.nextInt();
        if (numero==1984){
            System.out.print("Orwell");
        }
    }

    private static void ejercicio23() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give speed: ");
        int speed = scanner.nextInt();
        if ( speed > 120) {
            System.out.println("Speeding ticket!");
        }
    }

    private static void ejercicio22() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give the first number:");
        int primero = Integer.parseInt(scanner.nextLine());

        System.out.print("Give the second number:");
        int segundo = Integer.parseInt(scanner.nextLine());

        System.out.print(primero + " + " + segundo + " = " + (primero + segundo));
        System.out.print(primero + " - " + segundo + " = " + (primero - segundo));
        System.out.print(primero + " * " + segundo + " = " + (primero * segundo));
        System.out.print(primero + " / " + segundo + " = " + ((double) primero / segundo));
    }

    private static void ejercicio21() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Give the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Give the third number: ");
        int num3 = scanner.nextInt();
        double num4= (num1+num2+num3)/3.0;

        System.out.print("The average is " +num4);
    }

    private static void ejercicio20() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Give the second number: ");
        int num2 = scanner.nextInt();
        double num3= (num1+num2)/2;

        System.out.print("The average is " +num3);
    }

    private static void ejercicio19() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Give the second number: ");
        int num2 = scanner.nextInt();
        int num3= num1*num2;

        System.out.print(num1+ "*" +num2+ "=" +num3);
    }

    private static void ejercicio18() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Give the second number: ");
        int num2 = scanner.nextInt();
        int num3= num1+num2;

        System.out.print(num1+ "+" +num2+ "=" +num3);
    }

    private static void ejercicio17() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Give the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Give the third number: ");
        int num3 = scanner.nextInt();
        int num4= num1+num2+num3;

        System.out.print("La suma de los numeros es: "+num4);
    }

    private static void ejercicio16() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give the first number:");
        int num1 = scanner.nextInt();
        System.out.print("Give the second number:");
        int num2 = scanner.nextInt();
        int num3= num1+num2;

        System.out.print("La suma de los numeros es: "+num3);
    }

    private static void ejercicio15() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int number = scanner.nextInt();
        number=number*24*60*60;
        System.out.println("You gave " + number);
    }

    private static void ejercicio14() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a string: ");
        String string = scanner.nextLine();
        System.out.print("Give a int: ");
        int num = scanner.nextInt();
        System.out.print("Give a double: ");
        double decimales = scanner.nextDouble();
        System.out.print("Give a boolean: ");
        boolean trueFalse = scanner.nextBoolean();

        System.out.println("You gavve the string: "+string);
        System.out.println("You gavve the int: "+num);
        System.out.println("You gavve the double: "+decimales);
        System.out.println("You gavve the boolean: "+trueFalse);
    }

    private static void ejercicio13() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe algo:");
        String texto = scanner.nextLine();

        boolean valor = texto.equalsIgnoreCase("verdadero");
        System.out.println("¿Verdadero o Falso? "+valor);
    }

    private static void ejercicio12() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Indique un número: ");
        double numero = scanner.nextDouble();
        System.out.println("Usted indicó el número "+numero);
    }

    private static void ejercicio11() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Indique un número: ");
        int numero = scanner.nextInt();
        System.out.println("Usted indicó el número "+numero);
    }

    private static void ejercicio10() {
        Scanner scanner = new Scanner(System.in);

        int pollo=0;
        double tocino=0;

        System.out.println("Introduce cuantos pollos hay ");
        pollo=scanner.nextInt();
        System.out.println("Introduce cuantos kilos de tocino hay: ");
        tocino=scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Introduce la marca del tractor: ");
        String tractor=scanner.nextLine();

        System.out.println("Pollo: "+pollo+" Tocino: "+tocino+" Tractor: "+tractor);
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
