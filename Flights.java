package AirRes;
import java.util.LinkedList;
import java.util.*;
public class Flights {
	private String source,destination;
    public static LinkedList<Flights> flightsRun;

    static{
        addFlights();
    }

	public Flights(String source,String destination){
		this.source=source;
		this.destination=destination;
	}
    
    public static void addFlights(){
        flightsRun = new LinkedList<>();
    	flightsRun.add(new Flights("Sydney","Mumbai"));
        flightsRun.add(new Flights("Mumbai","Delhi"));
        flightsRun.add(new Flights("Brisbrane","France"));
        flightsRun.add(new Flights("Italy","Chicago"));
        flightsRun.add(new Flights("Barbados","Ahemdabad"));
        flightsRun.add(new Flights("Mumbai","Venice"));
        flightsRun.add(new Flights("Mumbai","Chicago"));
        System.out.println("Flights added.");
    }
    public String getSource(){
        return this.source;
    }
    public String getDestination(){
        return this.destination;
    }

    public boolean searchFlight(String source,String destination){
        for(int i=0;i<Flights.flightsRun.size();i++){
            Flights newFlight = Flights.flightsRun.get(i);
            if(newFlight.getSource().equals(source)){
                if(newFlight.getDestination().equals(destination)){
                    return true;
                }
            }
        }
        System.out.println("There are no flights flying from "+source+" to "+destination+". Try again later.");
        return false;
    }
}
       