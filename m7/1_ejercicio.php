

<?php
//Crea una pàgina que rebi un número per paràmetre i mostri un missatge indicant si el número és parell o senar.

    $num = $_GET["numero"];

    if($num % 2 == 1){
        $missatge = "senar";
    } else {
        $missatge = "parell";
    }

    echo "el numero " . $num . " es " . $missatge;
?>