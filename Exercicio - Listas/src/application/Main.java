package application;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Emplyoee;


public class Main {
	private static final boolean False = false;
	private static final boolean True = false;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Emplyoee func;
		List<Emplyoee> funcionarios = new ArrayList<>(); // Criando uma lista do tipo classe Emplyoee
		
		
		System.out.println("Quantos funcionarios serão registrados?");
		int n = sc.nextInt();
		
		int id;
		String name; 
		double salary;
		
		// Instancia o Objeto func e adiciona ele a lista
		for(int i = 0; i < n; i++) {
			System.out.printf("Funcionario #%d: " , i + 1);
			System.out.println("Id: ");
			id = sc.nextInt();
			System.out.println("Nome: ");
			sc.nextLine();
			name = sc.nextLine();
			System.out.println("Salario: ");
			salary = sc.nextDouble();
			func = new Emplyoee(id,name,salary);
			funcionarios.add(func);	
		}
		
		System.out.println("Digite o id do funcionario que deseja aumentar o salario: ");
		int idfunc = sc.nextInt();
		System.out.println("Digite quantos porcento deseja aumentar: ");
		double aument = sc.nextDouble();
		
		boolean teste = false;
		
		// Se o id digitado existir, este for vai aumentar o salario conforme os dados acima
		for(Emplyoee x : funcionarios) {
			if(x.getId() == idfunc) {
				x.aumentarSalary(aument);
				teste = true; // Se o id for encontrado, teste recebe True e não imprime o if abaixo
			}
		}
		
		// Verificar se o id foi encontrado na lista
		if(teste == false) {
			System.out.println("O id digitado não existe");
		}
	
			
		// Listar os funcionarios presentes na lista
		System.out.println("List of employees: ");
		for(Emplyoee x : funcionarios) {
			System.out.println(x);
			
		}
		
		
		
		   sc.close();
		}
}
