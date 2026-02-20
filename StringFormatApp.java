public class StringFormatApp {

    public static void main(String[] args) {

        String name = args[0];
        int age = Integer.parseInt(args[1]);
        float height = Float.parseFloat(args[2]);
        
        System.out.printf("name: %-20s Age: %3d Height: %4.2fm%n", name, age, height);

        float new_height = height *= 1.023;
        System.out.printf("My space height would be %.1f%n", new_height);

        float new_age = age / 1.88f;
        System.out.printf("On Mars I would be approximately %.0f years old.%n", new_age);


    }

}