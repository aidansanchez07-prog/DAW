<?php
echo"<html>";
echo "<head></head>";
echo "<body>";
$nombreTienda = "POShop";
$producto= "Ordenador";
$precio = 1000;
$cantidad=10;
$descuento=0.10;
$importeSinDescuento = $precio * $cantidad;
$importeDelDescuento = $importeSinDescuento * $descuento;
$cantidadFinal = $importeSinDescuento - $importeDelDescuento;
echo "Tienda: $nombreTienda<br>";
echo "Producto: $producto<br>";
echo "Precio: $precio €<br>";
echo "Cantidad: $cantidad<br>";
echo "Subtotal: $importeSinDescuento €<br>";
echo "Descuento: " . ($descuento * 100) . "%<br>";
echo "Total: $cantidadFinal €<br>";
echo "</body>";
echo "</html>";
?>