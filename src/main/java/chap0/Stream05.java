package chap0;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream05 {
    public static void main(String[] args){
        // empty() : 빈 스트림 생성
        Stream<Object> stream1 = Stream.empty();
        // 트림의 요소의 총 개수를 출력함.
        System.out.println(stream1.count());

        IntStream stream2 = IntStream.rangeClosed(1, 5); // 1, 2, 3, 4, 5
        System.out.println(stream2.count());
    }
}