package entidade;

public class SorveteArtesanal extends Sorvete {
	
	public void desconto() {
		this.setValor(getValor() - 0.50);
	}
}
