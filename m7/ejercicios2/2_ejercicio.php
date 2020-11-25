
<?php
    // Crea una pàgina que rebi un text i un caràcter. Cal que el programa mostri el nombre de vegades que el caràcter apareix al text.No es pot utilitzar la funció strpos ni strrpos.

    $text = $_GET["text"];
    $chr = $_GET["chr"];
    $vegades = 0;

    for($i=0; $i<strlen($text); $i++){

       if (substr($text, $i, 1) == $chr){
           $vegades++;
       }
    }

    echo $vegades;

?>