
/* Demanar a l’usuari 2 números i mostrar quin és el més proper a 100. */

var numero1 = parseInt(prompt());
var numero2 = parseInt(prompt());

function p100(num1, num2){
    
    var resultat = 0;

    num1 = (num1 - 100) < 0 ? (num1 - 100) * -1 : num1 - 100;
    num2 = (num2 - 100) < 0 ? (num2 - 100) * -1 : num2 - 100;
    
    // num2 = (num2 - 100) < 0 ?  num1 * -1 : num2;
    // num2 = (num2 - 100) < 0 ? num2 * -1 : num2;

    resultat = num1 < num2 ? numero1 : numero2;
    return resultat;

}

console.log(p100(numero1, numero2));
