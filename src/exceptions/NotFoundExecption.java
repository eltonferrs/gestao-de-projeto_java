package exceptions;

public class NotFoundExecption extends Exception{
    public NotFoundExecption(){
        super("Not found");
    }

    public NotFoundExecption(String message){
        super(message);
    }
}
