package co.edu.usta.hotel.controllers;

import co.edu.usta.hotel.repositories.ClientDB;
import co.edu.usta.hotel.entities.Client;

import java.util.List;

public class ClientController {

    private final ClientDB clientDB;

    public ClientController() {
        clientDB = new ClientDB();
    }

    public boolean addClient(String names, String surnames, String dni, String email, String phone) {
        Client client = new Client(names, surnames, dni, email, phone);
        return clientDB.add(client);
    }

    public boolean updateClient(int id, String names, String surnames, String dni, String email, String phone) {
        Client client = new Client(id, names, surnames, dni, email, phone);
        return clientDB.update(client);
    }

    public Client getOneClient(String ic){
        return clientDB.getOne(ic);
    }

    public boolean deleteClient(int id){
        Client client = new Client(id);
        return clientDB.delete(client);
    }

    public List<Client> showClients(){
        return clientDB.show();
    }

    public Client getByNameClient(String name){
        return clientDB.getByName(name);
    }
}
