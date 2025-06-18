package comparadorNumeros;
import java.util.*;
public class UI {
    public static void main(String[]args){
        List<Integer> numeros = new ArrayList<>();

        numeros.add(3);
        numeros.add(2);
        numeros.add(289);

        numeros.sort((a,b) -> b-a);
        numeros.sort(Comparator.naturalOrder());
    }
}
