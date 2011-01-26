import static org.junit.Assert.*;

import java.security.NoSuchAlgorithmException;

import org.junit.*;

import br.com.mmaciel.util.hash.HashUtil;



public class TestesHashUtil {

	String textoTeste = "Texto";
	String algoritimo = "MD5";
	
	@Test
	public void testaGeraHashDoTexto() throws NoSuchAlgorithmException{
		String hash = HashUtil.geraHashDoTexto(textoTeste);
		assertEquals("cc99c671f9ea86938e2c6cda65a65bc3", hash);
	}
	
	@Test
	public void testaGeraHashDoTextoComEscolhaDeAlgoritimo() throws NoSuchAlgorithmException{
		algoritimo = "MD5";
		String hash = HashUtil.geraHashDoTexto(textoTeste, algoritimo);
		assertEquals("cc99c671f9ea86938e2c6cda65a65bc3", hash);
	}	
	
	
	
}
