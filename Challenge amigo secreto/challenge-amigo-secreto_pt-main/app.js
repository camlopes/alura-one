
function adicionarAmigo() {
    let amigo = document.querySelector('input').value;

    if (amigo == '') {
        alert('Por favor, insira um nome.');
    } else {
        amigos.push(amigo);
        limparCampo();
        atualizarListaDeAmigos();
    }
}

function limparCampo() {
    let amigo = document.querySelector('input');
    amigo.value = '';
}

function atualizarListaDeAmigos() {
    let listaAmigos = document.getElementById('listaAmigos');
    listaAmigos.innerHTML = "";

    for (let index = 0; index < amigos.length; index++) {
        let li = document.createElement('li');
        let nomeAmigo = document.createTextNode(amigos[index]);
        li.appendChild(nomeAmigo);
        listaAmigos.appendChild(li);
    }
}

function sortearAmigo() {
    let numeroEscolhido = parseInt(Math.random() * amigos.length);
    let amigoSorteado = amigos[numeroEscolhido];    
    let resultado = document.getElementById('resultado');
    resultado.innerHTML = amigoSorteado;

}


let amigos = [];