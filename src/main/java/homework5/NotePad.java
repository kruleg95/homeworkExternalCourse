package homework5;

import java.util.ArrayList;
import java.util.Date;

public class NotePad {

    private Date date;
    private ArrayList<AdditionalText> texts;

    public NotePad(Date date) {
        this.date = date;
        texts = new ArrayList<>();
    }

    class AdditionalText {
        private String text;
        private String type;

        public AdditionalText(String text, String type) {
            this.text = text;
            this.type = type;
        }

        public String getType() {
            return type;
        }

        public String getText() {
            return text;
        }

        public Date getDate() {
            return date;
        }
    }

    public ArrayList<AdditionalText> getTexts() {
        return texts;
    }


    public Date getDate() {
        return date;
    }

    public void addText(String text, String type) {
        texts.add(new AdditionalText(text,type));
    }

}
