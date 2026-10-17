<?php
    echo "<html>";
    echo "<head></head>";
    echo "<body>";
    
    function mostrarDiaNumeros(int $mes, int $dia) {
        $arraymeses = [
            1=> "  Enero",
            2=> "  Febrero",
            3=> "  Marzo",
            4=> "  Abril",
            5=> "  Mayo",
            6=> "  Junio",
            7=> "  Julio",
            8=> "  Agosto",
            9=> "  Septiembre",
            10=> "  Octubre",
            11=> "  Noviembre",
            12=> "  Diciembre"
        ];
        $arraydias = [
            1=> "  Lunes",
            2=> "  Martes",
            3=> "  Miercoles",
            4=> "  Jueves",
            5=> "  Viernes",
            6=> "  Sabado",
            7=> "  Domingo"
        ];
        $arraydiasmeses = [
            1=> 31,
            2=> 28,
            3=> 31,
            4=> 30,
            5=> 31,
            6=> 30,
            7=> 31,
            8=> 31,
            9=> 30,
            10=> 31,
            11=> 30,
            12=> 31
        ];

        if (isset($arraymeses[$mes])) {
            echo "Tu mes es " . $arraymeses[$mes] . " tiene " . $arraydiasmeses[$mes] . " dias";
        } else {
            echo "El mes no es valido";
        }

        if (isset($arraydias[$dia])) {
            echo " y tu dia es " . $arraydias[$dia];
        } else {
            echo " y el dia no es valido";
        }
        echo "<hr>";
    }
    
    mostrarDiaNumeros(1, 1);
    mostrarDiaNumeros(2, 2);
    mostrarDiaNumeros(38, 4);
    mostrarDiaNumeros(0, 0);
    mostrarDiaNumeros(10, 5);
   
    echo "</body>";
    echo "</html>";
?>