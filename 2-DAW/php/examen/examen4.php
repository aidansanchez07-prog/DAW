<?php

$loginCorrecto = false;

if ($_SERVER["REQUEST_METHOD"] == "POST" && isset($_POST['usuario']) && isset($_POST['password'])) {
    $usuario = trim($_POST['usuario']);
    $password = trim($_POST['password']);
    $loginCorrecto = ($usuario == 'daw' && $password == '2026') ? true : false;
}
?>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Sistema de Login</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 0; padding: 0; }
        .top-bar {
            background-color: #333;
            color: white;
            padding: 12px 20px;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }
        .top-bar a { color: #ff6b6b; text-decoration: none; font-weight: bold; }
        .content { padding: 20px; }
    </style>
</head>
<body>

<?php if ($loginCorrecto): ?>
    <div class="top-bar">
        <span>Bienvenido/a, <strong><?php echo $usuario; ?></strong></span>
    </div>
    <div class="content">
        
        <input type='submit' value='1. Inicio'>
        <input type='submit' value='2.Ventas'>
        <input type='submit' value='3.Compras'>
        <input type='submit' value='4.Consulta'onclick="window.location.href='examen5.php';">
        <input type='submit' value='5.salir' onclick="window.location.href='examen4.php';">
    </div>
<?php else: ?>
    <div class="content">
        <h2>Iniciar Sesión</h2>
        <form action="examen4.php" method="post">
            <label for="usuario">Usuario:</label><br>
            <input type="text" id="usuario" name="usuario" required><br><br>
            
            <label for="password">Contraseña:</label><br>
            <input type="password" id="password" name="password" required><br><br>
            
            <button type="submit">Acceder</button>
        </form>
    </div>
<?php endif; ?>

</body>
</html>