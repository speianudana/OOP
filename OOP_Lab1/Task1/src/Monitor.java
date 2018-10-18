

public class Monitor {
    public String model;
    String color;
    int dimensions;
    int resolution;


    public void setDimensions(int dimensions) {
        this.dimensions = dimensions;
    }

    public int getDimensions() {
        return dimensions;

    }
    public void setModel(String model)
    {
        this.model=model;
    }
    public String getModel(){
        return model;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
    public void setResolution(int resolution){
        this.resolution=resolution;
    }
    public int getResolution(){
        return resolution;
    }

    public static void compare(Monitor monitor1 , Monitor monitor2){

    }
}
