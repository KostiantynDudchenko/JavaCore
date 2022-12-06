package javaCore.t3t5t7;

public class CheckLabels {

    public static Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (int i = 0; i < analyzers.length; i++) {
            if (analyzers[i].processText(text) != Label.OK) {
                return analyzers[i].processText(text);
            }
        }//“вой код здесь
        return Label.OK;
    }

    public static void main(String[] args) {
        String s1 = "KJHBlhblhbljhbjbJHblh*(*&^?><MMN:(";
        String s2 = "KJHBlhblhbljhbjbJHblh*(*&^?><MMN=(";
        String s3 = "KJHBlhblhbljhbjbJHblh*(*&^?><MMN:|";
        String maxLength = "KJHBl";
        String badWords1 = "___idiot_";
        String badWords2 = "slndsk____stupid____dl,we;kvmms";
        String badWords3 = "alxkmsdk___crazy_____,we;kvmms";

        SpamAnalyzer spamAnalyzer = new SpamAnalyzer(new String[]{"idiot", "stupid", "crazy"});
        NegativeTextAnalyzer negativeTextAnalyzer = new NegativeTextAnalyzer();
        TooLongTextAnalyzer tooLongTextAnalyzer = new TooLongTextAnalyzer(10);

        System.out.println(CheckLabels.checkLabels(new TextAnalyzer[]{spamAnalyzer, negativeTextAnalyzer, tooLongTextAnalyzer}, badWords1));


    }

}
