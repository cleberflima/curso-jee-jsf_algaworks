package br.cleber.financeiro;

import javax.persistence.Persistence;

public class CriarTabelas {

	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("FinanceiroPU");

	}

}
