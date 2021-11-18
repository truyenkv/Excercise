package Ex4;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.Provider;
import com.google.inject.name.Named;
import com.google.inject.name.Names;

public class TransactionProvider implements Provider<PayMethod> {

    @Inject
    private Injector injector;

    @Override
    public PayMethod get() {
        ReadProperties readProperties = ReadProperties.getInstance();
        String value = readProperties.readPro("wallet");
        PayMethod payMethod = injector.getInstance(Key.get(PayMethod.class, Names.named(value)));
        return payMethod;
    }
}
