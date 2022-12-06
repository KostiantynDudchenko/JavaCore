package javaCore.t7t2t12;

/*�������� ���������, �������� �� System.in ����� � ��������� UTF-8, �������������� � ��� ������� ��������� ����,
� � ����� ��������� 10 �������� ����� ������������� ����.

������ ����� ������� ����� ����������� ������������������ ��������, ��������� ������ �� ���� � ����.
��������, � ������ "���� ���� ���� 33 ����!" ����� ���� ����: "����", "����", "����", "33" � "����".

������� ���� ������ ����������� ��� ����� ��������, �.�. "����", "����" � "����" � ��� ���� � �� �� �����.
�������� ����� � ������ ��������.

���� � ������ ������ 10 ���������� ����, �� �������� ������� ����.

���� � ������ ��������� ����� ����� ���������� �������, �.�. �� ������ ���������� ����������� ������ �� �������,
�� ������������� ����������� ����� � ���������� �������� � ������������������ �������.

������ ����� �������� ������� ����� ������ ��� ������ � �������� ����������. ���������� ��������� ���.

������ �����  1:

���� ����-����-���� ����!
������ ������  1:

����
����
����
������ ����� 2:

Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sodales consectetur purus at faucibus.
Donec mi quam, tempor vel ipsum non, faucibus suscipit massa. Morbi lacinia velit blandit tincidunt efficitur.
Vestibulum eget metus imperdiet sapien laoreet faucibus. Nunc eget vehicula mauris, ac auctor lorem.
Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer vel odio nec mi tempor dignissim.
������ ������ 2:


consectetur
faucibus
ipsum
lorem
adipiscing
amet
dolor
eget
elit
mi
����������:
1. ������ ���� ����� public static void main(String[] args)
2. ��������� ������ ������ ������ � �������
2. ��������� ������ ������ ������ � �������*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("(?U)[^\\p{L}\\p{Digit}]+")
                .tokens()
                .map(x -> x.toLowerCase())
                .collect(Collectors.toMap(w -> w.toLowerCase(), word -> 1, Integer::sum))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.naturalOrder()))
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(10)
                .forEach(x -> System.out.println(x.getKey()));
    }
}
