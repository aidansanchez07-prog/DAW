<?php
echo "<html>";
echo "<head></head>";
echo "<body>";
echo "Orden<br>";
$a = 45;
$b = 55;
$c = 22;
if ($a <= $b && $b <= $c) {
    echo "Las variables $a, $b y $c en orden son: $a, $b, $c.<br>";
} elseif ($a <= $c && $c <= $b) {
    echo "Las variables $a, $b y $c en orden son: $a, $c, $b.<br>";
} elseif ($b <= $a && $a <= $c) {
    echo "Las variables $a, $b y $c en orden son: $b, $a, $c.<br>";
} elseif ($b <= $c && $c <= $a) {
    echo "Las variables $a, $b y $c en orden son: $b, $c, $a.<br>";
} elseif ($c <= $a && $a <= $b) {
    echo "Las variables $a, $b y $c en orden son: $c, $a, $b.<br>";
} else {
    echo "Las variables $a, $b y $c en orden son: $c, $b, $a.<br>";
}
echo "</body>";
echo "</html>";
?>