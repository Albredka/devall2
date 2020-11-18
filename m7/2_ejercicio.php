
<?php

/* Crea una pàgina que rebi un número per paràmetre que indicarà un nombre de dies. Mostrar per pantalla la conversió d’aquest número a anys, mesos i dies(no cal tenir presents els anys de traspàs).Podeu suposar que tots els mesos tenen 30 dies. */

$num = $_GET["numero"];
$anys;
$mesos;
$dies;

$anys = floor($num / 365);
$num = $num % 365;

if($num >= 30){
    $mesos = floor($num / 30);
    $num = $num % 30;
    echo $num;
}

$dies = $num;
echo $anys . "/" . $mesos . "/" . $dies;

?>