public class Parallelepiped {
    private double length;
    private double width;
    private double height;

    public Parallelepiped(double length, double width, double height) throws MyException{
        if(length<=0|| width<=0|| height<0 ){
            throw new MyException("0 and less numbers are not accepted");
        }
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double areaPar(){
        return 2*((height * length) + (length * width) + (height * width));
    }
    public double volumePar(){
        return (length*width*height);
    }

}
