import java.text.DateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Test {
    public static void main(String[] args) {
        String dates = "31 Oct 2020 21:00:00 GMT";
        Date billDate = new Date();
        String daten = billDate.getMonth() + "-" + billDate.getYear();
        SimpleDateFormat formatter = new SimpleDateFormat("MM-yyyy");
        System.out.println(formatter.format(billDate));
 
        try {
           // Date selectedMonthStart = formatMonthYear.parse(dates);
           // System.out.println(selectedMonthStart.toLocaleString());
            Date selectedMonthStartw = formatter.parse(formatter.format(billDate));
            System.out.println(selectedMonthStartw.toLocaleString());
        } catch (Exception e) {
            // TODO: handle exception
             System.out.println(e.toString());
            System.out.println();
        }

    }
}