package dev.appkr.kata.transcode;

public class TranscoderFactory {

  public static Transcoder getInstance(String type) throws NotFoundTranscoderException {
    Transcoder transcoder = null;

    switch(type) {
      case "s":
      case "shuffle":
        transcoder = new ShuffleTranscoder();
        break;
      case "r":
      case "reverse":
        transcoder = new ReverseTranscoder();
        break;
      default:
        throw new NotFoundTranscoderException();
    }

    return transcoder;
  }

}
