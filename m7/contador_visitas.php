<?php
    $contador = 0;
    if (isset($_COOKIE["sesion"])){
        echo $_COOKIE[sesion];
        $contador++;
        setcookie("sesion", $contador, time()+ (365*24*60*60));
    }else {
        echo "Crea coockie que cuenta las visitas";
        setcookie("sesion", "$contador+1", time()+ (365*24*60*60));
        echo $_COOKIE["sesion"];
    }
?>