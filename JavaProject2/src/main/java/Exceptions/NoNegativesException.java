package Exceptions;

public class NoNegativesException extends Exception{

    public String getMessage(){
        return "Please enter a positive integer";
    }
}