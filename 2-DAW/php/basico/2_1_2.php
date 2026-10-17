<html>
    <head></head>
    <body>
        <?php
        //Saca un numero random del 50 al 800
            $longitud = random_int(50, 800);
        // Hago un hr con el width con la variable del random
            echo "<hr style=' height:5px; width: {$longitud}px;background-color:black;'></hr>";

        // Ver la longitud que salio
            echo "Longitud: $longitud px";
          ?>
    </body>
</html>