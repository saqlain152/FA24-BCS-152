public  class Cube extends Shape3D {
    private double side;
    public Cube (double side){
        super();
        this.side=side;
        
    }

public double getside(){
    return side;
}
public void setside(double side){
    this.side=side;

}

public double area(){
    return 6*side*side;
}
public double volume(){
    return side*side*side;
}

public String toString(){
    return "Cube: side = "+side+" area = "+area()+" volume = "+volume();
}}