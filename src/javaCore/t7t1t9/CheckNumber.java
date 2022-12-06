package javaCore.t7t1t9;

public class CheckNumber {

    public static NumberGenerator<? super Number> getGenerator() {
        return arg -> arg.intValue() > 0;
    }
}
