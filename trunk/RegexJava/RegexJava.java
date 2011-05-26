import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Author: Meta | www.vidasconcurrentes.blogspot.com
 */
public class RegexJava {
	
	private void matchesMatcher() {
		System.out.println("Ejemplo de la funcion matches() del Matcher:");
		Pattern regex = Pattern.compile("(\\w+)@(\\w+)\\.([a-zA-z]{2,6})");
		Matcher matcher = regex.matcher("test@vidasconcurrentes.com");
		System.out.println("\t" + matcher.matches());
		// output: true
		 
		regex = Pattern.compile("(\\w+)@(\\w+)\\.([a-zA-z]{2,6})");
		matcher = regex.matcher("basura test@vidasconcurrentes.com basura");
		System.out.println("\t" + matcher.matches());
		// output: false
	}
	
	private void find() {
		System.out.println("Ejemplo de la funcion find() del Matcher:");
		Pattern regex = Pattern.compile("(\\w+)");
		Matcher matcher = regex.matcher("test@vidasconcurrentes.com");
		while(matcher.find())
		   System.out.println("\t" + matcher.group());
		System.out.println();
		/* output:
		          test
		          vidasconcurrentes
		          com
		*/
		 
		regex = Pattern.compile("(\\w+)@(\\w+)\\.([a-zA-z]{2,6})");
		matcher = regex.matcher("test@vidasconcurrentes.com");
		System.out.println("\t" + matcher.find());
		// output: true
		 
		regex = Pattern.compile("(\\w+)@(\\w+)\\.([a-zA-z]{2,6})");
		matcher = regex.matcher("basura test@vidasconcurrentes.com basura");
		System.out.println("\t" + matcher.find());
		// output: true
	}
	
	private void matchesPattern() {
		System.out.println("Ejemplo de la funcion matches() del Pattern:");
		System.out.println("\t" + Pattern.matches("(\\w+)@(\\w+)\\.([a-zA-z]{2,6})", "test@vidasconcurrentes.com"));
		//output: true

		System.out.println("\t" + Pattern.matches("(\\w+)@(\\w+)\\.([a-zA-z]{2,6})", "basura test@vidasconcurrentes.com basura"));
		//output: false
	}
	
	private void replacement() {
		System.out.println("Ejemplo de reemplazo con appendReplacement() y appendTail():");
		Pattern patron = Pattern.compile("(\\w+)");
		Matcher matcher = patron.matcher("test@vidasconcurrentes.com");
		   
		StringBuffer sb = new StringBuffer();
		matcher.find(); // reemplazamos solo la primera
		matcher.appendReplacement(sb, "prueba");
		matcher.appendTail(sb);
		   
		System.out.println("\t" + sb.toString());
		// output: prueba@vidasconcurrentes.com
	}
	
	private void replacementGlobalInsensitive() {
		System.out.println("Ejemplo de reemplazo global e insensitive con appendReplacement() y appendTail():");
		Pattern patron = Pattern.compile("([a-z]+)", Pattern.CASE_INSENSITIVE);
		Matcher matcher = patron.matcher("TeSt@VidasConcuRRentes.cOM");
		     
		StringBuffer sb = new StringBuffer();
		while(matcher.find()) // reemplazamos todo, no solo la primera
		 matcher.appendReplacement(sb, "prueba");
		matcher.appendTail(sb);
		     
		System.out.println("\t" + sb.toString());
		// output: prueba@prueba.prueba
	}

	public static void main(String[] args) {
		RegexJava ejemplos = new RegexJava();
		
		ejemplos.matchesMatcher();
		ejemplos.find();
		ejemplos.matchesPattern();
		ejemplos.replacement();
		ejemplos.replacementGlobalInsensitive();
	}
}
