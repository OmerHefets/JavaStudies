class Box {
    double width;
    double height;
    double depth;
    private double weight; // Testing the Box constructor, initialize to zero

    double volume() {
        return width * height * depth;
    }

    void print_weight() {
        System.out.println("The weight of the box is: " + weight);
    }
}

public class BasicClass {
    public static void main(String args[]) {
        Box my_first_box = new Box();
        Box my_second_box = new Box();

        my_first_box.width = 10;
        my_first_box.height = 20;
        my_first_box.depth = 15;

        my_second_box.width = 5;
        my_second_box.height = 6;
        my_second_box.depth = 7;

        System.out.println("The volume of the first box is: " + my_first_box.volume());
        System.out.println("The volume of the second box is: " + my_second_box.volume());
        my_first_box.print_weight();
    }
}

