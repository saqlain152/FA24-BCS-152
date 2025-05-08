public class ShapeUtils {

    public static void main(String[] args) {
        
        Shape[] shapes = {}; 
        displaysshapes(shapes);
    
    }

    public static void displaysshapes(Shape[] shapes) {
        for (Shape shape : shapes) {
            if (shape != null) {
                System.out.println(shape.toString());
            }
        }
    }
    

    public static void drawShapes(Shape[] shapes) {
        for (Shape shape : shapes) {
            if (shape instanceof Drawable) {
                ((Drawable) shape).draw();
            }
        }
    }



    public  boolean intersect(Shape [] shape,Rectangle rectangle) {
        for (Shape s : shape) {
            if (s instanceof Rectangle) {
                Rectangle r = (Rectangle) s;
                if (rectangle.intersects(r)) {
                    return true;
                }
            }
        }
        return false;
    }
}