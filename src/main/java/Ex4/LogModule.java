package Ex4;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class LogModule extends AbstractModule {

    @Override
    public void configure(){
        bind(Log.class).annotatedWith(Names.named("console")).to(ConsoleLog.class);
        bind(Log.class).annotatedWith(Names.named("file")).to(FileLog.class);
        bind(Log.class).toProvider(LogProvider.class);
    }
}
