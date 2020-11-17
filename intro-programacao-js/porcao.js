// Entrada
// A entrada consiste de 5 inteiros cada um representando as porções que os convidados de dona Chica vão consumir. O primeiro inteiro representa as porções do Chico, o segundo do Bento, o terceiro do Bernardo, o quarto da Marina e o quinto a da Iara.

// Saída
// A saída consiste de um único inteiro que representa quanta mandioca Marlene deve preparar em gramas.


let chico = 300 * parseInt(gets());
let bento = 1500 * parseInt(gets());
let bernardo = 600 * parseInt(gets());
let marina = 1000 * parseInt(gets());
let iara = 150 * parseInt(gets());
let marlene = 225;
let total = chico + bento + bernardo + marina + iara + marlene; // Digite aqui o calculo total
console.log(total);
