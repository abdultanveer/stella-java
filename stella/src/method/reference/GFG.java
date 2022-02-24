package method.reference;
import java.util.function.IntConsumer;
  
public class GFG {
    public static void main(String args[])
    {
  
        // Create a IntConsimer Instance
        IntConsumer display = a -> System.out.println(a * 10);
        IntConsumer mul = a -> a *= 10;
        // Using andThen() method
        IntConsumer composite = mul.andThen(display);
        composite.accept(3);
        throw new NullPointerException();

    }
}