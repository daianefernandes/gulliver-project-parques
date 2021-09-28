package br.com.gulliver.project.parques.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static List<Parque> listParques = new ArrayList<Parque>();
	private static Integer chaveSequencial = 1;
	
	static {
		Parque parque1 = new Parque();
		parque1.setNome("Parque do Ibirapuera");
		parque1.setLocalizacao("Avenida Pedro Álvares Cabral");
		parque1.setUrlSiteOficial("https://parqueibirapuera.org");
		parque1.setId(chaveSequencial++);
		
		Parque parque2 = new Parque();
		parque2.setNome("Jardim Botânico de São Paulo");
		parque2.setLocalizacao("Avenida Miguel Estéfno, 3031");
		parque2.setUrlSiteOficial("https://jardimbotanico.sp.gov.br");
		parque2.setId(chaveSequencial++);
		
		Parque parque3 = new Parque();
		parque3.setNome("Parque Alfredo Volpi");
		parque3.setLocalizacao("Rua Engenheiro Oscar Americano, 480");
		parque3.setUrlSiteOficial("https://www.saopaulo.sp.gov.br/conhecasp/parques-e-reservas-naturais/parque-alfredo-volpi/");
		parque3.setId(chaveSequencial++);
		
		Parque parque4 = new Parque();
		parque4.setNome("Parque Buenos Aires");
		parque4.setLocalizacao("Avenida Angélica, 1500");
		parque4.setUrlSiteOficial("https://www.prefeitura.sp.gov.br/cidade/secretarias/meio_ambiente/parques/regiao_centrooeste/index.php?p=5732");
		parque4.setId(chaveSequencial++);
		
		Parque parque5 = new Parque();
		parque5.setNome("Parque da Independência");
		parque5.setLocalizacao("Avenida Nazaré, s/n");
		parque5.setUrlSiteOficial("http://museudoipiranga2022.org.br/mapa-site/parque-independencia/");
		parque5.setId(chaveSequencial++);
		
		listParques.add(parque1);
		listParques.add(parque2);
		listParques.add(parque3);
		listParques.add(parque4);
		listParques.add(parque5);
	}

	public List<Parque> getParques() {
		return listParques;
	}

	public void include(Parque parque) {
		listParques.add(parque);
	}

	public void removeParque(Integer id) {
		Iterator<Parque> it = listParques.iterator();
		
		while (it.hasNext()) {
			Parque parque = (Parque) it.next();
			if(parque.getId() == id) {
				it.remove();
			}
		}
		
	}
	
	public Parque searchId(Integer id) {
		for (Parque parque : listParques) {
			if(parque.getId() == id) {
				return parque;
			}
		}
		return null;
	}

}
