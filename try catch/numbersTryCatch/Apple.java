//import java.util.Scanner; //Must import this
//import javax.swing.JOptionPane;


public class Apple extends Sphere {

  //Instance variables
  private int numberOrdered; //Needed for cascading problem solution
  private double totalAppleCost;

  //Zero Argument Constructor

  //Getters and Setters Methods
  //Getters: instance Variable cannot be changed by outside class or program

  public double getTotalCost () { //returning appleCost from Zero Argument Constructor
    return this.totalAppleCost = Information.appleCost * this.numberOrdered; //
  } //End of getTotalCost

  //Processor Methods

  //Multi-argument Constructor
  public Apple (int userEntered, double diameter) {
    super( userEntered, diameter );
    this.numberOrdered = userEntered;
  } //End of ApplesOrdered multi-argument constructor

  //toString() for Printing Results of Class to Console
  public String toString() { //For JOptionPane and Println
    return super.toString() + "\n";
  } //End of toString()
} //End of Apple Class