/**
 * Created by joao on 13/06/17.
 */
public class ServiceBudget {
    //Dados do cliente
    Client client;
    //Servico desejado
    String serviceNeeded;

    //Horas necessárias e o valor de cada uma
    float hoursNeeded;
    float hourValue;

    //Lista de maateriais e seus respectivos valores
    String []materialsNeeded;
    float []materialsValue;

    //Valor total do orçamento e o número de dias máximo de validade
    float totalValue;
    float daysLimit;

    public ServiceBudget(Client newClient, String newServiceNeeded){
        this.client = newClient;
        this.serviceNeeded = newServiceNeeded;
        this.hoursNeeded = 0; this.hourValue = 0; this.totalValue = 0; this.daysLimit = 0;
    }
}
