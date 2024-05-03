import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author guiol
 */
public class ExemploFilter {
    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().populaPessoas();

        ArrayList<Pessoa> array = lista.stream()
                .filter(pessoa -> pessoa.getSexo().equals("Feminino"))
                .collect(Collectors.toCollection(ArrayList::new));
        array.forEach(System.out::println);
    }
}
