package Ex4;

public class ZaloPay implements PayMethod{
    @Override
    public void pay(int amount) {
        System.out.println("Zalopay payment success with "+amount);
    }
}
