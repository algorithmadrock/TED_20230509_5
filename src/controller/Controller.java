/*
RESUMO      : Comandos do código
PROGRAMADORA: Luiza Felix
DATA        : 01/06/2023
 */

package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import br.edu.fateczl.listas.Lista;
import model.Cliente;

public class Controller {
	
	public Controller(){
	}

	public static void newregister(int minage, int maxage, double limite) throws Exception {
		Lista clientes = new Lista();
		File arquivo = new File("C:\\sistemas operacionais i\\TED_20230509_5\\cadastro.csv");
		
		FileInputStream fluxo = new FileInputStream(arquivo);
		InputStreamReader leitor = new InputStreamReader(fluxo);
		BufferedReader buffer = new BufferedReader(leitor);
		String linha = buffer.readLine();
		
		while(linha!= null) {
			String[] dados = linha.split(";"), dado = dados[3].split(",");
			String credito = dado[0] + dado[1];
			Cliente cliente = new Cliente(dados[0], dados[1], Integer.parseInt(dados[2]),Double.parseDouble(credito));
			
			if((cliente.getIdade()>= minage) &&(cliente.getIdade()>=maxage) && (cliente.getLimite()>limite)) {
				clientes.addfirst(cliente);
			}
			
			linha = buffer.readLine();
		}
		newfile(clientes, "IDADE"+(int)(minage + maxage)/2 +"_LIMITE"+ limite);
		
		buffer.close();
		leitor.close();
		fluxo.close();
		
	}
	
	private static void newfile(Lista clientes, String nome) throws Exception {
//		aqui parto do pressuposto que meu diretório sempre existirá
		File arquivo = new File("C:\\sistemas operacionais i\\TED_20230509_5\\"+nome+".csv");
		StringBuffer dados = new StringBuffer();
		int size = clientes.size();
		
		for(int i = (size - 1); i > -1; i --) {
			Cliente cliente = (Cliente) clientes.get(i);
			String linha = cliente.getCpf() + ";" + cliente.getNome() + ";" + cliente.getIdade() + ";" + cliente.getLimite();
			dados.append(linha);
		}
		
		FileWriter caderno = new FileWriter(arquivo,false);
		PrintWriter escritor = new PrintWriter(caderno);
	
		escritor.write(dados.toString());
		escritor.flush();
		escritor.close();
		
		caderno.close();
	}
	
	

		
		
		
		
		
		
		
		
		
		
//		
//		
//		
//		File arq = new File(); //diretório e arquivo são enxergues como a mesma coisa
//		boolean existe =  false;	
//		if (arq.exists()) {	existe = true; }
//
//		File arquivo = new File("C:\\sistemas operacionais i\\steam_charts.csv");
//		
//		FileInputStream fluxo = new FileInputStream(arquivo);
//		InputStreamReader leitor = new InputStreamReader(fluxo);
//		BufferedReader buffer = new BufferedReader(leitor);
//		FileWriter escritor = new FileWriter(arq,existe);
//		PrintWriter print = new PrintWriter(escritor);
//		
//		String linha = buffer.readLine();
//		linha = buffer.readLine();
//		
//		while(linha!=null) {
//			String[] game = linha.split(",");
//			if (Integer.parseInt(game[1])== ano && game[2].equalsIgnoreCase(mes)) {
//				String conteudo = game[0]+ ";" + game[3] + ";\n";
//				
//				print.write(conteudo); 
//				
//				
//				
//			}
//			linha = buffer.readLine();
//		}
//		
//		
//		System.out.println("Seu arquivo foi criado e salvo com sucesso!");
//		print.flush();
//		print.close(); 
//		escritor.close();
//		
//		buffer.close();
//		leitor.close();
//		fluxo.close();
		
		
//		

}
