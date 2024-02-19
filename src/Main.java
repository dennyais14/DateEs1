import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

//Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
//Formatta la data ottenuta in FULL, MEDIUM e SHORT
//Stampa le varie versioni
public class Main {
    public static void main(String[] args) {
        OffsetDateTime data1 = OffsetDateTime.parse("2002-03-01T13:00:00Z");

        String dataStringFull = data1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println(dataStringFull);

        String dataStringMedium = data1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println(dataStringMedium);

        String dataStringShort = data1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println(dataStringShort);
    }
}