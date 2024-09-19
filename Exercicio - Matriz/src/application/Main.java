package application;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira dois numeros para dar tamanho a matriz: ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int [][] mat = new int [n][m];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int number = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("");
			for(int j = 0; j < m; j++) {
				if(mat[i][j] == number) {
					System.out.println("Position: " + i + "," + j); // Imprimindo a posição do número
					if(j > 0)
					System.out.println("Left: " + mat[i][j - 1]); // Imprimindo o valor a esquerda
					if(j < mat[i].length-1)
					System.out.println("Right: " + mat[i][j + 1]); // Imprimindo o valor a direita
					if(i > 0)
					System.out.println("Up: " + mat[i - 1][j]); // Imprimindo o valor a cima
					if(i < mat.length-1)
					System.out.println("Down: " + mat[i + 1][j]); // Imprimindo o valor a baixo
				}
			}
		}
		
		   sc.close();
		}
}
