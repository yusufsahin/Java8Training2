import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) {

        Locale locale= Locale.UK;
        ResourceBundle bundle = ResourceBundle.getBundle("message", locale);

        System.out.println(Locale.getDefault());

        String greeting=bundle.getString("greeting");
        String  farewell= bundle.getString("farewell");
        String namePrompt= bundle.getString("namePrompt");

        System.out.println(namePrompt);
        System.out.println(farewell);
        System.out.println(namePrompt);

        LocalDateTime now= LocalDateTime.now();

        DateTimeFormatter formatter =DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(Locale.FRENCH);

        String formattedDate=formatter.format(now);
        System.out.println(formattedDate);

        double amount= 156878.56;
        NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance(Locale.getDefault());
        String currencyString = moneyFormatter.format(amount);
        System.out.println(currencyString);

    }
}