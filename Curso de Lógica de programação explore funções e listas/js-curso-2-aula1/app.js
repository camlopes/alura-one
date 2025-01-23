
let numeroSecreto = gerarNumeroAleatorio();

//Funcao que tem parametros e sem retorno de informacao
function exibirTextoNaTela(tag, texto) {
    let campo = document.querySelector(tag);
    campo.innerHTML = texto;
}

//Chamando a funcao 
exibirTextoNaTela('h1', 'Jogo do numero secreto');
exibirTextoNaTela('p', 'Escolha um numero entre 1 e 10');

//Funcao sem parametro e sem retorno
function verificarChute() {
    let chute = document.querySelector('input').value;
    console.log(chute == numeroSecreto);
}

//Funcao sem parametros mas com retorno de informacao
function gerarNumeroAleatorio() {
    return parseInt(Math.random() * 10 + 1);
} 

