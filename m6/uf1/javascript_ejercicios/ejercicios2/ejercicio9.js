/*
Demanar a l’usuari 2 números que representaran 2 anys (per exemple, 2000 i 2050). Buscar el primer any d’aquest rang que el dia 1 de gener sigui dimecres o si no n’hi ha cap, indicar-ho.

Expressa el resultat de la següent manera “El dia D de M del YYYY va ser un dimecres”
Pista: Date(), getDay(), getMonth(), getFullYear()
*/

var any1 = prompt("primer any: ");
var any2 = prompt("segon any: ");

for(let i = any1; i < any2+1; i++){
    data=new Date ("1/1/"+i);
    var dia = data.getDay();
    if(dia == 3){
        console.log(data);
        break;
    }

}
