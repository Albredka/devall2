<?php

    // Crea  una  pàgina  que  rebi  tres  números  per  paràmetre corresponents cadascun a una hora, un minut i un segon. Mostrar la hora corresponent a un segon més tard a la introduïda

    $hora = $_GET["num1"];
    $minut = $_GET["num2"];
    $segon = $_GET["num3"];



    if($segon == 59 && $minut == 59){
        if($hora == 23){
            $hora = 0;
        }else{
            $hora += 1;
        }
        
        $minut = 0;
        $segon = 0;

    } else if($segon == 59){
        $minut += 1;
        $segon = 0;
    }

    if($segon > 59 | $minut > 59 | $hora > 23){
        $segon = 0;
        $minut = 0;
        $hora = 0;
    }

    echo "la hora es: " . $hora . ":" . $minut . ":" . "$segon";
?>