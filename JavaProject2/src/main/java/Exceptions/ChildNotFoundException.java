package Exceptions;

public class ChildNotFoundException extends Exception{

    public String getMessage(){
        return "Requested element cannot be found";
    }
}
