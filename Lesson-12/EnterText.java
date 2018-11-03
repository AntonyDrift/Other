public class EnterText {

    public static String thirdException(String testTask3) throws MyException {

        String result = new String();
        if (testTask3.length() > 8) throw new MyException("Enter text less than 8 characters", testTask3);
        return result;
    }
}



