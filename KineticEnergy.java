/*Juan Carlos T. Matias
IT101A*/
import java.util.*;     //Import of Scanner and Math package
public class KineticEnergy {
    public static void main(String[] args) {
        double a = 0, b = 0;    //Initialized variables
        double Kinetic;
        Kinetic = Calculation(a, b);    //Receives the value of the Calculation method

        System.out.printf("The object's kinetic energy is: %.2f", Kinetic);     //Prints out the answer of the Calculation function
        System.out.println(" J.");

    }

    public static double Calculation (double m, double v) {     //Calculation Function
        
        Scanner s = new Scanner(System.in);     //Scanner

        double KE;

        System.out.print("Enter mass in kilograms: ");
        m = s.nextDouble();
        System.out.print("Enter velocity in meters per second: ");      //Input of mass and meters
        v = s.nextDouble();

       
        double v2 = Math.pow(v, 2);
        KE = 0.5 * m * v2;
        
        return KE;      //Returns the value to the main method
    }
}