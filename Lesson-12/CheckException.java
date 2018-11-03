public class CheckException {

    String task1;
    final String[] task2 = new String[4];


    public void exceptions() {

        try {
            int size = task1.length();
            System.out.println(size);

        } catch (Exception ex) {
            ex.printStackTrace(System.out.printf("My first exception is: "));
        }
        System.out.println("*******1********");

        try {
            System.out.println(task2[6]);

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("My second exception is: " + ex);
        }
        System.out.println("*******2********");

        try {
            String result = EnterText.thirdException("123467111111231321489");
            System.out.println(result);

        } catch (MyException ex) {
            ex.printStackTrace(System.out);
        }
        System.out.println("******3/4*******");

        try {
            ExceptionJDK.task();
        } catch (NullPointerException ex) {
            System.out.println("Take " + ex);
            System.out.println("and replace to " + ex.getCause());
        }
        System.out.println("*******5********");
    }

    public void randomExceptions() {

        int random = 1 + (int) (Math.random() * ((3 - 1) + 1));
        try {
            switch (random) {
                case 1:
                    throw new NullPointerException();
                case 2:
                    throw new ArithmeticException();
                case 3:
                    throw new ArrayIndexOutOfBoundsException();
            }
        } catch (Exception ex) {
           ex.printStackTrace(System.out);
        }
        System.out.println("*******6********");
    }
    public void fiftyPercent() {

        int random = 1 + (int) (Math.random() * ((2 - 1) + 1));
        try {
            switch (random) {
                case 1:
                    throw new NullPointerException();
                case 2:
                    System.out.println("No exceptions");
            }
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        finally {
            System.out.println("*******7********");
        }
    }
}
