package Ex2;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.name.Names;

public class Application {
    public static void main(String[] args) {
        LogModule logModule = new LogModule();
        Injector inject = Guice.createInjector(logModule);

        ILog console = inject.getInstance(Key.get(ILog.class, Names.named("console")));
        console.print();

        ILog file = inject.getInstance(Key.get(ILog.class, Names.named("file")));
        file.print();
    }

}
