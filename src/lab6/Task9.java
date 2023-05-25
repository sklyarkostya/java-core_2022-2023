package lab6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task9 {
    public static List<String> filterAlphabeticStrings(List<String> strings) {
        return strings.stream().filter(s -> s.matches("[a-zA-Z]+")).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("cat", "cat 1", "dog", "dog 1");
        System.out.println("Изначальный список строк: " + strings);

        List<String> alphabeticStrings = filterAlphabeticStrings(strings);
        System.out.println("Отсортированный список: " + alphabeticStrings);
    }
}
