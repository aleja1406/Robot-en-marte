import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;

class Result {
    /*
     * Complete the 'calcularMaximoRetorno' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts STRING_ARRAY instruccion as parameter.
     */


    public static List<Integer> calcularMaximoRetorno(List<String> instruccion) {
// Write your code here
        int tamlist = instruccion.size();
        System.out.println(tamlist);
        List<Integer> totalinstrucciones = new ArrayList<>();
        for (int i = 0; i < tamlist; i++) {
            int posx = 0;
            int posy = 0;
            int total = 0;
            int numeromayor = 0;
            char[] comandos = instruccion.get(i).toCharArray();
            for (int j = 0; j < comandos.length; j++) {
                if (comandos[j] == 'U') {
                    posy++;
                }
                if (comandos[j] == 'D') {
                    posy--;
                }
                if (comandos[j] == 'R') {
                    posx++;
                }
                if (comandos[j] == 'L') {
                    posx--;
                }
                total = Math.abs(posx) + Math.abs(posy);
                if (total >= numeromayor) {
                    numeromayor = total;
                }
            }
            totalinstrucciones.add(numeromayor);

        }

        return totalinstrucciones;
    }


}