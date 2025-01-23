
//Funcao que tem parametros e sem retorno de informacao
function exibirTextoNaTela(tag, texto) {
    let campo = document.querySelector(tag);
    campo.innerHTML = texto;
}

//Funcao sem parametros mas com retorno de informacao
function gerarNumeroAleatorio() {
    return parseInt(Math.random() * 10 + 1);
} 

//Funcao sem parametro e sem retorno
function verificarChute() {
    let chute = document.querySelector('input').value;

    if (chute == numeroSecreto) {
        exibirTextoNaTela('h1', 'Acertou!');
        exibirTextoNaTela('p', 'Voce descobriu o numero secreto!');
    } else if (chute > numeroSecreto) {
        exibirTextoNaTela('p', 'O numero secreto é menor');
    } else {
        exibirTextoNaTela('p', 'O numero secreto é maior');
    }
}


let numeroSecreto = gerarNumeroAleatorio();

//Chamando a funcao 
exibirTextoNaTela('h1', 'Jogo do numero secreto');
exibirTextoNaTela('p', 'Escolha um numero entre 1 e 10');