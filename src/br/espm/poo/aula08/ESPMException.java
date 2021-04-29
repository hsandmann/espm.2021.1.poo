package br.espm.poo.aula08;

public class ESPMException extends Exception {

    public ESPMException(Exception e) {
        super(e);
    }

    public ESPMException(String msg) {
        super(msg);
    }

}
