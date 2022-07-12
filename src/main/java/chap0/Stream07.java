package chap0;

/**
 * 스트림의 중개 연산(intermediate operation)
 */

import java.util.Arrays;
import java.util.stream.Stream;

public class Stream07 {
    public static void main(String[] args){
        // map() 메소드 : 해당 스트림의 요소들을 주어진 함수에 인수로 전달하여, 그 반환값들로 이루어진 새로운 스트림을 반환
        Stream<String> stream = Stream.of("HTML", "CSS", "JAVA", "JAVASCRIPT");
        stream.map(s -> s.length()).forEach(System.out::println);
        System.out.println();

        // 스트림의 요소가 배열이라면, flatMap() 메소드를 사용하여 각 배열의 각 요소의 반환값을 하나로 합친 새로운 스트림을 얻을 수 있다.
        String[] arr = {"I study hard", "You study JAVA", "We love JAVA"};
        Stream<String> stream1 = Arrays.stream(arr);
        stream1.flatMap(s -> Stream.of(s.split(" "))).forEach(System.out::println);
    }
}
