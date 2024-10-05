// logger class using the singleton pattern to make sure there's only one instance
// useful when we need a single logging instance through entire app
class Logger {
    private static Logger instance;  // single instance of logger

    // private constructor prevents instantiation from outside the class
    private Logger() {}

    // method to get the single instance of the logger
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();  // creates the logger if it doesn't exist yet
        }
        return instance;  // return the singleton instance
    }

    // log method that prints messages to the console
    public void log(String message) {
        System.out.println("log message: " + message);
    }
}

// test code that demonstrates singleton pattern
public class SingletonPatternExample {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("first log message");  // logs first message

        Logger logger2 = Logger.getInstance();
        logger2.log("second log message");  // logs second message

        // logger1 and logger2 are the same instance
        System.out.println("same instance? " + (logger1 == logger2));  // should be true
    }
}
