
<?php

    /* Com ja sabràs, els rellotges canvien la seva hora un parell de vegades l’any per tal defacilitar l’estalvi d’energia. Des de l’any 2000, els països de la unió europea fan aquestcanvi horari l’últim diumenge de març (en que s’avança i a les 2:00 passen a ser les3:00) i d’octubre (en que s’endarrereix i a les 3:00 passen a ser les 2:00). Crea unprograma que mostri quan de temps queda per al proper canvi horari. Lasortida hauria de ser del tipus: Resten X mesos, X dies, X hores, X minuts, X segons peral proper canvi horari.
    */

    $now = new DateTime('now');
    $now_str= $now->format("m-w-Y");

    $dia_str = 6 - intval(substr($now_str, 3, 1))+1;
    $mes_str = intval(substr($now_str, 0, 2));
    
    $sunday_date= $now->add(new DateInterval("P".$dia_str."D"));

    while(true){

        $sunday_date = $sunday_date->add(new DateInterval("P7D"));
        
        $sunday_str = $sunday_date->format("m-w-Y");
        $mes_sunday = intval(substr($sunday_str, 0, 2));
        
        if($mes_sunday==5){
            break;
        }
    }
    //var_dump($sunday_date);
    echo "----------------";
    $sunday_date = $sunday_date->sub(new DateInterval("P7D"));
    //var_dump($sunday_date);
    $diff = date_diff($now, $sunday_date);
    var_dump($diff);
    
?>