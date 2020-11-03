
/* Demanar a l’usuari un número i mostrar per pantalla la taula de multiplicar d’aquest número en format (1 x Numero = Resultat...). 
No cal utilitzar taules HTML per a la presentació de la solució. */

var numero = prompt("Numero a multiplicar");

for (let i = 0; i < 11; i++) {
    
    var resultat = numero * i;
    console.log(i + " x " + numero + " = " + resultat);
    
}