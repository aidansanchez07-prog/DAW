<?php
echo "<html>";
echo "<head></head>";
echo "<body>";
$matriz = [
    [1 , 14, 8, 3],
    [6, 19, 7, 2],
    [3, 13, 4, 1]
];
    for ($i = 0; $i < 3; $i++) {
        echo "(";
        for ($j = 0; $j < 4; $j++) {
            echo $matriz[$i][$j] . " ";
        }
        echo ")";
        echo "<br>";
    }
echo "</body>";
echo "</html>";
?>