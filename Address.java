public class Address {
    private String streetAddress;
    private String city;
    private String State;
    private String country;
    private int zipCode;
    public Address(String streetAddress, String State, String country, int zipCode2){
        this.streetAddress = streetAddress;
        this.State = State;
        this.country = country;
        this.zipCode = zipCode2;
    }
    public String getStreetAddress() {
        return streetAddress;
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
    public String toString() {
        return streetAddress + ", " + city + ", " + State + ", " + country + " - " + zipCode;
    } 
}
