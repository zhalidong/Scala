package day05;

public class Techers implements Comparable<Techers>{
    @Override
    public int compareTo(Techers o) {
        return this.faceValue-o.faceValue;
    }

    private String name;
    private int faceValue;

    public Techers(String name, int faceValue) {
        this.name = name;
        this.faceValue = faceValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }
}
