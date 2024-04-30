package Objects;

public class Address {
    //state
    private String line1;
    private String city;
    private String zip;

    //constructer
    public Address(String line1, String city, String zip) {
        super();
        this.line1 = line1;
        this.city = city;
        this.zip = zip;
    }

    public String toString() {
        return line1 + " " + city + " " + zip;
    }
}
