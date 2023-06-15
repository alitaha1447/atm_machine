package ArrayListProjectDynamic;

public class ContactBook {
    private String name;
    private Integer phoneNumber;
    private String city;

    public ContactBook(String name, Integer phoneNumber, String city) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getCity() {
        return city;
    }
}
