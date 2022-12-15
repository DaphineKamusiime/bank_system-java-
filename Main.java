public class Main {
    public static void main(String[] args){


        VipCustomer myobj= new VipCustomer();
        System.out.println(myobj.emailAddress);
        System.out.println(myobj.creditLimit);
        System.out.println(myobj.name);

        VipCustomer myobj2= new VipCustomer("Daphine","daphne@gmail...");
        System.out.println(myobj2.emailAddress);
        System.out.println(myobj2.creditLimit);
        System.out.println(myobj2.name);

        VipCustomer myobj3 = new VipCustomer("Daphine Kamusiime","daphnekamusiime09@gmail.com",10000000);
        System.out.println(myobj3.emailAddress);
        System.out.println(myobj3.creditLimit);
        System.out.println(myobj3.name);

    }

    


}
