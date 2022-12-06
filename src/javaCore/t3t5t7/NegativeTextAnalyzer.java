package javaCore.t3t5t7;

import static javaCore.t3t5t7.Label.*;

public class NegativeTextAnalyzer extends KeywordAnalyzer {

    private final String[] emoticons = {":(", "=(", ":|"};

    public NegativeTextAnalyzer() {
    }

    @Override
    protected String[] getKeywords() {
        return emoticons;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
