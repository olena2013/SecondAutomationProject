package helper;

public class UserApplicant {
    private String fullName;
    private String email;
    private String phone;
    private String company;
    private String linkedIn;
    private String portfolio;
    private String addInfo;

    public UserApplicant() {
        fullName = "Ivan Ivanov";
        email ="222";
        phone ="(234)-456-7789";
        company = "Google";
        linkedIn = "ivan.ivanov@linkedIn.com";
        portfolio = "ivan.portfolio";
        addInfo = " I like to create automation test cases";
    }
    public String getLinkedIn() { return linkedIn; }
    public String getPortfolio() { return portfolio; }
    public String getCompany() { return company; }
    public String getAddInfo(){return addInfo; }
    public String getFullName() { return fullName; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
}