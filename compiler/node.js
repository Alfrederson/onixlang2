function Node(){
    this.scope = {
        stack : [],
        depth : 0
    }
}

/**
 * Pushes a node onto the node stack.
 * This is used for things such as finding variable declarations and etc.
 * @param {node} a block element that can receive statements inside it (program, if, loop, functions, etc) 
 */
Node.prototype.pushNode = function(node){
    this.scope.depth++
    this.scope.stack.push(node)
}
/**
 * Pops the topmost node.
 */
Node.prototype.popNode = function(){
    this.scope.stack.pop()
    this.scope.depth--
}
Node.prototype.currentNode = function(){
    return this.scope.stack[this.scope.depth-1]
}
/**
 * Adds a node or array of nodes to the current node
 * @param {node|array} a node or an array of nodes 
 * @returns what was added
 */
Node.prototype.addChild = function(node){
    if(!node)
        return node
    let n = this.currentNode()

    const add = no => {
        if(n.addChild)
            n.addChild(no)
        else{
            if(!n.body) n.body = []
            n.body.push(no)
        }
    }

    if(node.constructor.name == "Array")
        node.forEach( no => add(no))
    else add(node)

    return node
}

module.exports = new Node()