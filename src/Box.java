public class Box {

    public Double volume(double length,double breadth,double height)
    {
        double v = length*breadth*height;
        return v;
    }
    public Double area(double length,double breadth,double height)
    {
        double a=2*((length*breadth)+(breadth*height));
        return a;
    }

}