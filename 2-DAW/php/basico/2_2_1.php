<html>
    <head></head>
    <body>
        <?php
            class CuentaBancaria{
                private $saldo;
                public function __construct($saldo){
                    $this->saldo = $saldo;
                }
                public function ingresar($ingreso){
                    $this->saldo += $ingreso;
                    echo "Has ingresado $ingreso € ahora tienes $this->saldo € <br>";
                }
                public function retirar($retirado){
                    $this->saldo -= $retirado;
                    echo "Has retirado $retirado € ahora tienes $this->saldo € <br>";
                }
                public function versaldo(){
                    echo "Tienes $this->saldo € <br>";
                }
            }
            $cuenta=new CuentaBancaria(50);
            $cuenta->retirar(30);
            $cuenta->ingresar(100);
            $cuenta->versaldo();
        ?>
    </body>
</html>