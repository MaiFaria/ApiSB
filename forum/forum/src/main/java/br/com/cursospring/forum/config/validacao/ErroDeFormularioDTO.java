package br.com.cursospring.forum.config.validacao;

public class ErroDeFormularioDTO {

    public String getCampo() {
        return campo;
    }

    public String getErro() {
        return erro;
    }

    private String campo;
    private String erro;

    public ErroDeFormularioDTO(String campo, String erro) {
        this.campo = campo;
        this.erro = erro;
    }
}
