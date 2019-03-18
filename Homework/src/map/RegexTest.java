package map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
    
   public static void main(String[] args) {

	   String str = "931114-1000000";

       String regex = "\\d{6}\\-[1|2|3|4]\\d{6}";
       Pattern p = Pattern.compile(regex);
       Matcher m = p.matcher(str);

       boolean flag = m.matches();

       System.out.println(flag);
   }
}
