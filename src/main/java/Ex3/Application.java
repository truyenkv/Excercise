package Ex3;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.name.Names;

public class Application {
    public static void main(String[] args) {
        ReadProperties properties = ReadProperties.getInstance();
        String value = properties.readPro("log");

        LogModule logModule = new LogModule();
        Injector inject = Guice.createInjector(logModule);

        ILog console = inject.getInstance(Key.get(ILog.class, Names.named(value)));
        console.print();

//        ILog file = inject.getInstance(Key.get(ILog.class, Names.named("file")));
//        file.print();
    }

}
