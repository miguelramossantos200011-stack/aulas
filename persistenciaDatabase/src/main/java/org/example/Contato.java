package org.example;

public class Contato {

    private int id;
    private String Name;
    private String Fone;

    public Contato (String Name, String Fone){
        this.Name = Name;
        this.Fone = Fone;
    }

    public Contato (int id, String Name, String Fone){
        this.id = id;
        this.Name = Name;
        this.Fone = Fone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getFone() {
        return Fone;
    }

    public void setFone(String fone) {
        Fone = fone;
    }

    @Override
    public String toString(){
        // FIX: Changed "$d" to "%d"
        return String.format("ID: %d | Nome: %-20s | Telefone: %s", id, Name, Fone);
    }
}