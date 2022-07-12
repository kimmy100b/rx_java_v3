package chap0;

/**
 * RxJava는 Stream으로 이루어져있기에 Stream에 대해 먼저 학습하고자 한다.
 */

import java.util.ArrayList;
import java.util.stream.Stream;

public class Stream01 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(2);
        list.add(3);
        list.add(1);

        // 컬렉션에서 스트림 생성
        Stream<Integer> stream1 = list.stream();
        // forEach() 메소드를 이용한 스트림 요소의 순차 접근
        System.out.println("Stream1");
        stream1.forEach(System.out::println);
        // stream1.forEach(System.out::println); // ERROR : stream has already been operated upon or closed

        Stream<Integer> stream2 = list.stream();
        // forEach() 메소드를 이용한 스트림 요소의 순차 접근
        System.out.println("Stream2");
        stream2.forEach(System.out::println);
        // stream2.forEach(System.out::println); // ERROR : stream has already been operated upon or closed
    }
}
