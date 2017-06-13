import java.util.Date;

/**
 * Created by andrecorreia on 6/13/17.
 */
public class Client extends Person {
    //attributes
    private int id;

    //methods
    public Client( String email, int CPF, String address, int phone, Date birth_date){
        super.set_email(email);
        super.set_CPF(CPF);
        super.set_address(address);
        super.set_phone(phone);
        super.set_birthDate(birth_date);
    }
    //getters
    public int getId(){return id;}
    //setters
    public void setId(int id){this.id = id;}

    /*Awaiting further details about other classes*/
    public void request_service(){} //sends the request to db
    public void check_service_order(){} //re-affirm service order
    public void edit_service_order(){} // Edit service order
    public void remove_service_order(){}//Remove service order
    public boolean accept_budget(){} //true if Client accepted the budget and false otherwise
    public void payment(){} //payment
}
