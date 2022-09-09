function Text(str){
    this.type = "text"
    this.value = str
    return this
}
Text.prototype.toAST = function(){
    return {text : this.value}
}
Text.prototype.toC = 
Text.prototype.toJS = 
function(nivel){
    return "\"" + this.value + "\""
}

module.exports = Text