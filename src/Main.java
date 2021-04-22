import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Map map = new HashMap(18);
        System.out.println(map.entrySet().size());


        Stream.of(1).parallel().forEach(t-> System.out.println(t));
    }
}
