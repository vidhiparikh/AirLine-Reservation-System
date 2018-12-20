package AirRes;

public class PlaneDetails {
    private Integer modelNo=1721005;
    private String company="Indian Airlines";
    public Integer capacity=500;

    public boolean getAvailabilityEco()
    {
    	if(capacity<10)
    	{
    		return false;
    	}
    	return true;
    }
    public boolean getAvailabilityBus()
    {
    	if(capacity<10)
    	{
    		return false;
    	}
    	return true;
    }
    public String getCompany(){
    	return this.company;
    }
    public Integer getModelNo(){
    	return this.modelNo;
    }
}
