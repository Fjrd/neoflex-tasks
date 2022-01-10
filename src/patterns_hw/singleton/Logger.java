package patterns_hw.singleton;

public class Logger {
    private static Logger INSTANCE;
    private static String log = "Logging: \n\n";

    private Logger() {}

    public static Logger getLogger() {
        if (INSTANCE == null) {
            INSTANCE = new Logger();
        }
        return INSTANCE;
    }

    public void addClassAndShowInfo(Class clazz) {
        log += clazz.getName() + "\n";
        System.out.println(log);
    }
}
