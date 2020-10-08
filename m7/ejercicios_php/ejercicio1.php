
<?php

    $num1 = $_GET["param1"];
    $num2 = $_GET["param2"];

    abs($num1-= 100);
    abs($num2 -= 100);

    $resultat = $num1<$num2 ? $num1 : $num2; 

    echo "El numero más cercano a 100 es: " . $resultat;

?>