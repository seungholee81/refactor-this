package dev.appkr.kata.transcode;

public class TranscodingService implements Transcoder {
  private Transcoder transcoder;

  public void setTranscoder(Transcoder transcoder) {
    this.transcoder = transcoder;
  }

  public String transcode(String input) {
    if (transcoder == null) {
      return input;
    }
    
    return transcoder.transcode(input);
  }
}
