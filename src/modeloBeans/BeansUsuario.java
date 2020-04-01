package modeloBeans;

public class BeansUsuario {

    private int coduser;
    private String usuNome;
    private String usuSenha;
    private String usuPesquisa;

    public String getUsuPesquisa() {
        return usuPesquisa;
    }

    public void setUsuPesquisa(String usuPesquisa) {
        this.usuPesquisa = usuPesquisa;
    }

    public int getCoduser() {
        return coduser;
    }

    public void setCoduser(int coduser) {
        this.coduser = coduser;
    }

    public String getUsuNome() {
        return usuNome;
    }

    public void setUsuNome(String usuNome) {
        this.usuNome = usuNome;
    }

    public String getUsuSenha() {
        return usuSenha;
    }

    public void setUsuSenha(String usuSenha) {
        this.usuSenha = usuSenha;
    }

}
