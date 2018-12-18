class Box {
    double width;
    double height;
    double depth;
    String name;
    double weight; // Testing the Box constructor, initialize to zero

    Box (double w, double h, double d, String n){
        width = w;
        height = h;
        depth = d;
        name = n;
    }

    Box (Box object) {
        width = object.width;
        height = object.height;
        depth = object.depth;
        name = object.name + "(2)";
    }

    Box (){
        width = -1;
        height = -1;
        depth = -1;
        name = "No Name";
    }

    double volume() {
        return width * height * depth;
    }

    // Method overload
    double volume(double ratio) {
        return width * height * depth * ratio;
    }

    void print_numbers_in_box(int ... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
            System.out.println();
        }
    }

    void print_weight() {
        System.out.println("The weight of the box is: " + weight);
    }
}

class Cube extends Box {
    Cube (double edge){
        this.width = this.height = this.depth = edge;
    }

    Cube (Box object) {
        super(object);
        height = depth = width;
    }


    void print_cube_volume() {
        System.out.println("The volume of this cube is: " + volume());
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

        //Implementing vararg
        int a = 5, b = 6, c = 7, zz = 99;
        my_first_box.print_numbers_in_box(a, b, c, zz);

        Cube my_first_cube = new Cube(5);
        Cube my_second_cube = new Cube(my_first_box);
        my_first_cube.print_cube_volume();
        my_second_cube.print_cube_volume();
    }
}

