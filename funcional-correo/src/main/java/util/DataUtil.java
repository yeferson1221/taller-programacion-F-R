package util;
import com.google.common.collect.ImmutableMap;
import model.Email;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DataUtil {
    public static List<Email> getEmails(){
        List<Email> email = new ArrayList<Email>();
        email.add(new Email (  "yefer@hotmail.com",true));
        email.add(new Email (  "pedro@hotmail.com",true));
        email.add(new Email (  "pablo@hotmail.com",true));
        email.add(new Email (  "text@hotmail.com",true));
        email.add(new Email (  "a@hotmail.com",true));
        email.add(new Email (  "b@hotmail.com",true));
        email.add(new Email (  "c@hotmail.com",true));

        return  email;
    }
}
