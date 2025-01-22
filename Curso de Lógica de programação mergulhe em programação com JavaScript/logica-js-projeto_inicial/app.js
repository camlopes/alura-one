alert('Boas vindas ao jogo do numero secreto'); 

/**Variavel numeroSecreto usada para armazenar um valor */
let numeroMaximo = 10;
let numeroSecreto = parseInt(Math.random() * numeroMaximo + 1);
console.log(`o numero secreto é ${numeroSecreto}`);
let chute;
let tentativas = 1;

while (chute != numeroSecreto) {
    chute = prompt(`Escolha um numero entre 1 e ${numeroMaximo}`);
    if (chute == numeroSecreto) {
        //Foi colocado o break para não colocar o if dentro de outro if
        break;
    } else {
        if (chute > numeroSecreto) {
            alert(`O numero secreto é menor que ${chute}`);
        } else {
            alert(`O numero secreto é maior que ${chute}`);
        }
        tentativas++;
    }
} 

//Operador ternario
let palavraTentativa = tentativas > 1 ? 'tentativas' : 'tentativa';
alert(`Voce descobriu o numero secreto ${numeroSecreto} com ${tentativas} ${palavraTentativa}.`);

// O operador ternario acima é o equivalente ao codigo abaixo
// if (tentativas > 1) {
//     alert(`Voce descobriu o numero secreto ${numeroSecreto} com ${tentativas} tentativas`);
// } else {
//     alert(`Voce descobriu o numero secreto ${numeroSecreto} com ${tentativas} tentativa`);
// }

