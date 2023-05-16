package personal.views;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateData {

    String patternName = "^\\S+$";    
    
    String patternPhoneNum = "\\+7\\(\\d{3}\\)-\\d{3}-\\d{2}-\\d{2}";
    Pattern pattern = Pattern.compile(patternName, Pattern.MULTILINE);
    Pattern patternPhoneNumber = Pattern.compile(patternPhoneNum);
   

    public boolean checkFirstName(String firstName){
        Matcher matcher = pattern.matcher(firstName);
        return !matcher.find();
    }
    public boolean checkLastName(String firstName){
        Matcher matcher = pattern.matcher(firstName);
        return !matcher.find();
    }
    public boolean checkPhoneNumber(String phone){
        Matcher matcher = patternPhoneNumber.matcher(phone);
        return !matcher.find();

        //if(!phone.substring(0,1).equals("+")) {
         //   System.out.println("Внимание, номер начинается с '+'!");
        //} else if (phone.length() != 12) {
        //    System.out.println("В номере 12 цифр");            
       // }
    }

}
