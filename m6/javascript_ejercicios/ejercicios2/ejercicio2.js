
/* Demanar a l’usuari un text. Mostrar si al text hi ha el mateix nombre de lletres “a” que de “b”. */

var text = prompt("Introdueix un text: ");

for (let i = 0; i < text.length; i++) {
    
    var a = 0;
    var b = 0;
    var lletra = text.charAt(i);
    console.log(lletra);

    if (lletra == "a"){
        a += 1;
    } else if (lletra == "b") {
        b += 1;
    } else {
        continue;
    }
    
}

console.log(a);
console.log(b);