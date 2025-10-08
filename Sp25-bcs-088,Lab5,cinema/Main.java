public class Main {
    public static void main(String args[]) {
//    Seat  seat= new Seat(1,1,1,"standard",true);
//        System.out.println(seat);
//        Screen screen = new Screen("Maula Jutt
// ",2);
//        System.out.println(screen.Layout());
//        Cinema cinema= new Cinema("Goofy cinema",2);
//        System.out.println(cinema);


        CityCinema cityCinema= new CityCinema("Lahore ",2);
        cityCinema.cinemas[0].screens[0].bookSeat(1,0);
        cityCinema.cinemas[0].screens[0].bookSeat(2,2);
        cityCinema.cinemas[0].screens[0].bookSeat(3,3);
        cityCinema.cinemas[0].screens[0].bookSeat(4,4);
        System.out.println(cityCinema.Layout());
       
        System.out.println("Total seats in Cinema 1 in Lahore=  "+cityCinema.cinemas[0].totalAvailable());
        System.out.println("Total seats in Screen 1 of Cinema 1=  "+cityCinema.cinemas[0].screens[0].totalAvailable());
    
        System.out.println("================================");
        CityCinema cityCinema1= new CityCinema("Karachi ",2);
        cityCinema1.cinemas[0].screens[0].bookSeat(1,0);
        cityCinema1.cinemas[0].screens[0].bookSeat(2,2);
        cityCinema1.cinemas[0].screens[0].bookSeat(3,3);
        cityCinema1.cinemas[0].screens[0].bookSeat(4,4);
        System.out.println(cityCinema1.Layout());
        
        System.out.println("Total seats in Cinema 1 in Karachi=  "+cityCinema.cinemas[1].totalAvailable());
        System.out.println("Total seats in Screen 1 of Cinema 1=  "+cityCinema.cinemas[1].screens[0].totalAvailable());
    
    }
}