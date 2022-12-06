package javaCore.t5t2t7;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class SumOfStream {

    public static int sumOfStream(InputStream inputStream) throws IOException {
        int sum = 0;
        while (inputStream.available() > 0) {
            sum += (byte) inputStream.read();
        }
        return sum;
    }

    public static void main(String[] args) {
        byte[] bytes = {3,5,-1,10};
        InputStream inputStream = new ByteArrayInputStream(bytes);
        try {
            System.out.println(sumOfStream(inputStream));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
