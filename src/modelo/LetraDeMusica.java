package modelo;

import java.lang.StringBuilder;

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

    public String toString() {
        StringBuilder letra = new StringBuilder();
        letra.append("\tLETRA TRADUZIDA\n\n");
        letra.append(corpoTraduzido +"\n\n\n");
        letra.append("\tLETRA ORIGINAL\n\n");
        letra.append(corpoOriginal + "\n\n");

        return letra.toString();
    }
}
