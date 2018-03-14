package prog.imper.Lab4;

import org.apache.log4j.Logger;

public class Exceptions2 {
    private static Logger log = Logger.getLogger(Exceptions2.class);

    public void throwNullPointerException() {
        String a = null;
        log.info(a.toString());
    }

    public void throwIndexOutOfBoundException() {
        int[] array = new int[10];
        for (int i = 0; i <= array.length; i++) {
            int tmp = array[i];
        }
    }

    public void throwOutOfMemmoryError() {
        Double[][] bigMatrix = new Double[100000][100000];
    }

    public void throwArithmeticException() {
        int a = 1, b, c = 0;
        c = a /c;
    }

    public static void main(String[] args) {
        Exceptions2 ee = new Exceptions2();
        //ee.throwNullPointerException();
        //ee.throwArithmeticException();
        //ee.throwIndexOutOfBoundException();
        ee.throwOutOfMemmoryError();
        
    }
}
