package week13;

/**
 * 
 * @author YOUR NAME HERE
 * @date 11/29/2018
 *
 */
public class SimpleCircle {

    // variable to the circle's radius
    private double radius;

    /*
     * Returns the area of this circle
     */
    public double findArea() {
        return radius * radius * Math.PI;
    }
    
    /*
     * Returns the circumference of this circle
     */
    public double findCircumference(){
        // implement your code here
    }
    
    /*
     * Returns the diameter of this circle
     */
    
    
    public void setRadius(double r){
        this.radius = r;
    }
    
    public double getRadius(){
        return this.radius;
    }
}
