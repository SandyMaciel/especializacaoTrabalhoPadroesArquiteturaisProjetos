package qt02_strategy;;

public class LoggerFile implements ILoggerStrategy {
    @Override
    public void Log(String s) {
        System.out.println("log to File: " + s);
    }
}
