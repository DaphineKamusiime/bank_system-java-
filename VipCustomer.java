public class VipCustomer {
    String name, emailAddress;
    double creditLimit;
    
    //constructor
    public VipCustomer(){
    }
    
    public String toString(){
        return "Name: " + this.name;
    }
    //contructor
    public VipCustomer(String name1, String emailAddress1){
        this.name = name1;
        this.emailAddress= emailAddress1;
    }

    //constructor
    public VipCustomer(String name3, String emailAddress3, double creditLimit){
        this.name= name3;
        this.emailAddress = emailAddress3;
        this.creditLimit = creditLimit;
    }

    public String getName(){
        return name;
    }

    public String getemailAddress(){
        return emailAddress;
    }

    public double getCreditlimit(){
        return creditLimit;
    }
}
