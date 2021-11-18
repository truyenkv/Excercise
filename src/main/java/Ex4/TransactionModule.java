package Ex4;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class TransactionModule extends AbstractModule {
    @Override
    public void configure(){
        bind(PayMethod.class).annotatedWith(Names.named("zalo")).to(ZaloPay.class);
        bind(PayMethod.class).annotatedWith(Names.named("moca")).to(Moca.class);
        bind(PayMethod.class).toProvider(TransactionProvider.class);
    }
}
