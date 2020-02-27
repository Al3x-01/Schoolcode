import java.util.Scanner;

public class Calculator
{
    /**
     * Do Not Change The Main Method!
     * It is set up to run the menu for the program.
     * Your job is to code the static methods for all 6 of the cases.
     * Each case will need to ask the user for the neccessary amount of Points.
     * Create the Point objects, then use the methods that you create in your Point
     * class to give the user the answer required for that case.
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        boolean keepGoing = true;
        do
        {
            System.out.println("\n");
            System.out.println("What would you like to do?");
            System.out.println("(0) Exit Program\n" + 
                "(1) Distance Between Two Points\n" +
                "(2) Slope Between Two Points\n" + 
                "(3) Equation of Line Between Two Points\n" +
                "(4) Midpoint of Two Points\n" + 
                "(5) Test if 3 Points Are Collinear\n" +
                "(6) Area of Triangle Formed by 3 Points");
            System.out.print("Enter the number of your choice: ");
            String userChoice = input.nextLine();
            System.out.println("\n");
            switch (userChoice)
            {
                case "1": distance(); break;

                case "2": slope(); break;

                case "3": equation(); break;

                case "4": midpoint(); break;

                case "5": collinear(); break;

                case "6": triangle(); break;

                default: keepGoing = false; break;

            }
        } while (keepGoing);
        System.out.println("Thank for using the program!");
    }

    //ask the user for two points, output the distance between them
    public static void distance()
    {

    }

    //ask the user for two points, output the slope between them
    public static void slope()
    {

    }

    //ask the user for two points, output the equation of the line formed by them
    public static void equation()
    {

    }

    //ask the user for two points, output the midpoint of the two points
    public static void midpoint()
    {

    }
    
    //ask the user for three points, output whether the three points are collinear
    public static void collinear()
    {

    }
    
    //ask the user for three points, output the area of the triangle formed by the points
    public static void triangle()
    {

    }
}
