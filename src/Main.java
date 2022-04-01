import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<String> instruccion = new ArrayList<>();
        instruccion.add("ULURUDU");
        instruccion.add("UUUUUU");
        instruccion.add("UUUUUU");
        instruccion.add("UUUUUU");
        instruccion.add("UUUUUU");

        List<Integer> re= Result.calcularMaximoRetorno(instruccion);
        System.out.println(re);





    }
}
