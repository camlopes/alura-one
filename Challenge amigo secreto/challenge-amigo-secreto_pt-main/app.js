
function adicionarAmigo() {
    let amigo = document.querySelector('input').value;

    if (amigo == '') {
        alert('Por favor, insira um nome.');
    } else {
        amigos.push(amigo);
        let id = document.getElementById('amigo');
        id.value = "";
        atualizarListaDeAmigos();
    }
}

function limparAListaDeAmigos() {
    let listaAmigos = document.getElementById('listaAmigos');
    listaAmigos.innerHTML = "";
}

function atualizarListaDeAmigos() {
    limparAListaDeAmigos();

    for (let index = 0; index < amigos.length; index++) {
        let li = document.createElement('li');
        let nomeAmigo = document.createTextNode(amigos[index]);
        li.appendChild(nomeAmigo);
        listaAmigos.appendChild(li);
    }
}

function sortearAmigo() {
    if (amigos == '') {
        alert('Por favor, insira um nome para sortear.');
    } else {
        let numeroEscolhido = Math.floor(Math.random() * amigos.length);
        let amigoSorteado = amigos[numeroEscolhido];
        let resultado = document.getElementById('resultado');
        limparAListaDeAmigos();
        resultado.innerHTML = `O amigo secreto sorteado é: ${amigoSorteado}`;
    }
}


let amigos = [];