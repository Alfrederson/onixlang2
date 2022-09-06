function Node(){
    this.scope = {
        stack : [],
        depth : 0
    }
}

/**
 * Pushes a node onto the node stack.
 * This is used for things such as finding variable declarations and etc.
 * Do not use it during the AST building stage.
 * Instead, use addChild(node, child)
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
 * Adds a node or array of nodes to the current node.
 * When a node is added to a parent node, it's parent property is set to a reference to the parent node.
 * This function is recursive, so adding an array that contains an array will have the effect of adding
 * a flattened array.
 * @param {node|array} a node or an array of nodes 
 * @returns what was added
 */
Node.prototype.addChild = function(par,node){
    if(!node)
        return node
    let n = par

    // side effects
    const add = no => {
        if(no){
            no.parent = n
        }
        if(n.addChild)
            n.addChild(no)
        else{
            if(!n.body) n.body = []
            n.body.push(no)
        }
    }

    if(node.constructor.name === "Array"){
        node.forEach(
            no => this.addChild(par,no) // recursivo.
        )
    }
    else add(node) // non recursive
    
    return node
}

module.exports = new Node()