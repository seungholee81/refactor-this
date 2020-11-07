package dev.appkr.kata.transcode;

import org.apache.commons.lang3.StringUtils;

import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;

public class ShuffleTranscoder implements Transcoder {
  
  @Override
  public String transcode(String input) {
    List<String> letters = asList(input.split(""));
    Collections.shuffle(letters);
    return StringUtils.join(letters, "");
  }

}
