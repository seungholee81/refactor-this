package dev.appkr.kata;

public class TranscodingService {

  private final Transcoder transcoder;

  public TranscodingService(Transcoder transcoder) {
    this.transcoder = transcoder;
  }

  public String transcode(String input) {
    return transcoder.transcode(input);
  }
}
