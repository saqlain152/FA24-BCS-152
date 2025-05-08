abstract class Shape3D extends  Shape{
    private String name;
    private double volume;
    Shape3D(){
        super();

    
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getVolume(){
        return volume;
    }
    public void setVolume(double volume){
        this.volume = volume;
    }   
    public abstract double volume();
}
