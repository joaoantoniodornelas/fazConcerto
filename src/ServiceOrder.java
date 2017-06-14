/**
 * Created by joao on 13/06/17.
 */
public class ServiceOrder {
    //Cliente e técnico da ordem
    Client client;
    Technician technician;

    //Variável de controle para verificar se a ordem foi atendida ou nao
    Boolean serviceAttended;

    //Número da ordem e seu status
    long serviceOrderNumber;
    String serviceOrderStatus;

    //Serviço necessário e descrição detalhada
    String serviceNeeded;
    String serviceDescription;

    //Arquivo com o orçamento
    ServiceBudget serviceBudget;

    //Construtor da ordem de serviço
    public ServiceOrder(Client newClient, Technician newTechnician, String newServiceNeeded, String newServiceDescription){
        this.client = newClient;
        this.technician = newTechnician;
        this.serviceAttended = false;
        this.serviceOrderNumber = generateNewServiceNumber();
        this.serviceOrderStatus = "Cadastrada";
        this.serviceNeeded = newServiceNeeded;
        this.serviceDescription = newServiceDescription;
        this.serviceBudget = new ServiceBudget();
    }

    //Função geradora da chave única da ordem de serviço
    long generateNewServiceNumber(){

    }
}
