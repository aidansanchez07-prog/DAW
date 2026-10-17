<?php
echo"<html>";
echo "<head></head>";
echo "<body>";
$array = [];
for ($i = 0; $i < 100; $i++) {
$array[$i] = rand(1, 100);
}
echo "<h1>Valores aleatorios</h1><br>";
for ($i = 0; $i < 100; $i++) {
echo "$array[$i], ";
}
echo "<h1>Valores Ordenados</h1>";
function Quicksort(array $array): array
{
    if (count($array)<2) {
        return $array;
    }
    $pivote = $array[0];
    $menores = [];
    $mayores = [];
    for ($i = 1; $i < count($array); $i++) {
        if ($array[$i] < $pivote) {
            $menores[] = $array[$i];
        } else {
            $mayores[] = $array[$i];
        }
    }
    return array_merge(Quicksort($menores), [$pivote], Quicksort($mayores));
}
$array = Quicksort($array);
for ($i = 0; $i < 100; $i++) {
    echo "$array[$i], ";
}
echo "</body>";
echo "</html>";
?>