<?php

    // Crea una pàgina que rebi un número que representarà una data en format DDMMYYYY. Cal que mostris el dia, el mes i l'any.

    $x1 = $_GET["num"];
    $dia = substr($x1, 0,2);
    $mes = substr($x1, 2,2);
    $any = substr($x1, 4,4);

    echo "el dia es: " . $dia;
    echo "el dia es: " . $mes;
    echo "el dia es: " . $any;
?>