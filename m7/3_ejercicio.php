<?php

    //Crea una pàgina que rebi dos números per paràmetre i mostrar quin és el mésproper a 100.

    $x1 = intval($_GET["numero1"]);
    $x2 = intval($_GET["numero2"]);
    $ref = 100;

    $value = abs(100 - $x1 ) > abs(100 - $x2) ? $x2 : $x1;

    echo($value);
?>