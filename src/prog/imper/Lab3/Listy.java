package prog.imper.Lab3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.apache.log4j.Logger;



public class Listy {
    public static final Logger log = Logger.getLogger(Listy.class);

    private static int SIZE = 1000_000_0;

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
       List<Integer> listA = new ArrayList<>();
        log.info("Size: " + listA.size());
        for (int i = 0; i < SIZE; i++) {
           listA.add(1);
       }
       log.info("Size: " + listA.size());
       long end = System.currentTimeMillis();
       log.info("ArrayList : " + (end - start) / 1000.0 + " [s]");
       
       Random rand=new Random();
       long start0 = System.currentTimeMillis();
        log.info("Size: " + listA.size());
        for (int i = 0; i < 100_00; i++) {
           listA.remove(rand.nextInt(1000_000_0-i));
       }
       log.info("Size: " + listA.size());
       long end0 = System.currentTimeMillis();
       log.info("ArrayList : " + (end0 - start0) / 1000.0 + " [s]");
       

      long start1 = System.currentTimeMillis();
        List<Integer> listB = new ArrayList<>(SIZE);
        log.info("Size: " + listB.size());
        for (int i = 0; i < SIZE; i++) {
            listB.add(rand.nextInt());
       }
        log.info("Size: " + listB.size());
        long end1 = System.currentTimeMillis();
      log.info("ArrayList : " + (end1 - start1) / 1000.0 + " [s]");
      
      
      
    
      long start11 = System.currentTimeMillis();
       log.info("Size: " + listB.size());
       for (int i = 0; i < 100_00; i++) {
          listB.remove(rand.nextInt(1000_000_0-i));
      }
      log.info("Size: " + listB.size());
      long end11 = System.currentTimeMillis();
      log.info("ArrayList : " + (end11 - start11) / 1000.0 + " [s]");
      

        long start2 = System.currentTimeMillis();
        List<Integer> listC = new LinkedList<>();
        log.info("Size: " + listC.size());
        for (int i = 0; i < SIZE; i++) {
            listC.add(1);
        }
        log.info("Size: " + listC.size());
        long end2 = System.currentTimeMillis();
        log.info("ArrayList : " + (end2 - start2) / 1000.0 + " [s]");
        
        
        long start22 = System.currentTimeMillis();
        log.info("Size: " + listC.size());
        for (int i = 0; i < 100_00; i++) {
           listC.remove(rand.nextInt(1000_000_0-i));
       }
       log.info("Size: " + listC.size());
       long end22 = System.currentTimeMillis();
       log.info("ArrayList : " + (end22 - start22) / 1000.0 + " [s]");
        
    }
}