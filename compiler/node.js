function Node(){
    this.scope = {
        stack : [],
        depth : 0
    }
}

Node.prototype.pushNode = function(node){
    this.scope.depth++
    this.scope.stack.push(node)
}
Node.prototype.popNode = function(){
    this.scope.stack.pop()
    this.scope.depth--
}
Node.prototype.currentNode = function(){
    return this.scope.stack[this.scope.depth-1]
}

Node.prototype.addChild = function(node){
    if(!node)
        return node

    let n = this.currentNode()

    if(node.constructor.name === "Array"){
        node.forEach( no =>{
            if(n.addChild)
                n.addChild(no)
            else{
                if(!n.children) n.children = []
                n.children.push(no)
            }
        })


    }else{
        if(n.addChild){
            n.addChild(node)
        }else{
            if(!n.children)
            n.children = []
            n.children.push(node)
        }
    }

    return node
}

module.exports = new Node()