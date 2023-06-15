package ArrayListProject;

public class PhoneBook {
    private String name;
    private String phoneNumber;

    //public PhoneBook(){}
    public PhoneBook(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
