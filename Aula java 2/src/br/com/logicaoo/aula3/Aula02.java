package br.com.logicaoo.aula3;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;


public class Aula02 {
	
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/bd_ii_aula_1";
	static ArrayList <Estudante> listaEstudante = new ArrayList <Estudante>();

	static final String usuario = "root";
	static final String senha = "123456";
	public static void main(String[] args) {

		Connection conexao = null;
		Statement instrucao = null;
		String consulta = null;

		// Registrar o JDBC driver
		try {
			Class.forName("com.mysql.jdbc.Driver");

			// Abrir uma conexao
			conexao = DriverManager.getConnection(DB_URL, usuario, senha);
			instrucao = conexao.createStatement();
			//consulta = "INSERT INTO ESTUDANTE VALUES ('dieice', 25, 'veterano', 'sistemas de informação')";
			//instrucao.executeUpdate(consulta);
			consulta = "SELECT * FROM ESTUDANTE";
			ResultSet conjuntoResultado = instrucao.executeQuery(consulta);

			// Extrair os resultados do conjunto resultado


			if (!conjuntoResultado.next()) {
				System.out.println("A tabela estudante está vazia");
			} else {
				do {

					// Recuperar todos os dados de acordo com cada linha
					// retornada
					// pelo resultado.

					String nome_do_estudante = conjuntoResultado.getString("nome_do_estudante");
					int id_estudante = conjuntoResultado.getInt("id_estudante");
					String senioridade = conjuntoResultado.getString("senioridade");
					String graduacao = conjuntoResultado.getString("graduação");

					Estudante estudante = new Estudante(nome_do_estudante, id_estudante, senioridade, graduacao);
					//adicionar os campos na ArrayList
					listaEstudante.add(estudante);
					//Imprimir os valores na tela
//
//					System.out.print("nome_do_estudante: " + nome_do_estudante);
//					System.out.print(", id_estudante: " + id_estudante);
//					System.out.print(", senioridade: " + senioridade);
//					System.out.println(", graduacao: " + graduacao);
					//ou
//					System.out.println(estudante.toString());
					
				} while (conjuntoResultado.next());
			}
			
//			Enumeration e = new Vector(listaEstudante).elements();
////			Collections.list(e);
//			Iterator<Estudante> it = listaEstudante.iterator();
//			while (e == listaEstudante ){
//			Estudante estudante = it.next();
//			System.out.println(estudante);
				
		//}
			
//			for (Estudante estudante: listaEstudante){
//				System.out.println(estudante);
//			}
			
			listaEstudante.forEach(estudante -> System.out.println(estudante));
			
			
			conjuntoResultado.close();
			instrucao.close();
			conexao.close();
		} catch (SQLException sqlException) {
			System.out.println(sqlException);
		} catch (ClassNotFoundException classNotFoundException) {
			System.out.println(classNotFoundException);
		}
	}

}
