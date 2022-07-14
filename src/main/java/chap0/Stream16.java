package chap0;

/**
 * 스트림의 최종 연산(terminal operation)
 *
 * 7. 요소의 수집 : collect()
 *
 * Collects 메소드 :
 ** 1. 스트림을 배열이나 컬렉션으로 변환 : toArray(), toCollection(), toList(), toSet(), toMap()
 ** 2. 요소의 통계와 연산 메소드와 같은 동작을 수행 : counting(), maxBy(), minBy(), summingInt(), averagingInt() 등
 ** 3. 요소의 소모와 같은 동작을 수행 : reducing(), joining()
 ** 4. 요소의 그룹화와 분할 : groupingBy(), partitioningBy()
 *
 */

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream16 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("넷", "둘", "하나", "셋");
        // collect() : 인수로 전달되는 Collectors 객체에 구현된 방법대로 스트림의 요소를 수집
        // 해당 스트림을 리스트로 변환하는 예제
        List<String> list = stream.collect(Collectors.toList());
        Iterator<String> iter = list.iterator();
        while(iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }

        System.out.println();

        // 해당 스트림을 맵으로 변환하는 예제
        Stream<String[]> streamMap = Stream.of(new String[][]{{"apple", "fruit"}, {"kimbab", "food"}});
        Map<String, String> map = streamMap.collect(Collectors.toMap(p -> p[0], p -> p[1]));
        System.out.println("Map:" + map);
    }
}
