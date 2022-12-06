package javaCore.t5t3t11;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Scanner;

/*
���������� �����, ������� �������� ������ �� InputStream � ����������� �� � ������,
        ��������� �������� ���������.

        ������:
        InputStream ��������������� ���������� ������ �����: 48 49 50 51.
        �����, ��������� ��� ������ InputStream � ��������� ASCII, ������ ������� ������: "0123".

        ����������:
        1. ����� ������ ���� ���������.
        2. ��������� ������ ������ ����: readAsString(InputStream inputStream, Charset charset)
*/

public class InputStreamDemo {

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        Reader reader = new InputStreamReader(inputStream, charset);
        StringBuilder stringBuilder = new StringBuilder();
        while (reader.ready()) {
            stringBuilder.append((char)reader.read());
        }
        return stringBuilder.toString();
    }

}
