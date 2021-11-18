package Ex4;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

public class Application {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new TransactionModule(), new LogModule());
        Order order = injector.getInstance(Order.class);
        order.makerOrder("truyen", 100);
        order.makePayment();
    }
}
