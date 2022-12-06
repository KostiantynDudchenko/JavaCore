package javaCore.t5t2t8;

/*
�������� ����� void print(InputStream inputStream, OutputStream outputStream)
        ������� ��������� InputStream � OutputStream, ��������� ��� ����� ��
        inputStream � ���������� � OutputStream ������ ������.
*/

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamOutputStream {

    public static void print(InputStream inputStream, OutputStream outputStream) throws IOException {
        int result = 0;
        while (inputStream.available() > 0) {
            if ((result = (byte)inputStream.read()) % 2 == 0) {
                outputStream.write(result);
            }
        }
        outputStream.flush();
    }
}
