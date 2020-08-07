package co.edu.usta.hotel.entities;

public class Client {

    private int id;
    private String names;
    private String surnames;
    private String dni;
    private String email;
    private String phone;

    public Client() {
    }

    public Client(String names) {
        this.names = names;
    }

    public Client(String names, String surnames, String dni, String email, String phone) {
        this.names = names;
        this.surnames = surnames;
        this.dni = dni;
        this.email = email;
        this.phone = phone;
    }

    public Client(int id, String names, String surnames, String dni, String email, String phone) {
        this.id = id;
        this.names = names;
        this.surnames = surnames;
        this.dni = dni;
        this.email = email;
        this.phone = phone;
    }

    public Client(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Client {" +
                "id= " + id +
                ", names= '" + names + '\'' +
                ", surnames= '" + surnames + '\'' +
                ", dni= '" + dni + '\'' +
                ", email= '" + email + '\'' +
                ", phone= '" + phone + '\'' +
                '}';
    }
}
