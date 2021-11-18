package Ex4;

public class ConsoleLog implements Log{
    @Override
    public void print(String message) {
        System.out.println("Console: "+message);
    }
}
