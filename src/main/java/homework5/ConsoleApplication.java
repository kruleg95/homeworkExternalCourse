package homework5;

import java.util.Date;

public class ConsoleApplication {

    public static void main(String[] args) {
        NotePad notePad = new NotePad(new Date(2019, 3, 21));

        notePad.addText("World", "text");
        notePad.addText("Hi", "text");
        notePad.addText("Everyone", "text");

        for (NotePad.AdditionalText additionalText : notePad.getTexts()) {
            System.out.println(additionalText.getText() + "  " + additionalText.getDate().toString());
        }

    }
}
