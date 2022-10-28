package exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import exercicio.entidades.Empregado;
import exercicio.entidades.Terceirizado;

public class SistemaEmpregado {

	public static void main(String[] args) {
		List<Empregado> empregados= new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.print("Entre com a quantidade de empregados: ");
		int qtdEmp= input.nextInt();
		
		for(int i =0; i<qtdEmp;i++) {
			
			System.out.print("Entre com o nome do Empregado: ");
			input.nextLine();
			String nome = input.next();
			System.out.print("Entre com o numero de horas trabalhadas: ");
			int horasTrabalhadas = input.nextInt();
			System.out.print("Entre com o valor da Hora trabalhada: ");
			Double valorHora= input.nextDouble();
			System.out.print("O trabalhador "+nome+" é terceirizado (s/n): ");
			String opcao =input.next();
			if(opcao.equalsIgnoreCase("s")) {
					empregados.add(new Terceirizado(nome,horasTrabalhadas,valorHora,200.00));
			}else if(opcao.equalsIgnoreCase("n")){
				empregados.add(new Empregado(nome,horasTrabalhadas,valorHora));
			}else {
				System.out.println("Opção inválida");
				i--;
			}
		}
		
		System.out.printf("****** PAGAMENTOS DEVIDOS: \n\n");
		for(Empregado em:empregados) {
			System.out.printf("%s - %.2f \n",em.getNome(),em.valorPagamento());
		}
		
		input.close();
	}

}
