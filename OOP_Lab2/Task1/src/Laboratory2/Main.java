package Laboratory2;

public class Main {

    public static void main(String[] args) {
                Box Box1 = new Box();
                Box Box2 = new Box(7);
                Box Box3 = new Box(6,3,9);

                System.out.println("The method without parameters (every attribute is instantiated to 1):");
                System.out.println("The area of the first box is: " + Box1.getArea());
                System.out.println("The volume of the first box is: " + Box1.getVolume());
                System.out.println();

                System.out.println("The method with 1 parameter (every attribute is instantiated with that parameter):");
                System.out.println("The area of the second box is: " + Box2.getArea());
                System.out.println("The volume of the second box is:" + Box2.getVolume());
                System.out.println();


                System.out.println("The method with 3 parameters for each attribute:");
                System.out.println("The area of third box is: " + Box3.getArea());
                System.out.println("The volume of the third box is: " + Box3.getVolume());
            }
        }
