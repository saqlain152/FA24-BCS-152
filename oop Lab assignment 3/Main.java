public class Main {
    public static void main (String[] args){
        Shape shape;
        Shape2D shape2d;
        Shape3D shape3d;        
        Rectangle rectangle = new Rectangle(5.0, 10.0,new Point (4, 2));
        System.out.println("Rectangle width: " + rectangle.getWidth());
        System.out.println("Rectangle length: " + rectangle.getLength());  
        
        System.out.println("Rectangle area: " + rectangle.area());
        System.out.println("Rectangle perimeter: " + rectangle.perimeter());
        
        
        Circle circle = new Circle(5.0);
        System.out.println("Circle radius: " + circle.getRadius());
        System.out.println("Circle area: " + circle.area());



        Sphere sphere = new Sphere(5.0);
        System.out.println("Sphere radius: " + sphere.getRadius());     
        System.out.println("Sphere area: " + sphere.area());
        System.out.println("Sphere volume: " + sphere.volume());


        Cube cube =new Cube(4.0);
        System.out.println("Cube side: " + cube.getside());
        System.out.println("Cube area: " + cube.area());
        System.out.println("Cube volume: " + cube.volume());


    Shape [] shapes =new Shape[20];
    shapes[0]=circle;
    shapes[1]=rectangle;
    shapes[2]=sphere;
    shapes[3]=cube;

for (int i = 4; i < shapes.length; i++) {
    switch (i % 4) {
        case 0 -> shapes[i] = shapes[0]; 
        case 1 -> shapes[i] = shapes[1]; 
        case 2 -> shapes[i] = shapes[2];
        case 3 -> shapes[i] = shapes[3];
    }
}
    ShapeUtils.displaysshapes(shapes);
    ShapeUtils.drawShapes(shapes);
    ShapeUtils shapeUtils = new ShapeUtils();
    boolean result = shapeUtils.intersect(shapes, rectangle);
    System.out.println("Intersection result: " + result);
}}
