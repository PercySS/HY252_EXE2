package csd.uoc.gr.A21;

public class SolidShape {
    private double x;
    private double y;
    private double z;

    private int faces;
    private int vertices;
    private int edges;
    private double volume;

    public SolidShape(double x, double y, double z) {
        setX(x);
        setY(y);
        setZ(z);
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setFaces(int x) {
        this.faces = x;
    }

    public int getFaces() {
        return faces;
    }

    public void setVertices(int x) {
        this.vertices = x;
    }

    public int getVertices() {
        return vertices;
    }

    public void setEdges(int x) {
        this.edges = x;
    }

    public int getEdges() {
        return edges;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return  volume;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Solid shape centered at (" + (double) getX() + ", " + (double) getY() + ", " + (double) getZ() + ") with \n");
        str.append("faces: " + getFaces() + "\n");
        str.append("vertices : " + getVertices() + "\n");
        str.append("edges: " + getEdges() + "\n");
        str.append("volume: " + getVolume() + "\n");

        return str.toString();
    }
}
