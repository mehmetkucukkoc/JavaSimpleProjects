package HomeWorks.birOn;

import java.time.DateTimeException;
import java.time.LocalDate;

public class Exceptions04 {
    public static void main(String[] args) {
      // LocalDate date= LocalDate.of(2022,12,35);
      // System.out.println(date);//RTE -> DateTimeException
        try{
            LocalDate date= LocalDate.of(2022,12,35);

        }catch (DateTimeException e){
            System.out.println(e.getMessage());
        }
    }
}
