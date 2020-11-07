package dev.appkr.kata.transcode;

import org.apache.commons.lang3.StringUtils;

public class ReverseTranscoder implements Transcoder {

  @Override
  public String transcode(String input) {
    return StringUtils.reverse(input);
  }

}
