<?php
echo"<html>";
echo "<head></head>";
echo "<body>";
echo "<h1>Palindormo</h1><br>";
$valor=true;
function esPalindromo(string $valor1, string $valor2): bool {

    if ($valor1 == $valor2) {
        return true;
    } else {
        return false;
    }
}
$frase="anitalavalatina";
$contador1=0;
$contador2= strlen($frase)-1;
while ($valor==true) {
  
    if (esPalindromo($frase[$contador1], $frase[$contador2])==true) {
        $contador1++;
        $contador2--;
    } else {
        echo "La frase no es un palindromo";
        $valor=false;
    }
    if($contador1>=$contador2){
        echo "La frase es un palindromo";
        break;
    }
}
echo "</body>";
echo "</html>";
?>