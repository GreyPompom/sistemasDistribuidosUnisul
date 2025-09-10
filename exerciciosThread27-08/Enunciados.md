[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/ZF37v-3y)
[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-2e0aaae1b6195c2367325f4f02e2d04e9abb55f0b24a779b69b11b9e10269abc.svg)](https://classroom.github.com/online_ide?assignment_repo_id=20290673&assignment_repo_type=AssignmentRepo)
# EstruturaBasicaThread

Olá estudantes, 

Exercício 1 - Thread de contagem
Crie uma thread que imprime números de 1 a 10.
Cada número deve ser impresso com intervalo de 500 ms (Thread.sleep(500)).
Crie duas threads desse tipo e execute-as ao mesmo tempo.
Observação: perceba como a saída no console se intercala entre as duas threads.

Exemplo de saída esperada (aproximada):
Thread 1: 1
Thread 2: 1
Thread 1: 2
Thread 2: 2
...

Exercício 2 - Thread Runnable com mensagem personalizada
Crie uma classe que implementa Runnable.
No run(), a thread deve imprimir uma mensagem personalizada 5 vezes, com intervalos de 700 ms.
No main, crie duas threads com mensagens diferentes (ex.: "Olá do Runnable 1", "Olá do Runnable 2") e execute-as em paralelo.

Exercício 3 - Corrida de Threads
Crie três threads, cada uma representando um corredor.
Cada thread deve imprimir seu progresso de 10 em 10 até 100 metros.
Use Thread.sleep(400) para simular o tempo entre os passos.
Utilize join() para que a thread principal aguarde todas terminarem.
No final, imprimir "Corrida finalizada!".

Exercício 4 - Mistura de números e letras
Crie duas threads:
Imprime números de 1 a 5.
Imprime letras de A a E.
Use join() para que o programa só finalize depois que ambas as threads terminarem.
