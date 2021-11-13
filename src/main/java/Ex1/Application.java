package Ex1;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Application {
    public static void main(String[] args) {
        LogModule logModule = new LogModule();
        Injector inject = Guice.createInjector(logModule);

        ILog iLog = inject.getInstance(ILog.class);
        iLog.print();
    }

}
