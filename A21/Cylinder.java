package csd.uoc.gr.A21;


public class Cylinder extends SolidShape{
    private double radius;
    private double height;

    public Cylinder(double x, double y, double z, double radius, double height) {
        super(x, y, z);
        setRadius(radius);
        setHeight(height);
        setFaces(2);
        setVolume(Math.PI * getHeight() * Math.pow(getRadius(), 2));
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "radius: " + getRadius() + "\n";
        String str2 = "height: " + getHeight() + "\n";
        sb.append(super.toString());
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }
}
