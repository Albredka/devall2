
<?php
    // Crea una pàgina que rebiun text. Mostrar si al text hi ha el mateix nombre de lletres “a” que de “b”.

    $text = $_GET["text"];
    $contador_a = 0;
    $contador_b = 0;
    
        
    for($i=0; $i<strlen($text); $i++){
        if($text[$i]=="a"){
            $contador_a++;
        } else if($text[$i]=="b"){
            $contador_b++;
        }
    }
   if($contador_a==$contador_b){
       echo "hay las mismas";
   } else{
       echo "no hay las mismas";
   }
    
?>