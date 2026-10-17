<?php
echo "<html>";
echo "<head></head>";
echo "<body>";
function Quicksort(array $array): array
{
    if (count($array) < 2) {
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
function transformar($num1, $num2, $num3, $num4)
{
    $array = [$num1, $num2, $num3, $num4];
    $array = Quicksort($array);
    for ($i = 0; $i < count($array); $i++) {
        echo "$array[$i], ";
    }
}

transformar(5, 9, 8, 1);

echo "</body>";
echo "</html>";
?>