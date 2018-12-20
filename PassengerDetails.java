package AirRes;

public class PassengerDetails {
    private String passName;
    private Integer passAge;
    private String passEmail;
    private Double passNum;

    public PassengerDetails(String passName,Integer passAge,String passEmail,Double passNum)
    {
    	this.passName=passName;
    	this.passAge=passAge;
    	this.passEmail=passEmail;
    	this.passNum=passNum;
    }
    public String getName(){
    	return this.passName;
    }
    public Integer getAge(){
    	return this.passAge;
    }
    public String getEmail(){
    	return this.passEmail;
    }
    public String getNum(){
    	return String.valueOf(this.passNum);
    }

}
