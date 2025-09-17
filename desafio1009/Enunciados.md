Desenvolva um programa que dado, um intervalo número, imprime os números primos existentes. Exemplo:
Intervalo:5 a 25
Primos existentes: 5, 7, 11, 13, 17, 19, 23
A ordem de impressão na tela é irrelevante

Versão 1: Apenas o processo (sem Threads) .
Versão 2: Criar uma Thread que imprime os primos no intervalo
Versão 3: Criar 2 Threads: [inicio ... metade][metade+1 ... fim]
Versão 4: Criar várias Threads, uma para cada sub-intervalo. Exemplo:
Thread1 -> sub-intervalo 5 a 50
Thread2 -> sub-intervalo 51 a 100
Thread3 -> sub-intervalo 101 a 150
Versão 5: Altere a versão anterior para guardar os números primos encontrado em uma lista. Depois de encontrar todos os números primos do intervalo, liste os números ordenados e indexados.

Ao executar estas versões, qual é a mais rápida? a amis 
Testar com intervalos grandes. Exemplo> 1 a 1 milhão
Usar Windows PowerShell para medir o tempo de execução.

javac desafio1009\PrimosVersao01.java
javac desafio1009\PrimosVersao02.java
javac desafio1009\PrimosVersao03.java
javac desafio1009\PrimosVersao04.java
javac desafio1009\PrimosVersao05.java

 Measure-Command { java desafio1009\PrimosVersao01 }
Days              : 0
Hours             : 0
Minutes           : 0
Seconds           : 0
Milliseconds      : 190
Ticks             : 1903901
TotalDays         : 2,20358912037037E-06
TotalHours        : 5,28861388888889E-05
TotalMinutes      : 0,00317316833333333
TotalSeconds      : 0,1903901
TotalMilliseconds : 190,3901

Measure-Command { java desafio1009\PrimosVersao02 }
Days              : 0
Hours             : 0
Minutes           : 0
Seconds           : 0
Milliseconds      : 181
Ticks             : 1818037
TotalDays         : 2,10420949074074E-06
TotalHours        : 5,05010277777778E-05
TotalMinutes      : 0,00303006166666667
TotalSeconds      : 0,1818037
TotalMilliseconds : 181,8037

Measure-Command { java desafio1009\PrimosVersao03 }
Days              : 0
Hours             : 0
Minutes           : 0
Seconds           : 0
Milliseconds      : 167
Ticks             : 1672917
TotalDays         : 1,93624652777778E-06
TotalHours        : 4,64699166666667E-05
TotalMinutes      : 0,002788195
TotalSeconds      : 0,1672917
TotalMilliseconds : 167,2917

 Measure-Command { java desafio1009\PrimosVersao04 }
Days              : 0
Hours             : 0
Minutes           : 0
Seconds           : 0
Milliseconds      : 177
Ticks             : 1773936
TotalDays         : 2,05316666666667E-06
TotalHours        : 4,9276E-05
TotalMinutes      : 0,00295656
TotalSeconds      : 0,1773936
TotalMilliseconds : 177,3936

 Measure-Command { java desafio1009\PrimosVersao05 }
Days              : 0
Hours             : 0
Minutes           : 0
Seconds           : 0
Milliseconds      : 179
Ticks             : 1796248
TotalDays         : 2,07899074074074E-06
TotalHours        : 4,98957777777778E-05
TotalMinutes      : 0,00299374666666667
TotalSeconds      : 0,1796248
TotalMilliseconds : 179,6248
