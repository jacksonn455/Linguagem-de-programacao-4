Programação concorrente
===============================================

  - Modifique a aplicação SharedBufferTestSync para que a thread Produtora: Execute 5 vezes. A cada execução, ela deve gerar um número aleatório de 1 a 10 que será armazenado no buffer.
    Se o valor do contador do laço de repetição for Par, o valor armazenado deve ser Negativo. Se o valor do contador do laço de repetição for Ímpar, o valor armazenado deve ser Positivo.
	Modifique a aplicação SharedBufferTestSync para que a thread Consumidora: Execute 5 vezes. A cada execução, ela deve retirar o valor do buffer (se ele não estiver vazio) e, logo após:
    Analisar se o valor for Positivo ou Negativo e Par ou Ímpar. Em todos os casos, devem ser feitos os somatórios da quantidade de valores e dos próprios valores gerados.


  - Modifique a aplicação SharedBufferTestSync para que a thread Produtora: Gere números aleatórios indefinidamente no intervalo de 0 – 100. Armazene apenas números primos no buffer.
    Quando 5 números primos forem gerados, a thread produtora deve encerrar sua tarefa. Modifique a aplicação SharedBufferTestSync para que a thread Consumidora: Recupere os números primos do buffer (a medida
    que eles forem gerados) Organize e mostre os 5 números primos em ordem crescente no final da execução da aplicação. Mostre também um somatório dos números primos encontrados.
	
  - Elabore um programa que crie n threads. A quantidade de threads criadas deve ser inserida pelo usuário no início do programa. Para cada thread criada, deve ser atribuída uma
    prioridade específica de execução. As prioridades vão de 1 a 10 e devem ser geradas aleatoriamente para cada thread no momento de sua criação. A única função da thread é imprimir o seu nome, a
    hora que executou e a sua prioridade.

	
  - Elabore um programa que crie 3 threads e atribua um nome a cada uma. Em seguida, sorteie uma sequência de números de 1 a 3 que equivale a ordem de execução de cada thread.
    Pesquise uma forma de fazer com que as threads executem na ordem sorteada. Ou seja, a segunda thread começará a executar apenas quando a primeira terminar sua execução.
	A Thread 1 deve imprimir os números de 1 a 5 a cada 1 segundo. A Thread 2 deve imprimir os números de 10 a 5 a cada 1 segundo. A Thread 3 deve imprimir os números de pares de 20 a 50 a cada 1 segundo.

  - Elabore um programa que crie 2 threads. O programa deve simular os procedimentos de crédito e débito em uma conta corrente. Utilize a sincronização pois as threads de crédito e débito não devem
    alterar o valor da conta corrente ao mesmo tempo para realizar suas operações. Os valores a serem creditados e debitados devem ser gerados aleatoriamente durante 5 tentativas de creditar e 5 para debitar a conta.
    A conta não pode ficar com saldo negativo. Se ficar, não poderá ser afetuado o débito. Exiba uma mensagem na tela indicando que a conta está negativa se houver uma tentativa de débito indevido.