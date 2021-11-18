package Ex4;

import com.google.inject.Inject;

public class Order {

    @Inject
    private PayMethod payMethod;

    @Inject
    private Log log;

    private int value;

    public void makerOrder(String product, int value){
        this.value = value;
        log.print("Maker order with "+product+ "and pay "+value+ " success");
    }

    public void makePayment(){
        payMethod.pay(value);
    }
}
