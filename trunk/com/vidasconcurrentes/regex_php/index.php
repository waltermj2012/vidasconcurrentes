<!-- Author: Meta | www.vidasconcurrentes.blogspot.com -->
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Regex PHP (Vidas Concurrentes)</title>
</head>
<body>
	<?php
		// Recordamos que en PHP, un 0 significa false y cualquier otra cosa significa true
		
		// preg_match() busca el patron en la cadena y devuelve 0 si no lo encuentra
        echo 'Ejemplo con preg_match(): <br/ >';
        echo '<pre>';
        echo 'preg_match(\'/^(\w+)@(\w+)\.([a-zA-z]{2,6})$/\', \'test@vidasconcurrentes.com\');&#9;->&#9;';
        echo preg_match('/^(\w+)@(\w+)\.([a-zA-z]{2,6})$/', 'test@vidasconcurrentes.com');
        echo '</pre><br />';
		
		// preg_match() puede, opcionalmente, recibir un tercer parametro que sera un array en el que va a guardar los grupos que ha conseguido encajar
		echo 'Ejemplo con preg_match() y captura de parentesis: <br/ >';
        echo '<pre>';
        echo 'preg_match(\'/^(\w+)@(\w+)\.([a-zA-z]{2,6})$/\', \'test@vidasconcurrentes.com\', $capturas);&#9;->&#9;';
		echo preg_match('/^(\w+)@(\w+)\.([a-zA-z]{2,6})$/', 'test@vidasconcurrentes.com', $capturas);
		echo '<br />';
		print_r($capturas);
		echo '</pre><br />';
		
		// preg_replace() busca la expresion regular en la cadena y la reemplaza por la cadena de reemplazo, hasta llegar al final de la cadena (no se para en la primera)
		echo 'Ejemplo con preg_replace() sin arrays: <br/ >';
        echo '<pre>';
		echo 'preg_replace(\'/(\w+)/\', \'prueba\', \'test@vidasconcurrentes.com\');&#9;->&#9;';
		echo preg_replace('/(\w+)/', 'prueba', 'test@vidasconcurrentes.com');
		echo '</pre><br />';
		
		// preg_replace() puede recibir un array de expresiones regulares y un array de reemplazos que se corresponden posicion a posicion, de modo que la primera expresion regular sera reemplazada por el primer reemplazo cuando se encuentre en la cadena de texto, la segunda por la segunda...
		echo 'Ejemplo con preg_replace() con arrays: <br/ >';
        echo '<pre>';
		$regexes = array('/[a-zA-Z]+/', '/\d+/', '/\-/');
		$replacements = array('letras', 'numeros', '_');
		echo 'preg_replace($regexes, $replacements, \'perro test 123 prueba - - -\');&#9;->&#9;';
		echo preg_replace($regexes, $replacements, 'perro test 123 prueba - - -');
		echo '</pre><br />';
    ?>
</body>
</html>