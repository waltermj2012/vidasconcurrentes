<!-- Author: Meta | www.vidasconcurrentes.blogspot.com -->
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Regex Javascript (Vidas Concurrentes)</title>

<script type="text/javascript">
function printCode(codigo) {
	var text;
	switch(codigo) {
		case 1:
			text = "function test() {\n" +
			"	var regex = /^(\\w+)@(\\w+)\\.([a-zA-z]{2,6})$/;\n" +
			"	var email = \"test@vidasconcurrentes.com\";\n" +
			"	document.write(email.match(regex));\n" +
			"}";
			break;
		case 2:
			text = "function test() {\n" +
  			"	var regex = /^(\\w+)@(\\w+)\\.([a-zA-z]{2,6})$/;\n" +
  			"	var email = \"test@vidasconcurrentes.com\";\n" +
			"	var coincidencias = regex.exec(email);\n" +
  			"	for(i = 0; i < coincidencias.length; i++)\n" +
   			"		document.write(coincidencias[i] + \"<br/ >\");\n" +
 			"}";
			break;
		case 3:
			text = "function test() {\n" +
			"	var regexLiteral = /\\w+/g;\n" +
			"	var regexObjeto = new RegExp(\"[a-z]+\", \"i\");\n" +
			"	var email = \"test@vidasconcurrentes.com\";\n" +
			"	var emailInsensitive = \"TesT@VidasConcurrentes.COM\";\n" +
			"	document.write(email.replace(regexLiteral, \"prueba\") + \"<br/ >\");\n" +
			"	document.write(emailInsensitive.replace(regexObjeto, \"prueba\") + \"<br/ >\");\n" +
			"}";
			break;
	}
	document.formulario.areaCodigos.innerHTML = text;
}

function printResult(codigo) {
	var result = "";
	var regex;
	var email;
	switch(codigo) {
		case 1:
			regex = /^(\w+)@(\w+)\.([a-zA-Z]{2,6})$/;
			email = "test@vidasconcurrentes.com";
			result = email.match(regex);
			break;
		case 2:
  			regex = /^(\w+)@(\w+)\.([a-zA-z]{2,6})$/;
  			email = "test@vidasconcurrentes.com";
  			var coincidencias = regex.exec(email);
  			for(i = 0; i < coincidencias.length; i++)
   				result += coincidencias[i] + "\n";
			break;
		case 3:
  			var regexLiteral = /\w+/g;
  			var regexObjeto = new RegExp("[a-z]+", "i");
  			email = "test@vidasconcurrentes.com";
  			var emailInsensitive = "TesT@VidasConcurrentes.COM";
  			result += email.replace(regexLiteral, "prueba") + "\n";
  			result += emailInsensitive.replace(regexObjeto, "prueba");
			break;
	}
	document.formulario.areaResultado.innerHTML = result;
}

function test(codigo) {
	printCode(codigo);
	printResult(codigo);
}
</script>
</head>

<body style="text-align:center;">
<form name="formulario">
	Pulsa los botones para ejecutar los ejemplos:<br />
    <input type="button" onclick="test(1)" value="Test 1" />
    <input type="button" onclick="test(2)" value="Test 2" />
    <input type="button" onclick="test(3)" value="Test 3" />
    <br />
    <br />Código:<br />
    <textarea rows="10" cols="60" name="areaCodigos" readonly="readonly"></textarea>
    <br />
    <br />Resultado (lo que ejecutaría <i>document.write()</i> ):<br />
    <textarea rows="10" cols="60" name="areaResultado" readonly="readonly"></textarea>
    <br /><br />
    <a href="http://www.vidasconcurrentes.blogspot.com">Vidas Concurrentes</a> | <a href="http://vidasconcurrentes.blogspot.com/2011/05/expresiones-regulares-y-lenguajes-de.html">Entrada sobre expresiones regulares y Javascript</a>
</form>
</body>
</html>