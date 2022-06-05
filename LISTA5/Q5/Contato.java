package LISTA5.Q5;

public class Contato {
    String telefoneResid;
    String celular;
    String email;

    public Contato(){
    }

    public Contato(String telefoneResid, String celular, String email) {
        this.telefoneResid = telefoneResid;
        this.celular = celular;
        this.email = email;
    }

    public String getTelefoneResid() {
        return telefoneResid;
    }

    public void setTelefoneResid(String telefoneResid) {
        this.telefoneResid = telefoneResid;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    
}
