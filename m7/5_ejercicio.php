<?php

//Crea una pàgina que rebi dos números per paràmetre i mostri el resultat de les següents operacions: La divisió real, la divisió real acotada a dos decimals, la divisió sencera i el residu de la divisió

$x1 = $_GET["num1"];
$x2 = $_GET["num2"];
    
echo "divisió real: " . $x1 / $x2;
echo "divisió real acotada: " . round($x1 / $x2, 2);
echo "divisió sencera: " . floor($x1 / $x2);
echo "residu de la divisió: " . $x1 % $x2;
?>