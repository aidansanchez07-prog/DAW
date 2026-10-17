<?php
echo"<html>";
echo "<head></head>";
echo "<body>";
Class Producto{
    private $nombre;
    private $precio;
    private $categoria;
    private $stock;
    public function __construct(String $nombre, int $precio, String $categoria, bool $stock){
        $this->nombre = $nombre;
        $this->precio = $precio;
        $this->categoria = $categoria;
        $this->stock = $stock;
    }
    public function mostrarInformacion(){
        echo "Nombre: $this->nombre<br>";
        echo "Precio: $this->precio €<br>";
        echo "Categoría: $this->categoria<br>";
        echo "Stock: $this->stock<br>";
    }
    public function calcularPrecioConIva(){
        echo "Precio con IVA: " . ($this->precio * 1.21) . " €<br>";
    }
    public function hayStock(){
        echo "Hay stock: $this->stock <br>";
    }
    
}
$producto1 = new Producto(

    "Teclado mecánico",

    59.99,

    "Periféricos",

    true

);
$producto1->mostrarInformacion();
$producto1->calcularPrecioConIva();
$producto1->hayStock();
$producto2 = new Producto(

    "Monitor 27 pulgadas",

    249.99,

    "Monitores",

    false

);
$producto2->mostrarInformacion();
$producto2->calcularPrecioConIva();
$producto2->hayStock();
$producto3 = new Producto(

    "Ratón inalámbrico",

    29.99,

    "Periféricos",

    true

);
$producto3->mostrarInformacion();
$producto3->calcularPrecioConIva();
$producto3->hayStock();
echo "</body>";
echo "</html>";
?>