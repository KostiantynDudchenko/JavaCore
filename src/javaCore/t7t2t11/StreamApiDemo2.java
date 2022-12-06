package javaCore.t7t2t11;

/*�������� �����, ��������� � ������ ����������� � ������������ �������� � ������������ ��������,
�������� Comparator'��.

��������� ����������� � ������������ �������� ��������� � minMaxConsumer ��������� �������:

minMaxConsumer.accept(min, max);
���� ����� �� �������� ���������, �� ��������:

minMaxConsumer.accept(null, null);
����������:
1. ������ ���� ����� public <T> void
findMinMax(Stream<? extends T> stream,
           Comparator<? super T> order,
           BiConsumer<? super T, ? super T> minMaxConsumer)
2. ����� ������ �������� ������� � �������� � ������, � ������� order.
3. ���������� ������ ������ ���� �������� minMaxConsumer, �������� �������*/

import java.util.Comparator;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamApiDemo2 {

    public <T> void findMinMax(Stream<? extends T> stream, Comparator<? super T> order, BiConsumer<? super T, ? super T> minMaxConsumer) {
        stream.collect(Collectors.teeing(Collectors.minBy(order), Collectors.maxBy(order), (min, max) -> {
            minMaxConsumer.accept(min.orElse(null), max.orElse(null));
            return minMaxConsumer;
        }));
    }

        /*Optional<? extends T> min = stream
                .min(order);
        Optional<? extends T> max = stream
                .max(order);
        minMaxConsumer.accept(min.orElse(null), max.orElse(null));*/
}

