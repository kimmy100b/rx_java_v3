package chap0;

import java.util.Arrays;
import java.util.stream.Stream;

public class Stream02 {
    public static void main(String[] args){
        String[] arr = new String[]{"넷", "둘", "셋", "하나"};

        // 배열에서 스트림 생성
        Stream<String> stream1 = Arrays.stream(arr);
        stream1.forEach(e -> System.out.print(e + " "));
        System.out.println();

        // 배열의 특정 부분만을 이용한 스트림 생성
        Stream<String> stream2 = Arrays.stream(arr, 1, 3); // 배열, 시작인덱스, 마지막인덱스
        stream2.forEach(e -> System.out.print(e + " "));
    }
}
