package javaCore.t7t2t11;

/*Напишите метод, находящий в стриме минимальный и максимальный элементы в соответствии порядком,
заданным Comparator'ом.

Найденные минимальный и максимальный элементы передайте в minMaxConsumer следующим образом:

minMaxConsumer.accept(min, max);
Если стрим не содержит элементов, то вызовите:

minMaxConsumer.accept(null, null);
Требования:
1. Должен быть метод public <T> void
findMinMax(Stream<? extends T> stream,
           Comparator<? super T> order,
           BiConsumer<? super T, ? super T> minMaxConsumer)
2. Метод должен находить минимум и максимум в потоке, с помощью order.
3. Полученные данные должны быть записаны minMaxConsumer, согласно условию*/

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

