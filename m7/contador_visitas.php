<?php
    if (isset($_COOKIE["sesion"])){
        $contador=$_COOKIE["sesion"];
        $contador++;
        setcookie("sesion", $contador, time()+ (365*24*60*60));
    }else { //si no esta creada
        echo "Crea coockie que cuenta las visitas";
        setcookie("sesion", 1, time()+ (365*24*60*60));
    }

    echo "contador de visitas: " . $_COOKIE["sesion"];
?>