# Calculadora em Java – Documentação e Javadoc

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
