
/* Demanar a l’usuari 3 números corresponents cadascun a una hora, un minut i un segon. Mostrar la hora corresponent a un segon més tard a la introduïda. */

var numero1 = "0";
var numero2 = "0";
var numero3 = "0";


while(numero1.length != 2 || (numero1 > 24 || numero1 < 1)) {
    numero1 = prompt("numero 1: ");
    
}
while(numero2.length != 2 || (numero2 > 59 && numero2 < 0)) {
    numero2 = prompt("numero 2: ");
    
}
while(numero3.length != 2 || (numero3 > 59 && numero3 < 0)) {
    numero3 = prompt("numero 3: ");
    
}


function restaSegon(hora, min, segon){
    var resultat = "";

    parseInt(hora, min, segon)
    if (segon == 0){
        if (min == 0){
            hora -= 1;
            min = 59;
            segon = 59;
        } else {
            min -= 1;
            segon = 59;
        }
        
    } else {
        segon -= 1;
    }

    var resultat = hora + ":" + min + ":" + segon;
    return resultat;
}

console.log(restaSegon(numero1, numero2, numero3));


