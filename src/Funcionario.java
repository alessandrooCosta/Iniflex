import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Funcionario extends Pessoa {

    private BigDecimal salario;
    private String funcao;

    public Funcionario(String nome, LocalDate dataNascimento, BigDecimal salario, String funcao) {
        super(nome, dataNascimento);
        this.salario = salario;
        this.funcao = funcao;
    }

    public BigDecimal getSalario(){
        return salario;
    }

    public String getFuncao(){
        return funcao;
    }

    public String getSalarioFormatado(){
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        String numeroFormatado = decimalFormat.format(salario);
        return numeroFormatado;
    }

    @Override
    public String toString() {

        return  " Nome: '" + getNome()+
                " Data Nascimento: " + getDataFormatada()+
                " Salario: " + getSalarioFormatado() +
                " Funcao: " + funcao;
    }
}
