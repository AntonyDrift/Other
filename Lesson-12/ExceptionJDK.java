public class ExceptionJDK {

    static void task(){

        NullPointerException runEx = new NullPointerException();
        runEx.initCause(new ArithmeticException());
        throw runEx;
    }
}
