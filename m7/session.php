<?php

session_start();
$usu = $_POST["usuario"];
$pwd = $_POST["pwd"];

if($usu==$pwd and strlen($usu)>0){
    $_SESSION["correcto"]=true;
    $_SESSION["usuario"]=$usu;
}
else{
    $_SESSION["correcto"]=false;
}

/* if(isset($_SESSION["correcto"])){
    if($_SESSION["correcto"]){
        echo $_SESSION["usu"];
    }
    else{
        echo "No identificado";
    }
}
else{
    echo "No identificado";
}
*/

?>