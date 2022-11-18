package csd.uoc.gr.A21;

public class Cube extends SolidShape{
    private int side;
    public Cube(double x, double y, double z, int side) {
        super(x, y, z);
        setSide(side);
        setFaces(6);
        setEdges(12);
        setVertices(8);
        setVolume(Math.pow(side, 3));
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "side: " + getSide() + "\n";
        sb.append(super.toString());
        sb.append(str);
        return sb.toString();
    }
}
