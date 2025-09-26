public class Apple {
    private String color;
    private double size;

    public Apple() {}

    public Apple(String color, double size) {
        this.color = color;
        this.size = size;
    }
    public String getColor(){
        return color;
    }
    public double getSize(){
        return size;
    }
    public void setColor(String newColor){
        color = newColor;
    }
    public void setSize(double newSize){
        size = newSize;
    }
}