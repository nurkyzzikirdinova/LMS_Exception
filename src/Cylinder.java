public class Cylinder {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) throws  MyException{
        if(height<=0 || radius<=0){
            throw  new MyException("Less numbers and 0 isn't acceptable");
        }

        this.radius = radius;
        this.height = height;
    }
    public double areaCylinder() {
        return 2*Math.PI * radius*( height + radius);
    }
     public double volumeCylinder() {
        return (Math.PI*radius*radius*height);
    }

}
