package dev.appkr.kata;

import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;

public class App {

  public static void main(String[] args) throws IOException {

    final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    while (true) {
      message(">>> 원본 문자열을 입력하세요 (종료하려면 exit 를 입력하고 Enter):");
      final String input = reader.readLine();

      if (input.length() < 1) {
        error("한 문자 이상을 입력해야 합니다");
        continue;
      }

      if (input.startsWith("exit")) {
        break;
      }

      message(">>> 주어진 문자열을 변경할 트랜스코더 선택하세요 [shuffle(s)|reverse(r)]: ");
      final String transcoder = reader.readLine();

      String output = null;
      switch (transcoder) {
        case "s":
        case "shuffle":
          output = shuffle(input);
          break;
        case "r":
        case "reverse":
          output = reverse(input);
          break;
        default:
          error("제출하신 트랜스코더를 지원하지 않습니다");
          continue;
      }

      message("=> " + output);
    }
  }

  static void message(String message) {
    System.out.println(message);
  }

  static void error(String message) {
    System.out.println("\u001B[31m" + message + "\u001B[0m");
  }

  static String shuffle(String input) {
    List<String> letters = asList(input.split(""));
    Collections.shuffle(letters);
    return StringUtils.join(letters, "");
  }

  static String reverse(String input) {
    return StringUtils.reverse(input);
  }
}
