
package Calculadora;
/**
 *<p><strong>Projeto Calculadora</strong></p>
 * 
 * <p>Esta classe fornece operações matemáticas básicas como soma, subtração
 * multiplicação e divisão, além de um método principal que seleciona a operação
 * desejada com base em um operador informado pelo usuario.</p>
 * <p>Esse projeto é ultilizado para demonstar:</p>
 * <ul>
 *      <li>Técnicas de revisão estática (caixa branca)</li>
 *      <li>Técnicas de revisão (caixa branca)</li>
 *      <li>Aplicação de refatoração em código Java</li>
 *      <li>Documentação com Javadoc</li>
 * 
 * </ul>
 * <p>Após a reftatoração, os métodos desta classe são <strong>métodos puros</strong>.
 * sem efeitos colaterais, permitindo maior legibilidade e facilitando testes unitários.</p>
 * 
 *@author Caetano Bernardo
 *@version 1.0
 */
public class Calculadora {
    
    /**
     * Soma dois numeros inteiros operando com as váriaveis int a, e int b
     * 
     * @param a primeiro operando
     * @param b segundo operando
     * @return o resultado (renorto) da soma de {@code a} e {@code b}
    */
    public int somar(int a, int b){
        return a+b;// retorna os dois numeros recebidos somados
    }
    
    /**
     * Subtrái dois numeros inteiros, operando com as váriaveis int a, e int b
     * 
     * @param a primeiro operando
     * @param b segundo operando
     * @return o resultado (renorto) da subtração de {@code a} e {@code b}
    */
    public int subtrair(int a, int b){
        return a-b;// retorna os dois numeros recebidos subtraidos
    }
    
    /**
     * Multiplica dois numeros inteiros, operando com as váriaveis int a, e int b
     * 
     * @param a primeiro operando
     * @param b segundo operando
     * @return o resultado (retorno) da multiplicação de {@code a} e {@code b}
     * @throws IllegalArgumentException caso o divisor {@code b} seja zero pois
     * a divisão por zero não é permitida
    */
    public int multiplicar(int a, int b){
        return a*b;// retorna os dois numeros recebidos multiplicados
    }
    
    /**
     * Dividi dois numeros inteiros, operando com as váriaveis int a, e int b
     * com um
     * 
     * @param a primeiro operando
     * @param b segundo operando
     * @return o resultado (renorto) da divisão de {@code a} e {@code b}
    */
    public int dividir(int a, int b){
        if(b == 0){
            throw new IllegalArgumentException("divisão por zero não permitida");
        }
        return a/b;// retorna os dois numeros recebidos divididos
    }
    
    /**
     * <p>Execuita a operação matemática solicitada com base no oeprador informado.</p>
     * 
     * <p>Operadores aceitos:</p>
     * <ul>
     *      <li>"+":Soma</li>
     *      <li>"-":Subtração</li>
     *      <li>"*":Multiplicação</li>
     *      <li>"/":Divisão</li>
     * </ul>
     * 
     * <p>Qualquer operador inválido resulta em uma exceção.</p>
     * 
     * @param a primeiro operando
     * @param b segundo operando
     * @param operador símbolo da operação desejada
     * @return o resultado da operação correspondente ao operador informado
     * 
     * @throws IllegalArgumentException o resultado da operação correspondente ao operador informado
     */
    public int calcular(int a, int b, String operador){
        return switch(operador){ //"verificação" do operador a ser utilizado na operação matematica
            case "+" -> somar(a,b);
            case "-" -> subtrair(a,b);
            case "*" -> multiplicar(a,b);
            case "/" -> dividir(a,b);
            default -> throw new IllegalArgumentException("Operador invalido: "+operador);
        };
    }
}
