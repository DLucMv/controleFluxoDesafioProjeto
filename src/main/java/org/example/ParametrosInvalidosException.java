package org.example;

public class ParametrosInvalidosException extends Exception{

    String msg = "parâmetro1 não pode ser maior que parâmetro2";

    public ParametrosInvalidosException(){
    }

    public String getMsg() {
        return msg;
    }
}
