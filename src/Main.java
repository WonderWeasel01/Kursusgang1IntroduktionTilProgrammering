import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1.1
        System.out.println("Welcome to Java");
        System.out.println("Learning Java now");
        System.out.println("Programming is fun");

        System.out.println("  ");
        // 1.2
        String java = "I love Java";

        for(int i=0; i<5; i++){
            System.out.println(java);
        }



        System.out.println(" ");
        // 1.3
        System.out.println("   J");
        System.out.println("J aaa v vaaa");
        System.out.println("J J aa vv a a");
        System.out.println("J aaaa  v aaaa");

        System.out.println(" ");
        // 1.4
        System.out.println("aa^2a^3a^4\n" + "1 1 1 1\n" + "2 4 8 16\n" + "3 9 27 81\n" + "4 16 64 256");

        System.out.println(" ");
        //1.5
        double calc = (7.5*6.5-4.5*3)/(47.5-5.5);
        System.out.println("(7.5*6.5-4.5*3)/(47.5-5.5) = " + calc);

        System.out.println(" ");
        //1.6
        int calc2 =  1+ 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
        System.out.println("1+ 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = " + calc2);

        System.out.println(" ");
        // 1.7
        System.out.println(4 *(1-1/3+1/5-1/7+1/9-1/11+1/13));
        System.out.println(4 *(1.0-1.0/3+1.0/5-1.0/7+1.0/9-1.0/11+1.0/13));


        System.out.println("  ");
        // 1.8
        final double pi = 3.14159;


        Scanner scanner = new Scanner(System.in);

        /*System.out.println("Enter radius: ");
        double radius = scanner.nextDouble();
        double perimeter = 2 * radius * pi;
        double area = radius * radius * pi;
        System.out.println("The perimeter of the circle with radius " + radius + " = " + perimeter);
        System.out.println("The area of the circle with radius " + radius + " = " + area);
        */


        System.out.println("Population");
        System.out.println(" ");
        //1.11

        double secondsinminute = 60.0;
        double minutesinhour = 60.0;
        double hoursinday = 24.0;
        double daysinyear = 365.0;
        double populationStart = 312032486;
        double birth = 7.0;
        double death = 13.0;
        double immigrant =45.0;

        double birthperyear = (secondsinminute/birth)*(daysinyear*hoursinday*minutesinhour);
        double deathperyear = (secondsinminute/death)*(daysinyear*hoursinday*minutesinhour);
        double immigrantperyear = (secondsinminute/immigrant)*(daysinyear*hoursinday*minutesinhour);
        double populationGrowth = birthperyear+immigrantperyear-deathperyear;

        System.out.println("Years of growth: ");
        double years = scanner.nextDouble();

        for(double i=0; i<=years; i++) {
            System.out.print(i + "years" + ": ");
            System.out.printf("%.2f", populationStart + (i * (populationGrowth)));
            System.out.println("");
        }

        // 1.12

        double kmRan = 24/1.6;
        double minutes =60+40+(0.35/60*100);
        double kmRanPerHour = kmRan / minutes*60;
        System.out.print("The runner runs: ");
        System.out.printf("%.2f",kmRanPerHour);
        System.out.println(" km pr. hour");

        System.out.println("");
        // 1.13
        double a = 3.4;
        double b = 50.2;
        double c = 2.1;
        double d = 0.55;
        double e = 44.5;
        double f = 5.9;

        double x = (e*d-b*f)/(a*d-b*c);
        double y = (a*f-e*c)/(a*d-b*c);
        System.out.println("x: "+ x);
        System.out.println("y: "+ y);

        //1.10
        double runSpeed = 15;
        double time = 50;


    }



}