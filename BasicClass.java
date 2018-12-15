class Box {
    double width;
    private double height;
    private double depth;
    String name;
    private double weight; // Testing the Box constructor, initialize to zero

    Box (double width, double height, double depth, String name){
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.name = name;
    }

    Box (Box object) {
        width = object.width;
        height = object.height;
        depth = object.depth;
        name = object.name + "(2)";
    }

    double volume() {
        return width * height * depth;
    }

    // Method overload
    double volume(double ratio) {
        return width * height * depth * ratio;
    }

    void print_weight() {
        System.out.println("The weight of the box is: " + weight);
    }
}

public class BasicClass {
    public static void main(String args[]) {
        Box my_first_box = new Box(10, 20, 15, "the first box");
        Box my_second_box = new Box(5, 6, 7, "the second box");
        Box copy_box = new Box(my_first_box);

        System.out.println("The volume of " + my_first_box.name + " is: " + my_first_box.volume());
        System.out.println("The volume of " + my_second_box.name + " is: " + my_second_box.volume());
        System.out.println("The volume of " + copy_box.name + " is: " + copy_box.volume());
        my_first_box.print_weight();

        // Altering the width since it's not private
        my_first_box.width = 9;
        System.out.println("The new volume of " + my_first_box.name + " is: " + my_first_box.volume());
        System.out.println("The new volume of " + copy_box.name + " is: " + copy_box.volume());
        System.out.println("The volume of the " + my_first_box.name + " when doubled is: " +
                my_first_box.volume(2));
    }
}

