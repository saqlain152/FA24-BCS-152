public class Point {

    private double x;
    private double y;
    private double z;
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
       
    }
    
    public double getX() {
        return x;
    }
    
    
    public double getY() {
        return y;
    }
    
   
        
    
    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ", " + z + ")";
    }
}
