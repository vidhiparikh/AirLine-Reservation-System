package AirRes;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;
public class BookTicket {
	private String ticketType;
	private Integer ticketNum;
	private String source;
	private String destination;
    private PassengerDetails myPassenger;
    private Flights newFlight;
    private PlaneDetails myPlane=new PlaneDetails();

    public BookTicket(String source,String destination,String ticketType,String name,Integer age,String email,Double number){
    	this.source=source;
    	this.destination=destination;
    	this.ticketType=ticketType;
    	this.myPassenger=new PassengerDetails(name,age,email,number);
    }
    public String getSource(){
        return this.source;
    }
    public String getDestination(){
        return this.destination;
    }
    public Boolean getTicketType(){
        if(ticketType=="economy")
            return true;
        else
            return false;
    }

    
    public int getPayment(){
        int amount;
        Random rand=new Random();
        amount=rand.nextInt(2000);
        if(getTicketType()==true)
        {
            amount=amount+2000;
            myPlane.capacity=myPlane.capacity-1;
        }
        else
        {
            amount=amount+5000;
            myPlane.capacity=myPlane.capacity-1;
        }
        return amount;
    }
    public void displayTicket(){
        Random rand=new Random();
         System.out.println("Passenger Details:");
            System.out.println(
                this.myPassenger.getName()+"-->"+
                this.myPassenger.getAge()+"-->"+
                this.myPassenger.getEmail()+"-->"+
                this.myPassenger.getNum());
            
        System.out.println("Source:"+getSource()+" Destination: "+getDestination()+" Flight Model: "+myPlane.getModelNo()+" Flight Company :"+myPlane.getCompany());
        System.out.println("Amount :"+getPayment());
        System.out.println("Seat No :A"+rand.nextInt(300));

    }
    public void classType(String ticketType)
    {

    	if(getTicketType()==true){
            if(myPlane.getAvailabilityEco()==true)
            {
                getPayment();
            }
    	}
    	else if(getTicketType()==false){
           if(myPlane.getAvailabilityBus()==true)
            {
                getPayment();
            }
    	}
    }
    
}