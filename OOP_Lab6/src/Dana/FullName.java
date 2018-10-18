package Dana;

public class FullName {
    String name;

    public FullName(String firstname,String surname){
        name=firstname+" "+surname;
    }

    public String FullName(){
        return name;
    }
}
