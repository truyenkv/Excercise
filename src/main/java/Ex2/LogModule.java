package Ex2;

import com.google.inject.AbstractModule;
import com.google.inject.name.Named;
import com.google.inject.name.Names;

public class LogModule extends AbstractModule {

    @Override
    public void configure(){
        bind(ILog.class).annotatedWith(Names.named("console")).to(ConsoleLog.class);
        bind(ILog.class).annotatedWith(Names.named("file")).to(FileLog.class);
    }
}
