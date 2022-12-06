package javaCore.t3t5t7;

import static javaCore.t3t5t7.Label.*;

public class TooLongTextAnalyzer implements TextAnalyzer{

    private int maxLength;

    public TooLongTextAnalyzer(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public Label processText(String text) {
        if(text.length() > maxLength) {
            return Label.TOO_LONG;
        }
        return Label.OK;
    }
}
