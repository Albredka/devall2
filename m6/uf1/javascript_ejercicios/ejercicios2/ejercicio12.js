
/*
Obtenir la data actual del sistema. A continuació mostrar per pantalla: aquesta data en format llarg (Ex: Avui és DD de MM de YYYY), el nombre de setmanes que han passat de l’any, el percentatge de dies transcorreguts de l’any, el nombre de dies que resten d’any. Obtenir la hora actual del sistema i mostrar el mateix respecte al dia actual: Ara són les: HH:MM:SS, el percentatge de dia que ha transcorregut i el que queda. Representeu el percentatge d’any i de dia transcorregut i que queda amb xifres (Ex. 46.5%).
*/

function dateTimeCalc(){

    var now = new Date();
    console.log("Avui és "+now.getDate()+" del "+(now.getMonth()+1)+" de "+now.getFullYear());

    document.write("Avui és "+now.getDate()+" del "+(now.getMonth()+1)+" de "+now.getFullYear());

    console.log("----------------------");
    var oneDayMilis = 24 * 60 * 60 * 1000; // One day in miliseconds
    var end2019 = new Date(2019, 12, 31);

    console.log(Math.round((now - end2019)));
    var daysIn2020 = Math.round((now - end2019) / oneDayMilis);
    console.log("daysIn2020 = "+ daysIn2020);
    var weeksIn2020 = Math.round(daysIn2020 / 7);
    var perc2020 = daysIn2020 * 100 / 365;

    var yesterday = now - oneDayMilis;
    var milisInDay = ((now.getHours()*60 + now.getMinutes())*60 + now.getSeconds())*1000;
    var percDay = milisInDay * 100 / oneDayMilis;
    
    document.write("<br>Nombre de setmanas que han passat de l'any = "+weeksIn2020);
    document.write("<br>Percentatge de dies transcorreguts de l’any = "+perc2020.toFixed(2)+"%");
    document.write("<br>Nombre de dies que resten d’any = "+ (365 - daysIn2020));
    document.write("<br>Ara són les "+now.getHours()+":"+now.getMinutes()+":"+now.getSeconds());
    document.write("<br>Percentatge de dia transcorregut = "+percDay.toFixed(2)+"%");
    document.write("<br>Nombre de milisegons que resten del dia = "+ (oneDayMilis - milisInDay));

}

