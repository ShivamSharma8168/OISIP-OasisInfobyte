import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class user{
    private int ID;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String emailid;
    private String contactNumber;
    private int pinCode;
    private double balance;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-mm-dd");


    

    public user(){
        

    }
    public int getID(){
        return ID;
    }
    public void setID(int ID){
        this.ID = ID;
    }
    public String getFirstName(){
        return  firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(String lastName){
        return lastName;
    }
    public void setlastName(String lastName){
        this.lastName = lastName;
    }
    public String getBirthDate(){
        return formatter.format(birthDate);

    }
    public void setBirthDate(String birthDate){
        this.birthDate  = LocalDate.parse(birthDate , formatter);

    } 
    public String getEmail(String emailid){
        return emailid;
    }
    public void setEmail(String emailid){
        this.emailid  = emailid;
    }
    public String getContactNumber(){
        return contactNumber;
    }
    public void setContactNumber(String contactNumber){
        this.contactNumber = contactNumber;
    }
    public int getPinCode(){
        return pinCode;
    }
    public void setPinCode(int pinCode){
        this.pinCode = pinCode;
    }
    public double getBalance (){
        return balance;
    }
    public void setbalance(double balance){
        this.balance = balance;
    }
    




}