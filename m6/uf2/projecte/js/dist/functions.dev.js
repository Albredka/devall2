"use strict";

var movies = [];
$(document).ready(function () {
  var urlMovies = "js/data/movies.json";
  $.ajax({
    async: false,
    url: urlMovies
  }).done(function (data) {
    var moviesData = data.movies;
    var movie;

    for (var i = 0; i < moviesData.length; i++) {
      console.log(moviesData[i].title);
      movies.push([moviesData[i].title, i + 1, moviesData[i].url, moviesData[i].rating]);
    }
  });
  document.getElementById("orderAsc").addEventListener("click", function () {
    //boton de la lista movies asc + printar
    orderList(movies, "asc");
    printList(movies);
  });
  document.getElementById("orderDesc").addEventListener("click", function () {
    //boton de la lista movies dsc + printar
    orderList(movies, "desc");
    printList(movies);
  });
  document.getElementById("calcMitjana").addEventListener("click", function () {
    //calculo de la puntuacion media.
    calcMitjana(movies);
  });
  printList(movies);
}); // Ordenarà les pelicules en ordre ascendent o descendent segons el parametre que rebi.

function orderList(movies, orderType) {
  if (orderType.toLowerCase() == "asc") {
    return movies.sort();
  }

  if (orderType.toLowerCase() == "desc") {
    return movies.reverse();
  }

  return movies;
} // 


function filterLetter(movies, filterLetter) {
  function filterMovie(movie) {
    if (movie[0].toLowerCase() == letter.toLowerCase()) {
      return true;
    }
  }

  return movies.filter(filterMovie);
} // Servirà per poder fer la busqueda de qualsevol pelicula segons el seu index dins l'array de movies. 


function searchList(movies, movie) {
  return movies.indexOf(movie);
} // Creara les plantilles de les linees, les cuals seran tantes com pelicules hi haguin en el movies.json


function printList(movies) {
  var tabla = " <table class=\"tabla\">\n\t<thead>\n\t<tr class=\"columnas\">\n\t\t<th scope=\"col\" class=\"num\">Number</th>\n\t\t<th scope=\"col\" class=\"title\">Title</th>\n\t\t<th scope=\"col\" class=\"image\">Image</th>\n\t\t<th scope=\"col\" class=\"rating\">Rating</th>\n\t</tr>\n\t</thead>\n\t<tbody>";

  for (var i = 0; i < movies.length; i++) {
    tabla += "<tr class=\"lineas\">\n\t\t\t<td class=\"num\">" + movies[i][1] + "</td> \n\t\t\t<td class=\"title\">" + movies[i][0] + "</td>\n\t\t\t<td class=\"image\"><img src=\"" + movies[i][2] + "\"/></td>\n\t\t\t<td class=\"rating\">" + movies[i][3] + "</td>\n\t\t </tr>"; // 1: nombre; 0: titul; 2: imatges; 3: rating
  }

  tabla += "</tbody>\n\t\t\t  </table> ";
  document.getElementById("tabla").innerHTML = tabla; // Etiqueta en laa que es guardara el conjunt de rows
}

function calcMitjana(movies) {
  var total = 0;

  for (var i = 0; i < movies.length; i++) {
    total += movies[i][3]; // Representa el rating
  }

  document.getElementById("mitjana").innerHTML = (total / movies.length).toFixed(2); // Guarda la xifra del calcul de la mitjana en una etiqueta de text
}