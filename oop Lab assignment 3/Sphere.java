public class Sphere  extends Shape3D{
    private double radius;
     Sphere(double radius) {
            super();
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }       
        public void setRadius(double radius) {
            this.radius = radius;
        }
        public double area() {
            return 4 * Math.PI * radius * radius;
        }           
        public double volume() {
            return (4.0 / 3.0) * Math.PI * radius * radius * radius;
        }
        public String toString() {
            return "Sphere: radius = " + radius + " area = " + area() + " volume = " + volume();
        }
    
    
    }
       
