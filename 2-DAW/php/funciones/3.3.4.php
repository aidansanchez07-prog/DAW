<?php
echo"<html>";
echo "<head></head>";
echo "<body>";
function Truncar(float $numero): int
{
    return (int) $numero; 
}
echo "Truncar 3.7: " . Truncar(3.7) . "<br>";
echo "Truncar -2.9: " . Truncar(-2.9) . "<br>";
echo "</body>";
echo "</html>";

?>