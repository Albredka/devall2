
<?php

// Demanar  a  l’usuari  dos  números.  El  primer  representarà  el  preu  d’un producte. El segon la quantitat de diners lliurada per un client per pagar el producte. Cal que per pantalla aparegui l’import a retornar i com retornar-lo emprant el mínim nombre de bitllets i monedes

$billets_500 = 0;
$billets_100 = 0;
$billets_50 = 0;
$billets_20 = 0;
$billets_10 = 0;
$billets_5 = 0;
$monedas_2 = 0;
$monedas_1 = 0;
$monedas_0_50 = 0;
$monedas_0_20 = 0;
$monedas_0_10 = 0;
$monedas_0_05 = 0;
$monedas_0_02 = 0;
$monedas_0_01 = 0;

$preu = $_GET["preu"];
$donat = $_GET["donat"];

$sobrant = $donat - $preu;



if($sobrant >= 500){
    $billets_500 = floor($sobrant / 500);
    $sobrant -= (500*$billets_500);

} if($sobrant >= 100){
    $billets_100 = floor($sobrant / 100);
    $sobrant -= (100*$billets_100);

} if($sobrant >= 50){
    $billets_50 = floor($sobrant / 50);    
    $sobrant -= (50*$billets_50);

} if($sobrant >= 10){
    $billets_10 = floor($sobrant / 10);    
    $sobrant -= (10*$billets_10);

} if($sobrant >= 5){
    $billets_5 = floor($sobrant / 5);
    $sobrant -= (5*$billets_5);

} if($sobrant >= 2){
    $monedas_2 = floor($sobrant / 2);
    $sobrant -= (2*$monedas_2);

} if($sobrant >= 1){
    $monedas_1 = floor($sobrant / 1);   
    $sobrant -= (100*$monedas_1);

} if($sobrant >= 0.50){
    $monedas_0_50 = floor($sobrant / 0.50);
    $sobrant -= (0.50*$monedas_0_50);

} if($sobrant >= 0.20){
    $monedas_0_20 = floor($sobrant / 0.20);
    $sobrant -= (0.20*$monedas_0_20);

} if($sobrant >= 0.10){
    $monedas_0_10 = floor($sobrant / 0.10);
    $sobrant -= (0.10*$monedas_0_10);

} if($sobrant >= 0.05){
    $monedas_0_05 = floor($sobrant / 0.05);
    $sobrant -= (0.05*$monedas_0_05);

} if($sobrant >= 0.02){
    $monedas_0_02 = floor($sobrant / 0.02);
    $sobrant -= (0.02*$monedas_0_02);
} if($sobrant >= 0.01){
    $monedas_0_01 = floor($sobrant / 0.01);
    $sobrant -= (0.01*$monedas_0_01);
}

echo $billets_500 . '<br/>';
echo $billets_100 . '<br/>';
echo $billets_50 . '<br/>';
echo $billets_20 . '<br/>';
echo $billets_10 . '<br/>';
echo $billets_5 . '<br/>';
echo $monedas_2 . '<br/>';
echo $monedas_1 . '<br/>';
echo $monedas_0_50 . '<br/>';
echo $monedas_0_20 . '<br/>';
echo $monedas_0_10 . '<br/>';
echo $monedas_0_05 . '<br/>';
echo $monedas_0_02 . '<br/>';
echo $monedas_0_01 . '<br/>';


?>