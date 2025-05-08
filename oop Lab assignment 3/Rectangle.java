public class Rectangle  extends Shape2D{
    private double width;
    private double length;
    private Point TopLeftCorner;

    @Override
    public boolean isfilled() {
      
        return false;
    }
    
    public Rectangle(double width,double  length, Point TopLeftCorner){
        super();
        this.width = width;
        this.length = length;
        this.TopLeftCorner = TopLeftCorner;
    }


    public boolean intersects(Rectangle other) {
        double thisRight = this.TopLeftCorner.getX() + this.width;
        double thisBottom = this.TopLeftCorner.getY() + this.length;
        double otherRight = other.getTopLeftCorner().getX() + other.getWidth();
        double otherBottom = other.getTopLeftCorner().getY() + other.getLength();
    
        if (this.TopLeftCorner.getX() >= otherRight ||   
            other.getTopLeftCorner().getX() >= thisRight || 
            this.TopLeftCorner.getY() >= otherBottom ||   
            other.getTopLeftCorner().getY() >= thisBottom) { 
            return false;
        }
    
        return true; 
    }
    
    public Point getTopLeftCorner(){
        return TopLeftCorner;
    }

    
    
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double area(){
        return width * length;
    }
    public double perimeter(){
        return 2 * (width + length);
    }
    public String toString(){
        return "Rectangle: width = "+width+" length = "+length+" area = "+area()+" perimeter = "+perimeter();
    }
    



}
