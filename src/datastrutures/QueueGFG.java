package datastrutures;

/*
Abordagem: O problema dado pode ser resolvido usando uma fila simples . A ideia é inserir N inteiros um a um na fila e depois verificar a frequência de M inteiros. Funções separadas serão criadas para executar ambas as operações. Siga os passos abaixo para resolver o problema.

Crie uma fila e coloque todos os números inteiros fornecidos na fila .
Depois de colocar todos os elementos na fila , crie outra função para contar a frequência de M elementos fornecidos, um por um.
Pegue uma variável cntFrequency para acompanhar a frequência do elemento atual.
Retire todos os elementos da fila até seu tamanho e verifique sempre se o elemento atual na fila é igual ao elemento para o qual estamos verificando a frequência.
– se ambos forem iguais, incremente cntFrequency em 1
– caso contrário, não faça nada.
Empurre o elemento atual de volta para a fila para que, no próximo caso, a fila não seja perturbada.
Imprima a frequência de cada elemento encontrado.
Abaixo está a implementação da abordagem acima
*/
//Java Program to implement above approach
import java.io.*;
import java.util.*;

class QueueGFG {

	// Driver code
	public static void main(String[] args)
	{
		// Declaring Queue
		Queue<Integer> q = new LinkedList<>();
		int N = 8;
		int[] a = new int[] { 1, 2, 3, 4, 5, 2, 3, 1 };
		int M = 5;
		int[] b = new int[] { 1, 3, 2, 9, 10 };

		// Invoking object of Geeks class
		Geeks obj = new Geeks();

		for (int i = 0; i < N; i++) {
			// calling insert()
			// to add elements in queue
			obj.insert(q, a[i]);
		}

		for (int i = 0; i < M; i++) {
			// calling findFrequency()
			int f = obj.findFrequency(q, b[i]);
			if (f != 0) {
				// variable f
				// will have final frequency
				System.out.print(f + " ");
			}
			else {
				System.out.print("-1"
								+ " ");
			}
		}
	}
}

//Helper class Geeks to implement
//insert() and findFrequency()
class Geeks {

	// Function to insert
	// element into the queue
	static void insert(Queue<Integer> q, int k)
	{
		// adding N integers into the Queue
		q.add(k);
	}

	// Function to find frequency of an element
	// return the frequency of k
	static int findFrequency(Queue<Integer> q, int k)
	{
		// to count frequency of elements
		int cntFrequency = 0;

		// storing size of queue in a variable
		int size = q.size();

		// running loop until size becomes zero
		while (size-- != 0) {

			// storing and deleting
			// first element from queue
			int x = q.poll();

			// comparing if it's equal to integer K
			// that belongs to M
			if (x == k) {
				// increment count
				cntFrequency++;
			}
			// add element back to queue because
			// we also want N integers
			q.add(x);
		}
		// return the count
		return cntFrequency;
	}
}

