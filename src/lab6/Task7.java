package lab6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task7 {
    public static List<String> filterLongStrings(List<String> strings, int length) {
        return strings.stream().filter(s -> s.length() > length).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("cat", "work", "timus", "hockey");
        System.out.println("Изначальный список: " + strings);

        int myLength = 4;
        System.out.println("Минимальная длина: " + myLength);

        List<String> longStrings = filterLongStrings(strings, myLength);
        System.out.println("Отсортированный список: " + longStrings);

    }
}
