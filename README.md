Programação concorrente
===============================================

  - Crie um programa que cria 100 threads e armazene-as em um array. Executar as threads que devem, cada uma, escrever uma mensagem na tela contendo seu número.

  - Crie duas threads onde: Uma thread fica enviando notícias aleatórias a cada 5 segundos (as notícias ficam em um array, no total de 5 notícias cadastradas). Enquanto a outra thread fica
    enviando a hora atual do sistema a cada 10 segundos. O programa deve terminar quando 10 notícias forem impressas. 
	
  - Escreva um programa que realize o cálculo das somas dos valores das linhas de uma matriz quadrada qualquer de números inteiros e imprima o resultado na tela.   Faça com que o cálculo do somatório de cada linha seja
    realizado em paralelo por uma thread. A matriz deve ser gerada no início do programa e seus elementos, bem como sua dimensão, devem ser criados aleatoriamente. No final, exiba a matriz e o valor da soma dos elementos
    de suas linhas logo após a impressão do último elemento da linha da matriz.
	
  - Crie uma classe T1 do tipo Thread com um método construtor que receba um número de identificação da Thread e um método run que fique em loop infinito imprimindo na tela a frase
    "Thread xx executando", onde ‘xx’ é o número de identificação da Thread. Faça um programa que crie uma matriz de 5 Threads T1 e, com um laço FOR, inicialize todas as Threads.

  - Crie uma classe ThreadImpar que implementa da interface Runnable. O trabalho a ser feito é gerar um número inteiro aleatório de 1 a 15 toda vez que executar. Quando um número ímpar for
	encontrado, a thread entra em espera sincronizada por 3 segundos. Crie uma classe ThreadPar que herda da classe Thread. O trabalho a ser feito é gerar um número
	inteiro aleatório de 1 a 15 toda vez que executar. Quando um número par for encontrado, a thread entra em espera sincronizada por 2 segundos.
	Crie uma classe ThreadDivFive que herda da classe Thread. O trabalho a ser feito é gerar um número inteiro aleatório de 0 a 50 toda vez que executar. Quando um número divisível por 5 for
	encontrado, a thread entra em espera sincronizada por 5 segundos. Ambas as threads devem ser executadas concorrentemente 5 vezes. No final, elas devem exibir quais os números ímpares e pares e divisíveis por 5 foram encontrados
	durante a sua execução, respectivamente, e quantas vezes as threads entraram no modo de espera sincronizada. Exiba também, no final da execução da thread, a hora da conclusão do seu trabalho no formato (hh:mm:ss)

  - Usando Threads, crie um programa que simule uma corrida de cavalos onde 3 cavalos se encontram na pista e correm de maneira independente e concorrentemente.
	A cada 3 segundos, um número de 0 – 10 é gerado aleatoriamente para cada cavalo. Esse número representa quantos metros o cavalo percorreu na pista.
	Vence o cavalo que completar o percurso de 1000 metros da pista. No final, imprima o número do cavalo que venceu a corrida, bem como o número do segundo e terceiro colocados, respectivamente.

