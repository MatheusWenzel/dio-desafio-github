function validaArray(arr, num) {
    try {
        if (!arr && !num) throw new ReferenceError("Envie os parâmetros");

        if (typeof arr !== 'object') throw TypeError('Array rpecisa ser do tipo object');

        if (typeof num !== 'number') throw TypeError('Num precisa ser do tipo number');

        if (arr.length !== num) throw new RangeError("Tamanho inválido");

        return arr;

    }

    catch (e) {
        if (e instanceof ReferenceError) {
            console.log("Este erro é um Reference Error");
            console.log(e.message);
            console.log(e.name);
            console.log(e.stack);

        } else if (e instanceof TypeError) {
            console.log("Este erro é um TypeError");
            console.log(e.message);
            console.log(e.name);
            console.log(e.stack);
        } else if (e instanceof RangeError) {
            console.log("Este erro é um RangeError");
            console.log(e.message);
            console.log(e.name);
            console.log(e.stack);

        } else {
            console.log("Tipo de erro não esperado:" + e);
        }
    }

}

console.log(validaArray())