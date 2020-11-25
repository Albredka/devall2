

<?php

    // Crea una pàgina que rebi un número per paràmetre i mostriper pantalla la taula de multiplicar d’aquest número en format (1 x Numero = Resultat...). No cal utilitzar taules HTML per a la presentació de la solució.

    $x1 = $_GET["num"];

    for ($i=0; $i<11; $i++){
        echo($x1 . " x " . $i . " = " . $x1*$i);
        echo '<br/>';
    }

?>
