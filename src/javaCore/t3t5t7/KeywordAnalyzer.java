package javaCore.t3t5t7;

public abstract class KeywordAnalyzer implements TextAnalyzer {

    public Label processText(String text) {
        for (int i = 0; i < getKeywords().length; i++) {
            if (text.contains(getKeywords()[i])) {
                return getLabel();
            }
        }
        return Label.OK;
    }

    protected abstract String[] getKeywords();

    protected abstract Label getLabel();
}
