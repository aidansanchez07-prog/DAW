<?php

echo "<html>";
echo "<head></head>";
echo "<body>";
?>
<div class="content">
    <h2>Iniciar Sesión</h2>
    <form action="examen5.2.php" method="post">
        <label for="nombre">Nombre:</label><br>
        <input type="text" id="nombre" name="nombre" required><br><br>

        <label for="direccion">Dirección:</label><br>
        <input type="text" id="direccion" name="direccion" required><br><br>

        <label for="email">Email:</label><br>
        <input type="email" id="email" name="email" required><br><br>

        <label for="provincia">Provincia:</label><br>
        <input type="text" id="provincia" name="provincia" required><br><br>

        <label for="telefono">Teléfono:</label><br>
        <input type="number" id="telefono" name="telefono"><br><br>

        <label for="pais">País:</label><br>
        <select id="pais" name="pais" required>
            <option value="">Seleccionar</option>
            <option value="España">España</option>
            <option value="Portugal">Portugal</option>
            <option value="Francia">Francia</option>
            <option value="Italia">Italia</option>
        </select>
        <br><br>
        <button type="submit">Acceder</button>
    </form>
     <input type='submit' value='Limpiar' onclick="window.location.href='examen5.php';">
</div>
<?php
echo "</body>";
echo "</html>";
?>