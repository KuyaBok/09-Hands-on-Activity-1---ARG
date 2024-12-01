package runquad;

import java.util.Scanner;
public class RunQuad {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Select from the following: "
                + "\nR - Rectangle"
                + "\nS - Square"
                + "\nP - Parallelogram"
                + "\nH - Rhombus"
                + "\nT - Trapezoid"
                + "\n");
        char shape = scan.next().toUpperCase().charAt(0);
        
        if (shape == 'R'){
            System.out.println("A Rectangle: ");
            Rectangle rectangle = new Rectangle();
            rectangle.showDescription();
        }
        else if (shape == 'S'){
            System.out.println("A Square: ");
            Square square = new Square();
            square.showDescription();
        }
        else if (shape == 'P'){
            System.out.println("A Parallelogram: ");
            Parallelogram parallelogram = new Parallelogram();
            parallelogram.showDescription();
        }
        else if (shape == 'H'){
            System.out.println("A Rhombus: ");
            Rhombus rhombus = new Rhombus();
            rhombus.showDescription();
        }
         else if (shape == 'T'){
            System.out.println("A Trapezoid: ");
            Trapezoid trapezoid = new Trapezoid();
            trapezoid.showDescription();
        }
        else{
            System.out.println("Invalid Option");
        }
    }
    
}
