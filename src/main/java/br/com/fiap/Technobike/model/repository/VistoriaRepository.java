package br.com.fiap.Technobike.model.repository;

import java.util.ArrayList;

import br.com.fiap.Technobike.model.entity.ChallengeVistoria;

public class VistoriaRepository {
	public static ArrayList<ChallengeVistoria> findAll(){
		ArrayList<ChallengeVistoria> vistoria = new ArrayList<ChallengeVistoria>();
		
		ChallengeVistoria cliente1 = new ChallengeVistoria();
		cliente1.setCpf("12345678910");
		cliente1.setOpcSeguro(2);
		cliente1.setBikeInteira("aa");
		cliente1.setNumSerie("aa");
		cliente1.setRoda("aa");
		cliente1.setFreios("aa");
		cliente1.setGuidao("aa");
		cliente1.setPedais("aa");
		cliente1.setCorrente("aa");
		cliente1.setClienteBike("aa");
		cliente1.setBikeFrente("aa");
		cliente1.setAcessorios("aa");
		cliente1.setVideoBike("aa");
		cliente1.setVideoPartes("aa");
		
		vistoria.add(cliente1);
		return vistoria;
	}
}
