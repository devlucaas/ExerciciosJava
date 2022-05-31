package LISTAV.Q3;

public class Usuario {
    private String login, senha;
     
    public Usuario(String login, String senha){
        this.login = login;
        this.senha = senha;
    }

    public void mostrarUsuario(){
        System.out.printf("Usuario: %s \tSenha: %s", this.login, this.senha);
    }
}
