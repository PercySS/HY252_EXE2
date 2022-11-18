package csd.uoc.gr.A21;

public class Drawing {
    SolidShape[] shapes = new SolidShape[1000];
    private int activeCapacity;
    private int totalFaces;
    private int totalEdges;
    private int totalVertices;
    private double totalVolume;

    public Drawing() {
        setActiveCapacity(0);
        setTotalVolume(0);
        setTotalVertices(0);
        setTotalFaces(0);
        setTotalEdges(0);
    }

    public void setActiveCapacity(int x) {
        this.activeCapacity = x;
    }

    public int getActiveCapacity() {
        return activeCapacity;
    }

    public void setTotalFaces(int x) {
        this.totalFaces = x;
    }

    public int getTotalFaces() {
        return totalFaces;
    }

    public void setTotalEdges(int x) {
        this.totalEdges = x;
    }

    public int getTotalEdges() {
        return totalEdges;
    }

    public void setTotalVertices(int totalVertices) {
        this.totalVertices = totalVertices;
    }

    public int getTotalVertices() {
        return totalVertices;
    }

    public void setTotalVolume(double totalVolume) {
        this.totalVolume = totalVolume;
    }

    public double getTotalVolume() {
        return totalVolume;
    }

    public void add(SolidShape s) {
        if (getActiveCapacity() < 1000) {
            this.shapes[getActiveCapacity()] = s;
            setActiveCapacity(getActiveCapacity() + 1);
        } else {
            System.out.println("No more space.");
        }
    }

    public String toString() {
        for (int i = 0; i < getActiveCapacity(); i++) {
            setTotalEdges(getTotalEdges() + shapes[i].getEdges());
            setTotalFaces(getTotalFaces() + shapes[i].getFaces());
            setTotalVertices(getTotalVertices() + shapes[i].getVertices());
            setTotalVolume(getTotalVolume() + shapes[i].getVolume());
        }
        StringBuilder returnStr = new StringBuilder();
        String s = "Number of shapes: " + getActiveCapacity() + "\n";
        returnStr.append(s);
        s = "Total faces: " + getTotalFaces() + "\n";;
        returnStr.append(s);
        s = "Total vertices: " + getTotalVertices() + "\n";;
        returnStr.append(s);
        s = "Total edges: " + getTotalEdges() + "\n";;
        returnStr.append(s);
        s = "Total volumes: " + getTotalVolume() + "\n";;
        returnStr.append(s);

        return returnStr.toString();
    }


}
