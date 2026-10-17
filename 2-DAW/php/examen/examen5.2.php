<?php
if ($_SERVER["REQUEST_METHOD"] == "POST" && isset($_POST['usuario']) && isset($_POST['password'])) {
    $nombre = trim($_POST['nombre']);
    $direccion = trim($_POST['direccion']);
    $email = trim($_POST['email']);
    $provincia = trim($_POST['provincia']);
    $telefono = trim($_POST['telefono']);
    $pais = isset($_POST['pais']) ? trim($_POST['pais']) : '';
}
?>
 <!DOCTYPE html>
    <html lang="es">
    <head>
        <meta charset="UTF-8">
        <title>Resultado </title>
    </head>
    <body>
        <p>Bienvenido, <?php echo htmlspecialchars($_POST["nombre"]); ?> </p>
        <p>Tu dirección de contacto es: <?php echo htmlspecialchars($_POST["direccion"]); ?>, perteneciente a la provincia de <?php echo htmlspecialchars($_POST["provincia"]); ?> de <?php echo htmlspecialchars($_POST["pais"]); ?></p>
        <p>Se puede contactar con Vd. al correo  <?php echo htmlspecialchars($_POST["email"]); ?> o el telefono <?php echo htmlspecialchars($_POST["telefono"]); ?></p>

        <a href="examen5.php">Volver</a>
    </body>
    </html>