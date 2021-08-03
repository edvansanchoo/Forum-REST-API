package br.com.alura.forum.config.validacao;

public class ErroDeFormulatioDto {

    private String campo;
    private String erro;

    public ErroDeFormulatioDto(String campo, String erro) {
        this.campo = campo;
        this.erro = erro;
    }

    public String getCampo() {
        return campo;
    }

    public String getErro() {
        return erro;
    }


}
