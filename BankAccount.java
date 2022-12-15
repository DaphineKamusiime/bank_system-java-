class BankAccount{
    String accountNumber;
    double balance;
    String name;
    String email;
    int phoneNumber;
     //creating getter and setter methods for each attribute
    //name
    public void setName( String newName){
        this.name= newName;
    }

    public String getName(){
        return name;
    }
  
    //balance
    public void setBalance(double newBalance){
        this.balance=newBalance;
    }

    public double getBalance(){
        return balance;
    }
   
    //account number
    public void setAcountNumber(String newAccountNumber){
        this.accountNumber= newAccountNumber;
    }

    public String getAccountNumber(){
        return accountNumber;
    }
   
    //email
    public void setEmail(String newEmail){
        this.email= newEmail;
    }

    public String getEmail(){
        return email;
    }
   
    //phone number
    public void setPhoneNumber(int newPhoneNumber){
        this.phoneNumber=newPhoneNumber;
    }
   
    public int getPhoneNumber(){
        return phoneNumber;
    }
    
    public void deposit(double increment){
        balance +=increment;
    }

    public void withdraw(double decrement){
        if(decrement > balance){
            System.out.println("Not enough funds");
        }else{
            balance -= decrement;
        }
    }
    
}

