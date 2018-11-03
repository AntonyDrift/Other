public class MyException extends /*Exception*/RuntimeException{
    private String task3;

    public String getTask3() {
        return task3;
    }

    public MyException(String message, String length){

        super(message);
        this.task3=length;
    }
}
