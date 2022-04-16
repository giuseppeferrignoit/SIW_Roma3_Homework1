package it.uniroma3.siw.hw1.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import it.uniroma3.siw.hw1.model.Allievo;
import it.uniroma3.siw.hw1.model.Corso;
import it.uniroma3.siw.hw1.model.Docente;
import it.uniroma3.siw.hw1.model.Societa;

public class EnteMain {
	
public static void main(String[] args ) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory ("ente-unit");
		EntityManager em = emf.createEntityManager ();
		EntityTransaction tx = em.getTransaction ();
		
		Societa societa;
		Allievo allievo1, allievo2, allievo3, allievo4, allievo5;
		Docente docente1, docente2, docente3;
		Corso corso1, corso2, corso3, corso4, corso5;
		
		docente1 = new Docente();
		docente2 = new Docente();
		docente3 = new Docente();
		corso1 = new Corso();
		corso2 = new Corso();
		corso3 = new Corso();
		corso4 = new Corso();
		corso5 = new Corso();
		societa = new Societa();
		allievo1 = new Allievo();
		allievo2 = new Allievo();
		allievo3 = new Allievo();
		allievo4 = new Allievo();
		allievo5 = new Allievo();
	
		List<Corso> listaCorsiAllievo1 = new ArrayList<Corso> ();
		List<Corso> listaCorsiAllievo2 = new ArrayList<Corso> ();
		List<Corso> listaCorsiAllievo3 = new ArrayList<Corso> ();
		List<Corso> listaCorsiAllievo4 = new ArrayList<Corso> ();
		List<Corso> listaCorsiAllievo5 = new ArrayList<Corso> ();
		
		List<Allievo> listaAllievi1 = new ArrayList<Allievo>();
		List<Allievo> listaAllievi2 = new ArrayList<Allievo>();
		List<Allievo> listaAllievi3 = new ArrayList<Allievo>();
		List<Allievo> listaAllievi4 = new ArrayList<Allievo>();
		List<Allievo> listaAllievi5 = new ArrayList<Allievo>();

		
		List<Corso> listaCorsiDocente1 = new ArrayList<Corso> ();
		List<Corso> listaCorsiDocente2 = new ArrayList<Corso> ();
		List<Corso> listaCorsiDocente3 = new ArrayList<Corso> ();

		// Crea 1 oggetto Societa, 5 oggetti Allievo, 3 oggetti Docente, 3 oggetti Corso
		
		docente1.setNome("Giorgio");
		docente1.setCognome("Rossi");
		docente1.setDataNascita(LocalDate.of(1976, 04, 10));
		docente1.setLuogoNascita("Roma");
		docente1.setPartitaIva(1001);
		
		docente2.setNome("Mario");
		docente2.setCognome("Bianchi");
		docente2.setDataNascita(LocalDate.of(1986, 04, 15));
		docente2.setLuogoNascita("Viterbo");
		docente2.setPartitaIva(1002);
		
		docente3.setNome("Carlo");
		docente3.setCognome("Verdi");
		docente3.setDataNascita(LocalDate.of(1980, 04, 23));
		docente3.setLuogoNascita("Rieti");
		docente3.setPartitaIva(1003);
		
		corso1.setNome("Analisi");
		corso1.setDataInizio(LocalDate.of(2022, 01, 29));
		corso1.setDurataMesi(6);
		corso1.setDocente(docente1);
		
		corso2.setNome("Fisica");
		corso2.setDataInizio(LocalDate.of(2022, 01, 8));
		corso2.setDurataMesi(6);
		corso2.setDocente(docente2);
		
		corso3.setNome("Chimica");
		corso3.setDataInizio(LocalDate.of(2022, 01, 23));
		corso3.setDurataMesi(6);
		corso3.setDocente(docente3);
		
		corso4.setNome("Geometria");
		corso4.setDataInizio(LocalDate.of(2022, 01, 21));
		corso4.setDurataMesi(6);
		corso4.setDocente(docente1);
		
		corso5.setNome("Chimica2");
		corso5.setDataInizio(LocalDate.of(2022, 01, 27));
		corso5.setDurataMesi(6);
		corso5.setDocente(docente2);
		
		societa.setRagioneSociale("Societa di software swg");
		societa.setVia("Borgognone");
		societa.setNumeroCivico(16);
		societa.setComune("Milano");
		societa.setCap(20100);
		societa.setProvincia("Milano");
		societa.setTelefono("02345678");

		allievo1.setNome("Giovanni");
		allievo1.setCognome("Rossi");
		allievo1.setDataNascita(LocalDate.of(1996, 03, 31));
		allievo1.setMatricola("4100110");
		allievo1.setLuogoNascita("Roma");
		allievo1.setEmail("gianni@gmail.com");
		allievo1.setSocieta(societa);
		
		allievo2.setNome("Mario");
		allievo2.setCognome("Verdi");
		allievo2.setDataNascita(LocalDate.of(1999, 04, 15));
		allievo2.setMatricola("4102200");
		allievo2.setLuogoNascita("Roma");
		allievo2.setEmail("gianni@gmail.com");
		allievo2.setSocieta(societa);

		allievo3.setNome("Luciano");
		allievo3.setCognome("Ciotoli");
		allievo3.setDataNascita(LocalDate.of(1998, 03, 12));
		allievo3.setMatricola("4103300");
		allievo3.setLuogoNascita("Roma");
		allievo3.setEmail("gianni@gmail.com");
		allievo3.setSocieta(societa);

		allievo4.setNome("Marco");
		allievo4.setCognome("Caroni");
		allievo4.setDataNascita(LocalDate.of(1994, 05, 10));
		allievo4.setMatricola("4144200");
		allievo4.setLuogoNascita("Roma");
		allievo4.setEmail("gianni@gmail.com");
		allievo4.setSocieta(societa);

		allievo5.setNome("Gianni");
		allievo5.setCognome("Verga");
		allievo5.setDataNascita(LocalDate.of(1995, 04, 11));
		allievo5.setMatricola("4105500");
		allievo5.setLuogoNascita("Roma");
		allievo5.setEmail("gianni@gmail.com");
		allievo5.setSocieta(societa);
		
		tx.begin ();
		em.persist (docente1);
		em.persist (docente2);
		em.persist (docente3);
		em.persist (corso1);
		em.persist (corso2);
		em.persist (corso3);
		em.persist (corso4);
		em.persist (corso5);
		em.persist (societa);
		em.persist (allievo1);
		em.persist (allievo2);
		em.persist (allievo3);
		em.persist (allievo4);
		em.persist (allievo5);
		tx.commit ();
		
		tx.begin ();
		allievo1.setCorsi(listaCorsiAllievo1);
		allievo1.addCorso(corso1);
		allievo1.addCorso(corso2);
		allievo1.addCorso(corso4);
		em.merge(allievo1);
		tx.commit ();

		tx.begin ();
		allievo2.setCorsi(listaCorsiAllievo2);
		allievo2.addCorso(corso1);
		allievo2.addCorso(corso3);
		em.merge(allievo2);
		tx.commit ();

		tx.begin ();
		allievo3.setCorsi(listaCorsiAllievo3);
		allievo3.addCorso(corso2);
		allievo3.addCorso(corso3);
		allievo3.addCorso(corso5);
		em.merge(allievo3);
		tx.commit ();

		tx.begin ();
		allievo4.setCorsi(listaCorsiAllievo4);
		allievo4.addCorso(corso1);
		allievo4.addCorso(corso3);
		em.merge(allievo4);
		tx.commit ();
		
		tx.begin ();
		allievo5.setCorsi(listaCorsiAllievo5);
		allievo5.addCorso(corso1);
		allievo5.addCorso(corso3);
		em.merge(allievo5);
		tx.commit ();
		
		tx.begin ();
		corso1.setAllievi(listaAllievi1);
		corso1.addallievo(allievo1);
		corso1.addallievo(allievo2);
		corso1.addallievo(allievo4);
		corso1.addallievo(allievo5);
		em.merge(corso1);
		tx.commit ();
		
		tx.begin ();
		corso2.setAllievi(listaAllievi2);
		corso2.addallievo(allievo1);
		corso2.addallievo(allievo3);
		em.merge(corso2);
		tx.commit ();
		
		tx.begin ();
		corso3.setAllievi(listaAllievi3);
		corso3.addallievo(allievo2);
		corso3.addallievo(allievo3);
		corso3.addallievo(allievo4);
		corso3.addallievo(allievo5);
		em.merge(corso3);
		tx.commit ();
		
		tx.begin ();
		corso4.setAllievi(listaAllievi4);
		corso4.addallievo(allievo1);
		em.merge(corso4);
		tx.commit ();
		
		tx.begin ();
		corso5.setAllievi(listaAllievi5);
		corso5.addallievo(allievo3);
		em.merge(corso4);
		tx.commit ();
		
		// Docenti
		tx.begin ();
		docente1.setCorsi(listaCorsiDocente1);
		docente1.addCorso(corso1);
		docente1.addCorso(corso4);
		em.merge(docente1);
		tx.commit ();
		
		tx.begin ();
		docente2.setCorsi(listaCorsiDocente2);
		docente2.addCorso(corso2);
		docente2.addCorso(corso5);
		em.merge(docente2);
		tx.commit ();
		
		tx.begin ();
		docente3.setCorsi(listaCorsiDocente3);
		docente3.addCorso(corso3);
		em.merge(docente3);
		tx.commit ();
		
		// CHIUSURA EM E EMF
		em.close ();
		emf.close ();
	}
}