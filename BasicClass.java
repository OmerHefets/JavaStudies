class Box {
    double width;
    double height;
    double depth;
}

public class BasicClass {
    public static void main(String args[]) {
        Box my_first_box = new Box();
        Box my_second_box = new Box();
        double vol_first_box, vol_second_box;

        my_first_box.width = 10;
        my_first_box.height = 20;
        my_first_box.depth = 15;

        my_second_box.width = 5;
        my_second_box.height = 6;
        my_second_box.depth = 7;

        vol_first_box = my_first_box.width * my_first_box.height * my_first_box.depth;
        System.out.println("The volume is " + vol_first_box);

        vol_second_box = my_second_box.width * my_second_box.height * my_second_box.depth;
        System.out.println("The volume is " + vol_second_box);
    }
}
