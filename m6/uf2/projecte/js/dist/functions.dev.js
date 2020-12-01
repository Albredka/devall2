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
    // ASC button + print
    orderList(movies, "asc");
    printList(movies);
  });
  document.getElementById("orderDesc").addEventListener("click", function () {
    // DESC button + print
    orderList(movies, "desc");
    printList(movies);
  });
  document.getElementById("average").addEventListener("click", function () {
    // Average rating button .
    average(movies);
  });
  var reload = document.getElementById('reload');
  reload.addEventListener('click', function (_) {
    // the underscore means there any parameters.
    location.reload();
  });
  printList(movies);
}); // -------------------- Functions -------------------- 
// Ordenarà les pelicules en ordre ascendent o descendent segons el parametre que rebi.

function orderList(movies, orderType) {
  if (orderType.toLowerCase() == "asc") {
    alert("asc");
    return movies.sort();
  }

  if (orderType.toLowerCase() == "desc") {
    alert("desc");
    return movies.reverse();
  }
}

function filterLetter(movies, filterLetter) {
  function filterMovie(movie, filterLetter) {
    var title = movie[0];

    if (title[0].toLowerCase() === filterLetter.toLowerCase()) {
      return true;
    }
  }

  return movies.filter(filterMovie);
} // It will search for each movie on the array movies with the parameter {movie}.


function searchList(movies, movie) {
  return movies.indexOf(movie);
} // This function will create all the html tags and theyre respective classes to form de table and every row for each movie.


function printList(movies) {
  var tabla = " <table class=\"tabla\">\n\t<thead>\n\t<tr class=\"columns\">\n\t\t<th scope=\"col\" class=\"num\">Number</th>\n\t\t<th scope=\"col\" class=\"title\">Title</th>\n\t\t<th scope=\"col\" class=\"image\">Image</th>\n\t\t<th scope=\"col\" class=\"rating\">Rating</th>\n\t</tr>\n\t</thead>\n\t<tbody>";

  for (var i = 0; i < movies.length; i++) {
    tabla += "<tr class=\"lineas\">\n\t\t\t<td class=\"num\">" + movies[i][1] + "</td> \n\t\t\t<td class=\"title\">" + movies[i][0] + "</td>\n\t\t\t<td class=\"image\"><img src=\"" + movies[i][2] + "\"/></td>\n\t\t\t<td class=\"rating\">" + movies[i][3] + "</td>\n\t\t </tr>"; // 1: name; 0: title; 2: images; 3: rating
  }

  tabla += "</tbody>\n\t\t\t  </table> ";
  document.getElementById("tabla").innerHTML = tabla; // const that will save the all the tags created below.
}

function average(movies) {
  var total = 0;

  for (var i = 0; i < movies.length; i++) {
    total += movies[i][3]; // Rating
  }

  document.getElementById("average").innerHTML = (total / movies.length).toFixed(2); // Contains the average of the movies rating.
}