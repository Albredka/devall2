
<?php

    // Calcular els primers 50números de la sèrie de Fibonacci, tenint presentque a1=1, a2=1 y que an=an-1+an-2.

    $num1 = 1;
    $num2 = 0;
    $swap = 0;

    for($i=0; $i<51; $i++){
        $swap = $num1 + $num2;
        $num1 = $num2;
        $num2 = $swap;
        
        echo $swap;
        echo '<br/>';

    }

?>