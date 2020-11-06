package dev.appkr.kata;

public class TranscoderFactory {

  public static Transcoder getInstance(String transcoder) {
    switch (transcoder) {
      case "s":
      case "shuffle":
        return new ShuffleTranscoder();
      case "r":
      case "reverse":
        return new ReverseTranscoder();
      default:
        throw new IllegalArgumentException("제출하신 트랜스코더를 지원하지 않습니다");
    }
  }
}
