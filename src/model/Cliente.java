/*
RESUMO      : Objeto Cliente
PROGRAMADORA: Luiza Felix
DATA        : 02/06/2023
 */

package model;

public class Cliente {
	
	private String cpf, nome;
	private int idade;
	private double limite;
	
	public Cliente(String cpf, String nome, int idade, double limite) { //construtor 1
		this.cpf = cpf;
		this.nome = nome;
		this.idade = idade;
		this.limite = limite;
	}
	
	public Cliente() { // construtor 2
		
	}

	public String getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public double getLimite() {
		return limite;
	}


}
