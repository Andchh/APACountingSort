import java.util.Scanner;

public class CountingSort {

	public static void main(String[] args) {
		
		final int MIN_VAL = -100;
		final int MAX_VAL = +100;
		
		//recebe os numeros para entrada
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o numero de elementos no array entre -100 e +100:\n");
		int n = s.nextInt();
		int[] entry = new int[n];
		System.out.print("Digite os numeros que serao organizados com enter apos cada:\n");
		
		for(int i = 0; i < n; i++){  //vai lendo e salvando no array os valores
			entry[i] = s.nextInt();
		}
		
		//MergeSort.split(entry, entry.length);
		countingSort(entry, MIN_VAL, MAX_VAL);
		System.out.println(java.util.Arrays.toString(entry));
		s.close();
	}
	
	//ordena os valores no espaço de minval e maxval
	
	public static void countingSort(int[] array, int minVal, int maxVal){
		//cria array do tamanho do espaço dos valores
		int size = maxVal - minVal + 1;
		int[] B = new int[size];
		
		for(int i = 0; i < array.length; i++){
			B[array[i] - minVal]++;
		}
		for(int i = 0, k = 0; i < size; i++){
			while(B[i]-- > 0) array[k++] = i + minVal;
		}
	}

}
