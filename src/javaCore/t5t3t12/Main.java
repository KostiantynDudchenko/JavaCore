package javaCore.t5t3t12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.nio.*;
import java.util.*;

        /*�������� ���������, �������� ����� �� System.in � ��������� � System.out �����
        ���� ����������� � ������ ������������ ����� � ��������� �� �������
        ����� ����� �������. ������ ��������� ������������������ ��������,
        ���������� �� ����������� ������ ��������� ��� ���������� ����� � �������
        ����������� ������� Double.parseDouble.

        �� ���� ��� ��� ���� �������� ��������� ���������, �.�. ��������
        ��������� ����� � ������ Main  � ����� ����� � ��������� � �����  main.
        � �������� ��� ����������� �������

        ������ ����� 1: 1 2 3
        ������ ������ 1: 6.000000

        ������ ����� 2: a1 b2 c3
        ������ ������ 2: 0.000000

        ������ ����� 3:  -1e3 18 .111 11bbb
        ������ ������ 3: -981.889000

        ����������:
        1. ��������� ������ ������ ����� �� System.in
        2. ��������� ������ �������� ����� � ��������� �� 6 ����� ����� �������*/

public class Main {

     public static void readerFromSystemIn () throws IOException{
         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
         StringBuilder stringBuilder = new StringBuilder();
         while (bufferedReader.ready()) {
             stringBuilder.append((char) bufferedReader.read());
         }
         String[] strings = stringBuilder.toString().split("( |\n)");

         double d = 0;
         for (int i = 0; i < strings.length; i++) {
             try {
                 d += Double.parseDouble(strings[i]);
             } catch (NumberFormatException e) {
             }
         }
         System.out.printf(Locale.ENGLISH, "%.6f", d);
     }

    public static void main(String[] args) throws IOException {
         Main.readerFromSystemIn();

    }
}

