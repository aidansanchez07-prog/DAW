<?php
echo"<html>";
echo "<head></head>";
echo "<body>";
function aplicarDescuento(float $importe): float
{
    if ($importe >= 500) {
        $descuento = 15;
    } elseif ($importe >= 100) {
        $descuento = 10;
    } else {
        $descuento = 0;
    }
 
    return $importe - ($importe * $descuento / 100);
}
$precio = 150;
echo "Precio original: $precio €<br>";
echo "Precio con descuento: " . aplicarDescuento($precio) . " €<br>";
$precio2= 780;
echo"Precio original: $precio2 €<br>";
echo "Precio con descuento: " . aplicarDescuento($precio2) . " €<br>";
echo "</body>";
echo "</html>";

?>