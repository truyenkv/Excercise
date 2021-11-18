package Ex4;

import Ex3.ReadProperties;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.Provider;
import com.google.inject.name.Named;
import com.google.inject.name.Names;
import org.checkerframework.checker.units.qual.K;

public class LogProvider implements Provider<Log> {

    @Inject
    private Injector inject;
    @Override
    public Log get() {
        ReadProperties readProperties = ReadProperties.getInstance();
        String value = readProperties.readPro("log");
        Log log = inject.getInstance(Key.get(Log.class, Names.named(value)));
        return log;
    }
}
