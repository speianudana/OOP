package Dana;

class Address{
    String address;


    public Address(String country,String region,String street,int nrApartament){
        address=country+","+region+","+street+","+nrApartament;
    }

    public String Address(){
        return address;
    }
}