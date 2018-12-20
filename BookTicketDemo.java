package AirRes;
import java.util.*;
public class BookTicketDemo {
    private static Scanner scanner = new Scanner(System.in);
     private static BookTicket ticket;
     private static Flights newFlight=new Flights("Mum","Bom");
     private static PassengerDetails newPassenger;
    public static void main(String args[]){
        boolean quit = false;
       
        printActions();
        while(!quit){
            System.out.println("Enter action: (4 to show available options)");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action){
                case 0:
                    System.out.println("Quitting..");
                    quit = true;
                    break;
                case 1:
                	System.out.println("Enter your source:");
                    String source=scanner.nextLine();
                    System.out.println("Enter your Destination:");
                    String destination=scanner.nextLine();
                    System.out.println("Enter Ticket Type(economy/business):");
                    String ticketType=scanner.nextLine();
                    if(setSearch(source,destination)==true){
                        System.out.println("Enter Passenger Name:");
                        String name=scanner.nextLine();
                        System.out.println("Enter Passenger Email:");
                        String email=scanner.nextLine();
                        System.out.println("Enter Passenger Number:");
                        Double num=scanner.nextDouble();
                        System.out.println("Enter Passenger Age:");
                        int age=scanner.nextInt();
                        ticket=new BookTicket(source,destination,ticketType,name,age,email,num);
                        ticket.classType(ticketType);
                    }                    
                    break;
                case 2: 
                    ticket.displayTicket();
                    System.out.println("You will be directed to the payment gateway shortly!Chillax. We have already reserved you a seat.");
                    
                    break;
                case 3:
                    printActions();
                    break;
            }
        }
    }
    private static void printActions(){
        System.out.println("available actions:\nPress");
        System.out.println("0-to shutdown\n"+
                            "1-to book a ticket\n"+
                            "2-to pay the amount\n"+
                            "3-to print a list of available options\n");
        System.out.println("Choose your action:");

    }
    private static boolean setSearch(String source,String destination){
    	if(newFlight.searchFlight(source,destination)==true){
    		return true;
   		}
   		return false;
   	}
}
