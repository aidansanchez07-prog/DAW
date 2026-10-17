<html>
    <head></head>
    <body>
        <?php
        class Coche{
            public $color;
            private $marca;
            private $modelo;
            private $velocidad=0;
            public function __construct($color,$marca,$modelo){
                $this->color = $color;
                $this->marca = $marca;
                $this->modelo = $modelo;
            }
            public function acelerar(){
                $this->velocidad += 10;
                echo "Ahora vas a $this->velocidad<br>";
            }
            public function frenar(){
                $this->velocidad -= 10;
                echo "Ahora vas a $this->velocidad<br>";
            }
            public function vervelocidad(){
                echo "Vas a $this->velocidad<br>";
            }
        }
        class Cochera{
                public function pintar(Coche $coche, $nuevoColor){
                    $coche->color=$nuevoColor;
                    echo "Coche pintado de $nuevoColor <br>";
                }
                
            }
            $coche = new Coche("rojo", "Seat", "Ibiza");
           
            $coche->acelerar();
            $coche->acelerar();
            $coche->acelerar();
            $coche->frenar();
            $coche->vervelocidad();

            $cochera = new Cochera();
            $cochera->pintar($coche, "azul");
            
           ?>
    </body>
</html>