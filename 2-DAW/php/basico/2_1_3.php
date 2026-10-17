<html>
    <head></head>
    <body>
        <?php
        //Informacion servidor
        echo "Informacion del servidor: " . $_SERVER['SERVER_ADDR'] . ":" . $_SERVER['SERVER_PORT'] . "<br>";

        //Ruta  carpeta raiz 
        echo "Ruta de la carpeta del servidor: " . $_SERVER['DOCUMENT_ROOT'] . "<br>";

        //Nombre del servidor 
        echo "Nombre del servidor: " . $_SERVER['SERVER_NAME'] . "<br>";

        //Software del servidor 
        echo "Software del servidor: " . $_SERVER['SERVER_SOFTWARE'] . "<br>";

        //Protocolo peticion 
        echo "Protocolo: " . $_SERVER['SERVER_PROTOCOL'] . "<br>";

        //Metodo de la peticion 
        echo "Metodo de la peticion: " . $_SERVER['REQUEST_METHOD'] . "<br>";
         ?>
    </body>
</html>