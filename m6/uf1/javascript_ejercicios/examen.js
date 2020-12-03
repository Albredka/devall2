/*
Un conegut joc és l’anomenat “Piedra, papel o tijera” en el que dos jugadors trien a cada tirada
quina serà la seva jugada. Segons les regles del joc:
- Piedra aplasta tijera (piedra gana a tijera)
- Tijera corta papel (tijera gana a papel)
- Papel envuelve piedra (papel gana a piedra)
- Empate si los dos jugadores tienen la misma
tirada

Cal que facis un script que demani a l’usuari la seva tirada (piedra, papel o tijera), després
esculli a l’atzar la tirada del PC i validi qui ha guanyat o si ha resultat empat.
Quan acabi el joc, caldrà presentar a l’usuari una nova pregunta: “Vols tornar a jugar?” Si diu
que si, tornarem a jugar, si diu que no, el joc finalitzarà i mostrarem els resultats. Un exemple
per veure el format del que es demana seria:

Partides totals jugades: 10
Partides guanyades per la màquina: 4 (40%)
Partides guanyades per l’usuari: 3 (30%)
Partides empatades: 3 (30 %)
*/

function ejercicio3(){
    var partides = 0;
    var empat = 0;
    var usuari = 0;
    var maquina = 0;

    while(true){
        var num = 0;
        partides += 1;


        var pc = Math.floor(Math.random() * 3) + 1;
        console.log("Numero pc: " + pc);
        var jugada = prompt("Introdueix la teva jugada");
        jugada = jugada.toLowerCase();
        if (jugada == "pedra"){
            num = 1;

        } else if(jugada == "paper"){
            num = 2;

        } else if(jugada == "tisora"){
            num = 3;
        }

        console.log("Numero usuario: " + num);

        if(num==pc){
            empat += 1;
            console.log("empat");
            continue;
        } else if((num==1 && pc == 3) || (num==3 && pc == 2) || (num==2 && pc==1)){
            console.log("usuari");
            usuari += 1;
            var tornar = prompt("Vols tornar a jugar? ");
            if(tornar.toLowerCase()=="si"){
                continue;
            } else{
                break;
            }
        } else {
            console.log("maquina");
            maquina += 1;
            var tornar = prompt("Vols tornar a jugar? ");
            if(tornar.toLowerCase()=="si"){
                continue;
            } else{
                break;
            }
            
        }
    }
    var maquina_per = Math.round( (maquina / partides) * 100); 
    var usuari_per = Math.round( (usuari /  partides) * 100); 
    var empat_per = Math.round( (empat / partides) * 100); 


    console.log("Partides totals jugades: " + partides);
    console.log("Partides guanyades per la màquina: " + maquina + " (" + maquina_per + "%)");
    console.log("Partides guanyades per l’usuari: " + usuari + " (" + usuari_per + "%)");
    console.log("Partides empatades: " + empat + " (" + empat_per + "%)");

}

function ejercicio2(){
    var input = prompt("Introdueix un text o un numero: ");
    input = input.toLowerCase();
    input = input.replace(/\s/g, "");
    let array = input.split("");
    let reverse = array.reverse();

    return input == reverse.join("") ? "Si es un palindromo" : "No es un palindromo";
}


function ejercicio1(){

    /* Demana els 2 anys */
    var any1 = prompt("primer any: ");
    var any2 = prompt("segon any: ");
 
    for(let i = any1; i < any2+1; i++){
        var data=new Date ("1/1/"+i);
        var dia = data.getDay();
        if(dia == 3){
            
        break;
        }

    }
    console.log("El dia " + data.getDate() + " de "
     + data.getMonth()+1 + " del " + data.getFullYear() + " va ser un dimecres");
}

console.log(ejercicio3());



