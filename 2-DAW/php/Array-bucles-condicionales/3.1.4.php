<?php
    echo "<html>";
    echo "<head></head>";
    echo "<body>";
    $amarillos=0;
    $verdes=0;
    $naranjas=0;
    $azules=0;
    $rojos=0;
    $grises=0;
    $moneda2=0;
    $moneda1=0;
    $random = random_int(1000, 2000);
    echo"El dinero es $random <br><br>";
    while($random>=200){
        $random=$random-200;
        $amarillos++;
    }
    while($random>=100){
        $random=$random-100;
        $verdes++;
    }
    while($random>= 50){
        $random=$random-50;
        $naranjas++;
    }
    while($random>= 20){
        $random=$random-20;
        $azules++;
    }
    while($random>= 10){
        $random=$random-10;
        $rojos++;
    }
    while($random>= 5){
        $random=$random-5;
        $grises++;
    }
    while($random>= 2){
        $random=$random-2;
        $moneda2++;
    }
    while($random>= 1){
        $random=$random-1;
        $moneda1++;
    }
    echo "Billetes de 200: $amarillos<br>";
    echo "Billetes de 100: $verdes<br>";
    echo "Billetes de 50: $naranjas<br>";
    echo "Billetes de 20: $azules<br>";
    echo "Billetes de 10: $rojos<br>";
    echo "Billetes de 5: $grises<br>";
    echo "Monedas de 2: $moneda2<br>";
    echo "Monedas de 1: $moneda1<br>";
    echo "</body>";
    echo "</html>";
?>