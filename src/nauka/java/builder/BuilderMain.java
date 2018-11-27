package nauka.java.builder;

public class BuilderMain {

    public static void main(String[] args) {

        int i = 0;

        while(i++ < 10) {
            if (i % 3 == 0) {
                break;
            }

            System.out.println("Number is " + i);

            if (i % 2 == 0) {
                System.out.println(i + " is even");
            }
        }
    }
}
