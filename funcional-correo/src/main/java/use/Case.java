package use;

import model.Email;
import util.DataUtil;

import java.util.List;
import java.util.stream.Collectors;

public class Case {
    public static List<String> execute(){
        List<Email> emails = DataUtil.getEmails();
        return emails.stream()
                .map(email -> email.getEmail())
                .collect(Collectors.toList());
    }
}
