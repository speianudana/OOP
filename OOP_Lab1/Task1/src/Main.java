public class Main {

    public static void main(String[] args) {
        Monitor monitor1 = new Monitor();
        Monitor monitor2 = new Monitor();
        monitor1.setDimensions(15);
        monitor1.setColor("grey");
        monitor1.setResolution(1600);
        monitor1.setModel("Dell");
        monitor2.setDimensions(13);
        monitor2.setModel("Apple");
        monitor2.setResolution(2000);
        monitor2.setColor("red");

        System.out.println("Show information about monitors:");
        System.out.println("The first monitor:");
        System.out.println("Model:"+monitor1.getModel());
        System.out.println("Dimension:"+monitor1.getDimensions());
        System.out.println("Color:"+monitor1.getColor());
        System.out.println("Resolution:"+ monitor1.getResolution());
        System.out.println("The second monitor:");
        System.out.println("Model:"+monitor2.getModel());
        System.out.println("Dimension:"+monitor2.getDimensions());
        System.out.println("Color:"+monitor2.getColor());
        System.out.println("Resolution:"+monitor2.getResolution());

        Monitor.compare(monitor1,monitor2);
if (monitor1.resolution>monitor2.resolution){
    System.out.println("The first monitor has bigger resolution than the second monitor" );
} else
{System.out.println("The second monitor has bigger resolution than the first monitor");}

if (monitor1.dimensions>monitor2.dimensions){
    System.out.println("The first monitor has bigger dimensions than the second monitor" );
} else
    {System.out.println("The second monitor has bigger resolution than the first monitor");}


    }
}
