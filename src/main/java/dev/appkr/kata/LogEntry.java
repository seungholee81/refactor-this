package dev.appkr.kata;

import java.time.LocalDateTime;

public class LogEntry {

  private LocalDateTime dateTime;
  private String input;
  private String transcoder;
  private String output;

  public LogEntry(String input, String transcoder, String output) {
    this.dateTime = LocalDateTime.now();
    this.input = input;
    this.transcoder = transcoder;
    this.output = output;
  }

  @Override
  public String toString() {
    return "LogEntry{" +
        "dateTime=" + dateTime +
        ", input='" + input + '\'' +
        ", transcoder='" + transcoder + '\'' +
        ", output='" + output + '\'' +
        '}';
  }
}
