
const board = document.querySelector(".board");
const boardLetters = document.querySelector(".letters");
const boardNumbers = document.querySelector(".numbers");
let letters = ["A", "B", "C", "D", "E", "F", "G", "H"];
let index = 0;
let subind = 0;
let black = false;
let num = 1;

let blackPieces = ["\u265C", "\u265E", "\u265D", "\u265B", "\u265A", "\u265F"];
let whitePieces = ["\u2656", "\u2658", "\u2657", "\u2654", "\u2655", "\u2659"];

/* Creates the letters and numbers of the board */
for (let i = 0; i < 8; i++) {
    
    let letter = document.createElement("li");
    letter.textContent = letters[i];
    boardLetters.appendChild(letter);

    let numbers = document.createElement("li");
    numbers.textContent= num++;
    boardNumbers.appendChild(numbers);
}

/* This for is to colorize de board */

for (let i = 0; i < 64; i++) {
    const square = document.createElement("div");
    if(black){
        square.classList.add("square");
        square.classList.add("black");
        index++
        black = !black;
    
    } else {
        square.classList.add("square");
        square.classList.add("white");
        index++
        black = !black;
    }

    /* Black UNI pieces */
    // Usar subinf para recorrer (la segunda en reverse)
    if(i < 16){
        const piece = document.createElement("span");
        if(i > 4 && i < 8){
            let numControl = 3;
            piece.textContent = blackPieces[i-numControl];
            numControl += 2;
        } else if (i > 7){
            piece.textContent = blackPieces[5];
        }  else {
            piece.textContent = blackPieces[i];
        }
        square.classList.add("piece");
        square.appendChild(piece);
    }

    /* White UNI pieces */
    // Usar subinf para recorrer (la segunda en reverse)
    if(i > 47){
        
        const piece = document.createElement("span");
        if(i > 47 && i < 56){
            piece.textContent = whitePieces[5];
            
        } else if (i > 60){
            subind = subind === 5 ? 2 : subind;
            piece.textContent = whitePieces[subind];
            subind--;
        }  else {

            piece.textContent = whitePieces[subind];
            subind++;
        }  
        
        square.classList.add("piece");
        square.appendChild(piece);
    }

    board.appendChild(square);
    
    if (index === 8){
        black =!black;
        index = 0;
    }
 }
    
