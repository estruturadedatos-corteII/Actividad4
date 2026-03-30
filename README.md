# Actividad4
Simulación de Cajero: Cola FIFO vs. Priority Queue
Este proyecto es una simulación de un sistema de atención al cliente en un cajero. El objetivo fue comparar cómo se comporta una fila normal (FIFO) frente a una fila de prioridad (VIP) utilizando Java.

🧠 Explicación Teórica: FIFO vs. PriorityQueue
En este programa implementé dos estructuras distintas para manejar a los clientes:

Cola FIFO (colaManual):

Concepto: First In, First Out (Primero en entrar, primero en salir).

Lógica: Es una fila convencional. Los clientes se atienden estrictamente en el orden en que llegaron. Si llegaste primero, te atienden primero.

Uso en el código: La usamos para los clientes de tipo "normal".

Priority Queue (Cola de Prioridad):

Concepto: Los elementos tienen un valor de "importancia".

Lógica: No importa si llegaste tarde; si tu prioridad es más alta, saltas al principio de la fila.

Uso en el código: Usé la clase PriorityQueue de Java con un ComparadorPrioridad. Si un cliente es "urgente", pasa antes que cualquier cliente "normal". Si ambos son urgentes, se decide por quién llegó primero.

⚙️ Cómo funciona la simulación
El programa corre una simulación de 360 segundos (un turno de 6 minutos):

En cada segundo, hay una probabilidad del 5% de que llegue un nuevo cliente.

De esos clientes, el 20% son "urgentes" y el 80% son "normales".

El cajero siempre revisa primero la filaVip. Solo si la fila VIP está vacía, atiende a alguien de la filaNormal.

Al final, el programa calcula el tiempo promedio de espera de todos los clientes atendidos.
