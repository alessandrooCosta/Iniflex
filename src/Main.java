import java.math.BigDecimal;
import java.sql.SQLSyntaxErrorException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> lista = new ArrayList<>();
        lista.add(new Funcionario("Maria", LocalDate.of(2000, 10, 18), new BigDecimal("2009.44"), "Operador"));
        lista.add(new Funcionario("João", LocalDate.of(1990, 05, 12), new BigDecimal("2284.38"), "Operador"));
        lista.add(new Funcionario("Caio", LocalDate.of(1961, 05, 02), new BigDecimal("9836.14"), "Coordenador"));
        lista.add(new Funcionario("Miguel", LocalDate.of(1988, 10, 14), new BigDecimal("19119.88"), "Diretor"));
        lista.add(new Funcionario("Alice", LocalDate.of(1995, 01, 05), new BigDecimal("2234.68"), "Recepcionista"));
        lista.add(new Funcionario("Heitor", LocalDate.of(1999, 11, 19), new BigDecimal("1582.72"), "Operador"));
        lista.add(new Funcionario("Arthur", LocalDate.of(1993, 03, 31), new BigDecimal("4071.84"), "Contador"));
        lista.add(new Funcionario("Laura", LocalDate.of(1994, 07, 8), new BigDecimal("3017.45"), "Gerente"));
        lista.add(new Funcionario("Heloisa", LocalDate.of(2003, 5, 24), new BigDecimal("1606.85"), "Eletricista"));
        lista.add(new Funcionario("Helena", LocalDate.of(1996, 9, 02), new BigDecimal("2799.93"), "Gerente"));
        lista.remove(1);
        System.out.println("");
        for(Funcionario funcionario : lista){
            System.out.println(funcionario);
        }
        System.out.println("");
        System.out.println("Lista a após atualização de 10% do salario: ");
        for(Funcionario funcionario : lista){
            System.out.println(funcionario);
        }
        //3.5 - 3.6
        System.out.println("teste:");
        Map<String, List<Funcionario>> map = new HashMap<>();
        for(Funcionario funcionario : lista) {
            String funcao = funcionario.getFuncao();
            // abaixo foi utilizado containsKey
            if (!map.containsKey(funcao)) {
                map.put(funcao, new ArrayList<>() /*lista vazia*/);
            }
            map.get(funcao).add(funcionario);
            //System.out.println(map);
        }
        System.out.println(map);
        /*
        O método containsKey em Java é utilizado para verificar se um Map contém uma determinada chave.
        Ele é muito útil quando você precisa saber se uma chave específica já está presente no Map antes de realizar alguma operação, como adicionar ou atualizar um valor.
        */


        //3.8




                }
            }

