
/* Demanar 3 números a l’usuari i validar que es corresponen a una data vàlida */

var numero1 = prompt("Introdueix any: ");
var numero2 = prompt("Introdueix mes: ");
var numero3 = prompt("Introdueix dia: ");



function isLeap(year){

    var isLeap = false;
    if (year % 4 == 0){
        isLeap = true;
        if (year % 100 == 0){
            isLeap = false;
            if (year % 400 == 0){
                isLeap = true;
            }
        }
    }
    return isLeap;
}

function comprovaData(any, mes, dia){
    if (isNaN(any)){
        return "data no valida";
    } else if(any < 0) {
        return "data no valida";
    }

    if (isNaN(mes)){
        return "data no valida";
    } else if(mes < 1 || mes > 12) {
        return "data no valida";
    }

    if (isNaN(dia)){
        return "data no valida";
    } else if (day < 1 || day > 31){
        return "data no valida";
    }
}

