package automato;

import java.util.ArrayList;

import model.Cadeia;
import model.Estado;
import model.Transicao;

public class Test {

	public static void main(String[] args) {

		ArrayList<Estado> estados = new ArrayList<>();

		Estado q0 = new Estado();
		q0.setNome("q0");
		Estado q1 = new Estado();
		q1.setNome("q1");
		Estado q2 = new Estado();
		q2.setNome("q2");

		q0.setEstadoInicial(true);
		q2.setEstadoFinal(true);

		estados.add(q0);
		estados.add(q1);
		estados.add(q2);

		ArrayList<Transicao> q0Transicoes = new ArrayList<>();
		q0Transicoes.add(new Transicao(estados.get(0), estados.get(0), "0", "E", "E"));
		q0Transicoes.add(new Transicao(estados.get(0), estados.get(1), "E", "E", "E"));

		ArrayList<Transicao> q1Transicoes = new ArrayList<>();
		q1Transicoes.add(new Transicao(estados.get(1), estados.get(1), "1", "x", "E"));
		q1Transicoes.add(new Transicao(estados.get(1), estados.get(2), "E", "$", "$"));

		ArrayList<Transicao> q3Transicoes = new ArrayList<>();

		q0.setTransicoes(q0Transicoes);
		q1.setTransicoes(q1Transicoes);
		q2.setTransicoes(q3Transicoes);

		Cadeia c = new Cadeia();
		c.setItens("0", "0", "0", "1", "1", "1");

		Automato a = new Automato(estados, c);
		ArrayList<String> listresul = a.run();
		for (String r : listresul) {
			System.out.println(r);
			
		}
		
	}
	// L = {0n, 1²n, 0³n| n>1}
	// String[] fita =
	// {"[]","[]","[]","0","0","1","1","1","1","0","0","0","0","0","0","[]","[]","[]"};

}
