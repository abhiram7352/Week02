import java.util.Scanner;

class MovieTicket {
    String movieName;
    int seatNumber;
    int price;
    boolean isBooked = false; // To track if the ticket is already booked

    // Constructor
    MovieTicket(String movieName, int seatNumber, int price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    // Book a ticket
    public void bookMovieTicket() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Your ticket booking status: Confirmed");
            System.out.println("Movie name: " + movieName);
            System.out.println("Seat number: " + seatNumber);
            System.out.println("Cost: INR " + price);
        } else {
            System.out.println("This seat is already booked.");
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter movie name: ");
        String movieName = sc.nextLine();

        System.out.println("Enter seat number: ");
        int seatNumber = sc.nextInt();

        System.out.println("Enter price: ");
        int price = sc.nextInt();

        // Create a MovieTicket object
        MovieTicket ticket = new MovieTicket(movieName, seatNumber, price);
        ticket.bookMovieTicket();

        sc.close(); // Closed the scanner to prevent resource leaks
    }
}
