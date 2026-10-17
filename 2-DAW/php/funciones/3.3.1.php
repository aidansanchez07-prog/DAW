<?php
echo"<html>";
echo "<head></head>";
echo "<body>";
function importeConIva(float $cantidad, float $iva = 21): float
{
    return $cantidad + ($cantidad * $iva / 100);
}

function incremento10(float $importe): float
{
    return $importe * 1.10;
}
 

$base = 100;
 
echo "Importe base: {$base} €<br>";
echo "Con IVA por defecto (21%): " . importeConIva($base) . " €<br>";
echo "Con IVA reducido (10%): " . importeConIva($base, 10) . " €<br>";
echo "Con IVA superreducido (4%): " . importeConIva($base, 4) . " €<br>";
echo "Con incremento del 10%: " . incremento10($base) . " €<br>";
echo "</body>";
echo "</html>";

?>