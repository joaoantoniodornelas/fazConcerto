import java.util.Date;

/**
 * Created by andrecorreia on 6/13/17.
 */
public abstract class Person {
    //attributes
    private String email;
    private int CPF;
    private String address;
    private int phone;
    private Date birth_date;
    //methods
    //getters
    public String get_email(){return email;}
    public int get_CPF(){return CPF;}
    public String get_address(){return address;}
    public int get_phone(){return phone;}
    public Date get_birthDate(){return birth_date;}
    //setters
    public void set_email(String email){this.email = email;}
    public void set_CPF(int CPF){this.CPF = CPF;}
    public void set_address(String address){this.address = address;}
    public void set_phone(int phone){this.phone = phone;}
    public void set_birthDate(Date birth_date){this.birth_date = birth_date;}
}
