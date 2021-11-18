package Ex4;

public class Moca implements PayMethod{
    @Override
    public void pay(int amount) {
        System.out.println("Moca payment successull" +amount);
    }
}
