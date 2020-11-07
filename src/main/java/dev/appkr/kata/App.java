package dev.appkr.kata;

import dev.appkr.kata.transcode.NotFoundTranscoderException;
import dev.appkr.kata.transcode.TranscoderFactory;
import dev.appkr.kata.transcode.TranscodingService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

  public static void main(String[] args) throws IOException {

    TranscodingService service = new TranscodingService();

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
      final String type = reader.readLine();

      try {
        service.setTranscoder(TranscoderFactory.getInstance(type));
        message("=> " + service.transcode(input));
      }
      catch (NotFoundTranscoderException e) {
        error("제출하신 트랜스코더를 지원하지 않습니다");
      }
    }
  }

  static void message(String message) {
    System.out.println(message);
  }

  static void error(String message) {
    System.out.println("\u001B[31m" + message + "\u001B[0m");
  }

}
