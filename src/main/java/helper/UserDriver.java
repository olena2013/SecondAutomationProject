package helper;

public class UserDriver {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String zipCode;
    private String refferalCode;
    private String linkedIn;
    private String portfolio;
    private String company;

    public UserDriver() {
        firstName = "Ivan";
        lastName = "Ivanov";
        email = "222";
        phone = "(123)-456-7789";
        zipCode = "44567";
        refferalCode = "847565374";
        linkedIn = "ivan.ivanov@linkedIn.com";
        portfolio = "ivan.portfolio";
        company ="Google";
    }

    public String getFirstName() { return firstName;}
    public String getLastName() { return lastName; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getZipCode() { return zipCode; }
    public String getRefferalCode() { return refferalCode;}
    public String getLinkedIn() { return linkedIn; }
    public String getPortfolio() { return portfolio; }
    public String getCompany() { return company; }
}

