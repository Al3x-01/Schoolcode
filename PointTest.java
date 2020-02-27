public class PointTest
{
    public static void main(String[] args)
    {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 4);
        Point p3 = new Point(6, 6);
        Point p4 = new Point(2, 0);
        Point p5 = new Point(4, 2);
        
        /**
         * Here are the tests for your 6 methods:
         */
        //Distance Test
        System.out.println("The distance between (0, 0) and (2, 0) should be 2, test gives: " + p1.distanceTo(p4));
        System.out.println("The distance between (4, 4) and (6, 6) should be 2.828, test gives: " + p2.distanceTo(p3));
        
        //Slope Test
        System.out.println("The slope between (2, 0) and (4, 4) should be 2, test gives: " + p4.slopeBetween(p2));
        System.out.println("The slope between (2, 0) and (0, 0) should be 0, test gives: " + p4.slopeBetween(p1));
        
        //Equation Test
        System.out.println("The equation of the line between (0, 0) and (4, 4) should be y = x, test gives: " + p1.lineEquation(p2));
        System.out.println("The equation of the line between (2, 0) and (4, 2) should be y = x - 2, test gives: " + p4.lineEquation(p5));
        
        //Midpoint Test
        System.out.println("The midpoint of (0, 0) and (4, 4) should be (2, 2), test gives: " + p1.midpoint(p2));
        System.out.println("The midpoint of (4, 4) and (4, 2) should be (4, 3), test gives: " + p2.midpoint(p5));
        
        //Triangle Test
        System.out.println("The area of the triangle formed by (0, 0) (4, 4) and (6, 6) should be 0, test gives: " + p1.areaOfTriangle(p2, p3));
        System.out.println("The area of the triangle formed by (0, 0) (2, 0) and (4, 2) should be 2, test gives: " + p1.areaOfTriangle(p4, p5));
        
        //Collinear Test
        System.out.println("The points (0, 0) (4, 4) and (6, 6) are collinear, test gives: " + p1.areCollinear(p2, p3));
        System.out.println("The points (2, 0) (4, 2) and (6, 6) are not collinear, test gives: " + p1.areCollinear(p5, p3));
    }
}