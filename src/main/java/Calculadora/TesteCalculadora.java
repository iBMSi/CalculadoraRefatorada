
package Calculadora;
/**
 *<p><strong>Projeto Calculadora</strong></p>
 * 
 * <p>Esta classe fornece o teste das operações matemáticas básicas de soma, subtração
 * multiplicação e divisão, com o intuito principal de testar as os métodos e aplicações
 * da classe Calculadora também contida no pacote Calculadora.</p>
 * <p>Esse projeto é ultilizado para demonstar:</p>
 * <ul>
 *      <li>Técnicas de revisão estática (caixa branca)</li>
 *      <li>Técnicas de revisão (caixa branca)</li>
 *      <li>Aplicação de refatoração em código Java</li>
 *      <li>Documentação com Javadoc</li>
 * 
 * </ul>
 * <p>Após a reftatoração, as execuções desta classe são 
 * <strong>
 * Main: executando as operações de soma,subtração,multiplicação e divisão
 * </strong>.
 * Com os resultados esperados sendo de  soma = 5, Subtração = 6,
 * multiplicação = 15, divisão = 4 e uma excessão de erro jogada pelo 
 * throw new IllegalArgumentException criada na classe calculadora</p>
 * 
 *@author Caetano Bernardo
 *@version 1.0
 */
public class TesteCalculadora {
    
    public static void main(String[]args){
        Calculadora calc = new Calculadora();
        
        System.out.println(calc.calcular(2,3,"+"));
        System.out.println(calc.calcular(10,4,"-"));
        System.out.println(calc.calcular(3,5,"*"));
        System.out.println(calc.calcular(8,2,"/"));
        
        try{
            System.out.println(calc.calcular(8,0,"/"));
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }   
}
