<?php
echo "<html>";
echo "<head></head>";
echo "<body>";
echo "<h1>PHP Info</h1>";
class Persona
{
    private $nombre;
    public function inicializar($nom)
    {

        $this->nombre = $nom;

    }
    public function imprimir()
    {
        echo $this->nombre;
        echo "<br>";
    }
}
$per1 = new Persona();
$per1->inicializar("Juan");
$per1->imprimir();
$per2 = new Persona();
$per2->inicializar("Maria");
$per2->imprimir();
echo "</body>";
echo "</html>";
?>