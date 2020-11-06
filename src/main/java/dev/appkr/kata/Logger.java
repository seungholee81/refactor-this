package dev.appkr.kata;

import java.util.ArrayList;
import java.util.List;

public class Logger {

  private List<LogEntry> logs = new ArrayList<>();

  public void log(String input, String transcoder, String output) {
    logs.add(new LogEntry(input, transcoder, output));
  }

  public List<LogEntry> getLogs() {
    return logs;
  }
}
