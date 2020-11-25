
<?php

    $cadastral = "9072023 VH5797S 0001 WX";
    $inicial = 65;
    $array_chr = array();
    $array_num = array(13, 15, 12, 5, 4, 17, 9, 21, 3, 7, 1);
    $array_num2 = array(13, 15, 12, 5, 4, 17, 9, 21, 3, 7, 1);
    $arrayLetter = ['M', 'Q','W','E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P', 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'B', 'Z', 'X'];
    $letra1;
    $letra2;
    $total1 = 0;
    $total2 = 0;
    
    $cadena1 = substr($cadastral, 0, 7) . substr($cadastral, 16, 4);
   
    $cadena2 = substr($cadastral, 8, 7) . substr($cadastral, 16, 4);
    $cadena2_nueva = "";
    // var_dump($cadena2_array);
    // echo $cadena2;

    for($i=1; $i<28; $i++){
        if($i == 15){
            $array_chr['Ñ'] = $i;
            continue;
        }
        $array_chr[chr($inicial)] = $i;
        $inicial++;
        }

    for($i=0; $i<strlen($cadena2); $i++){
        $chr = $cadena2[$i];
        //echo $chr . '<br>';
        if($chr == "0"){
            
            $cadena2_nueva = $cadena2_nueva . $chr;
            $array_num2[$i] *= $chr;
            echo '<br>';
            $array_num[$i] *= $cadena1[$i];
            
            continue;
        }
        else if(in_array($chr, $array_chr, false)){
            $cadena2_nueva = $cadena2_nueva . $chr;
            $array_num2[$i] *= $chr;
            echo '<br>';
            $array_num[$i] *= $cadena1[$i];
            
            continue;

        } 
        else {
            $valor = $array_chr[$chr];
            $cadena2_nueva = $cadena2_nueva . $valor;
            echo $array_num2[$i];
            echo '<br>';
            $array_num2[$i] += $valor * $array_num2[$i];
            echo '<br>';
            echo $array_num2[$i];
            $array_num[$i] += $cadena1[$i] * $array_num[$i];
        }

    }

    for($i=0; $i<count($array_num); $i++){
        $total1 += $array_num[$i];
        $total2 += $array_num[$i];

    }


    $total1_modul = $total1 % 23;
    $total2_modul = $total2 % 23;

    echo $total1;
    echo $total2;
    
    var_dump($array_num);
    var_dump($array_num2);

    $letra1=$arrayLetter[$total1_modul];
    $letra2=$arrayLetter[$total2_modul];
    echo '<br>';
    echo '<br>';
    echo $letra1;
    echo '<br>';
    echo $letra2;

?>