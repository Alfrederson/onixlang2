/**
 *  Cria um nó que representa um valor nulo (ugr).
 * @param {{type: string, val: number, raw: string}} value 
 * @returns 
 */
function Null(){
    this.type = "null"
    return this
}

Null.prototype.toAST = function(){
    return { "null" : "null"}
}

Null.prototype.toC = function(nivel){
    return "null"
}

Null.prototype.toJS = function(nivel){
    return "null"
}

module.exports = Null