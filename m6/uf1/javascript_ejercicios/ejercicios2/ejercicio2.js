
/* Demanar a l’usuari un text. Mostrar si al text hi ha el mateix nombre de lletres “a” que de “b”. */

function AB(){
    var text = prompt("Introdueix un text: ");

    var a = 0;
    var b = 0;

    for (let i = 0; i < text.length; i++) {
    
        var ch = text.charAt(i);
    
        if (ch == "a"){
            a += 1;
        } else if (ch == "b") {
            b += 1;
        } else {
            continue;
        }
    }
}

console.log(a);
console.log(b);