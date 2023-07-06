/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Ardent
 */
public class PhonenoValidator {
    public  boolean validate(String phno) {

     // String sPhoneNumber = "605-8889999";
      //String sPhoneNumber = "605-88899991";
      //String sPhoneNumber = "605-888999A";

      Pattern pattern = Pattern.compile("^((\\+|00)(\\d{1,3})[\\s-]?)?(\\d{10})$");
      Matcher matcher = pattern.matcher(phno);

      if (matcher.matches()) {
          return true;
      } else {
          return false;
      }
    
}
}