package Week_01.HomeWork;

public class Main {

    public static void main(String[] args) {

        Movie movie = new Movie("Interstellar", "Science Fiction");
        movie.getMovieInfo();

        System.out.println("-------------------------------");

        MobilePhone mobile = new MobilePhone("Xiaomi", 47000);
        mobile.showSpecs();

        System.out.println("-------------------------------");

        String[] features = {"Air conditioning", "LED", "Lights", "Air bags", "Parking sensors"};
        Vehicle myCar = new Vehicle("Brown", "BMW", 2022, features);
        myCar.printDetails();

    }

}
