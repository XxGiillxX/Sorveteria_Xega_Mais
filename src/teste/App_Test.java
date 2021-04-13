package teste;

import java.util.ArrayList;
import java.util.List;

import entidade.Sorvete;
import entidade.SorveteArtesanal;
import entidade.SorveteItaliano;

public class App_Test {
	
	public static void main(String[] args) {
		
		// criando a lista de sorvetes
		List<Sorvete> listaSorvete = new ArrayList<Sorvete>();
		
		//criando o objeto do tipo sorvete artesanal
		SorveteArtesanal sa = new SorveteArtesanal();
		
		//criando o objeto do tipo sorvete italiano
		SorveteItaliano si = new SorveteItaliano();
		
		//criando o objeto
		Sorvete sv1 = new Sorvete();
		sv1.setSabor("Morango");
		sv1.setValor(5.50);
		sv1.setMarca("Magnum");
		sv1.setTipo(sa);
		
		//cirando o objeto e 
		Sorvete sv2 = new Sorvete();
		sv2.setSabor("Chocolate");
		sv2.setValor(4.50);
		sv2.setMarca("Cornetto");
		sv2.setTipo(si);
		
		// adicionando a lista
		listaSorvete.add(sv1);
		listaSorvete.add(sv2);
		
		
		//listando sorvete
		for (Sorvete sorvete : listaSorvete) {
			System.out.println("Sabor: "+sorvete.getSabor()+"||Marca: "
		+sorvete.getMarca()+"||Valor: R$"+sorvete.getValor()+"||"+sorvete.getTipo().getClass().getSimpleName());
			
		}	
			
		//removendo da lista
		listaSorvete.remove(sv1);
		listaSorvete.remove(sv2);
	
		
	}
}
