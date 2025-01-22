//Seleciona o h1 no html e muda seu conteudo
let titulo = document.querySelector('h1');
titulo.innerHTML = 'Jogo do numero secreto';

let paragrafo = document.querySelector('p');
paragrafo.innerHTML = 'Escolha um numero entre 1 e 10';

function verificarChute() {
    console.log('o botao foi clicado');
}

