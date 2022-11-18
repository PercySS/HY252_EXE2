package csd.uoc.gr.A21;

public class Sphere extends SolidShape{
    private double radius;

    public Sphere(double x, double y, double z, double radius) {
        super(x, y, z);
        setRadius(radius);
        setVolume((double)4/3*Math.PI*Math.pow(radius, 3));
        setFaces(1);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "radius: " + getRadius() + "\n";
        sb.append(super.toString());
        sb.append(str);
        return sb.toString();
    }
}
