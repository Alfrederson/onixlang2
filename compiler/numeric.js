function Numeric(value){
    this.type = "numeric"
    this.value = value
    return this
}

Numeric.prototype.toAST = function(){
    return this.value.val
}

Numeric.prototype.toC = function(nivel){
    return this.value.val
}

Numeric.prototype.toJS = function(nivel){
    return this.value.val
}

module.exports = Numeric