[TesteCalculadora.java](https://github.com/user-attachments/files/23734552/TesteCalculadora.java)Calculadora em Java – Documentação e Javadoc
Arquivos Javadoc:
-----------------------------------------------------------------------
[Calculadora.java](https://github.com/user-attachments/files/23734549/Calculadora.java)
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


-----------------------------------------------------------------------
[Uploadi
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
ng TesteCalculadora.java…]()

-----------------------------------------------------------------------

Este projeto implementa uma calculadora simples em Java, contendo operações básicas: soma, subtração, multiplicação e divisão.
O código foi documentado utilizando Javadoc, permitindo a geração automática da documentação pelo NetBeans.

Funcionalidades Implementadas
Soma

Recebe dois números inteiros e retorna o resultado da adição.

Subtração

Recebe dois inteiros e retorna a diferença entre eles.

Multiplicação

Documentada com Javadoc, informando claramente os parâmetros e o valor retornado.
Exemplo utilizado:
/**
 * Multiplica dois números inteiros.
 *
 * @param a primeiro operando
 * @param b segundo operando
 * @return o resultado da multiplicação de {@code a} e {@code b}
 */

Divisão com Tratamento de Exceção

A divisão foi implementada com try/catch para evitar erros de divisão por zero, e o Javadoc foi adaptado para refletir isso.
/**
 * Divide dois números inteiros.
 * Caso ocorra divisão por zero, o método trata a exceção e retorna 0.
 *
 * @param a dividendo
 * @param b divisor
 * @return o resultado da divisão ou 0 caso ocorra divisão por zero
 */


Execução dos Testes

A classe TesteCalculadora contém o método main, responsável por:

Instanciar a classe Calculadora

Executar todas as operações

Exibir os resultados no console

Testar comportamentos como divisão por zero

Geração do Javadoc

A documentação Javadoc pode ser gerada no NetBeans através de:
Run > Generate Javadoc
O NetBeans irá criar a pasta dist/javadoc com todos os arquivos HTML gerados.

----------------------------------------------------
Imagem de saída do NetBeans

Abaixo é possível ver a imagem de saída gerada no console do NetBeans:
<img width="1025" height="816" alt="image" src="https://github.com/user-attachments/assets/f0343cab-0bc8-4ba7-a740-88913e6297e2" />

------------------------------------
Estrutura do Projeto
/
├── Calculadora.java
├── TesteCalculadora.java
└── README.md
------------------------------------
Tecnologias Utilizadas

Java

NetBeans

Javadoc
