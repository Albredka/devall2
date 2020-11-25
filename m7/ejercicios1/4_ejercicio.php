<?php

    //Un mag ens ha dit “Pensa’t un numero. Multiplica’l per dos. Suma-li 34. Divideix-lo per dos. Treu-li el número que havies pensat. Te’n queden 17!” . Crea una pàgina per tal de mostrar si és cert.

    $num = $_GET["num"];

    $num = (($num * 2) + 34) / 2 - $num;
    
    $missatge = $num == 17 ? "cert" : "fals";

    echo $missatge;
?>