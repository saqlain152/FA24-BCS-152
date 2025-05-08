public class Circle extends Shape2D {
    private double radius;

    public Circle(double radius) {
        super();
        this.radius = radius; 
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public boolean isfilled() {
        return false;
    }

    @Override
    public String toString() {
        return "Circle: radius = " + radius + " area = " + area();
    }   
}

