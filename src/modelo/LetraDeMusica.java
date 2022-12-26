package modelo;

//import java.util.*;

public class LetraDeMusica {
    private String corpoOriginal;
    private String corpoTraduzido;

    public LetraDeMusica(String corpoOriginal) {
        this.corpoOriginal = corpoOriginal;
    }

    public LetraDeMusica(String corpoOriginal, String corpoTraduzido) {
        this.corpoOriginal = corpoOriginal;
        this.corpoTraduzido = corpoTraduzido;
    }

    public String getCorpoOriginal() {
        return corpoOriginal;
    }

    public void setCorpoOriginal(String corpoOriginal) {
        this.corpoOriginal = corpoOriginal;
    }

    public String getCorpoTraduzido() {
        return corpoTraduzido;
    }

    public void setCorpoTraduzido(String corpoTraduzido) {
        this.corpoTraduzido = corpoTraduzido;
    }
}
