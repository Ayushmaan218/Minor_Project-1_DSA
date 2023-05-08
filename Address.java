public class Address {
    private String streetAddress;
    private String city;
    private String State;
    private String country;
    private int zipCode;
    public Address(String streetAddress, String city, String State, String country, int zipCode){
        this.streetAddress = streetAddress;
        this.city = city;
        this.State = State;
        this.country = country;
        this.zipCode = zipCode;
    }
    public String getStreetAddress() {
        return streetAddress;
    }
    
    public String getCity() {
        return city;
    }
    
    public String getState() {
        return State;
    }
    
    public String getCountry() {
        return country;
    }
    
    public int getZipCode() {
        return zipCode;
    } 
}
