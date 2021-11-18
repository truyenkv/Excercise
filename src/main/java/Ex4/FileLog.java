package Ex4;

public class FileLog implements Log{
    @Override
    public void print(String message) {
        System.out.println("File: "+message);
    }
}
