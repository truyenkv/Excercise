package Ex1;

import com.google.inject.AbstractModule;

public class LogModule extends AbstractModule {

    @Override
    public void configure(){
        bind(ILog.class).to(ConsoleLog.class);
    }
}
