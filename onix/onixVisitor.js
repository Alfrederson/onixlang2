// Generated from C:\Users\ruy_g\OneDrive\Área de Trabalho\Transpileitor2\onix.g4 by ANTLR 4.8
// jshint ignore: start
var antlr4 = require('antlr4/index');

// This class defines a complete generic visitor for a parse tree produced by onixParser.

function onixVisitor() {
	antlr4.tree.ParseTreeVisitor.call(this);
	return this;
}

onixVisitor.prototype = Object.create(antlr4.tree.ParseTreeVisitor.prototype);
onixVisitor.prototype.constructor = onixVisitor;

// Visit a parse tree produced by onixParser#program.
onixVisitor.prototype.visitProgram = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#block.
onixVisitor.prototype.visitBlock = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#import_directive.
onixVisitor.prototype.visitImport_directive = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#use_directive.
onixVisitor.prototype.visitUse_directive = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#statement.
onixVisitor.prototype.visitStatement = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#ext_block.
onixVisitor.prototype.visitExt_block = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#body.
onixVisitor.prototype.visitBody = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#record_def.
onixVisitor.prototype.visitRecord_def = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#func_def.
onixVisitor.prototype.visitFunc_def = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#func_stub.
onixVisitor.prototype.visitFunc_stub = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#cpp_ext_block.
onixVisitor.prototype.visitCpp_ext_block = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#vm_ext_block.
onixVisitor.prototype.visitVm_ext_block = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#cpp_func_def.
onixVisitor.prototype.visitCpp_func_def = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#cpp_var_def.
onixVisitor.prototype.visitCpp_var_def = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#vm_func_def.
onixVisitor.prototype.visitVm_func_def = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#sub_name.
onixVisitor.prototype.visitSub_name = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#sub_def.
onixVisitor.prototype.visitSub_def = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#sub_stub.
onixVisitor.prototype.visitSub_stub = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#cpp_sub_def.
onixVisitor.prototype.visitCpp_sub_def = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#vm_sub_def.
onixVisitor.prototype.visitVm_sub_def = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#any_args.
onixVisitor.prototype.visitAny_args = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#labelDef.
onixVisitor.prototype.visitLabelDef = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#gotoJump.
onixVisitor.prototype.visitGotoJump = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#breakLoop.
onixVisitor.prototype.visitBreakLoop = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#continueLoop.
onixVisitor.prototype.visitContinueLoop = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#retStatement.
onixVisitor.prototype.visitRetStatement = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#par.
onixVisitor.prototype.visitPar = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#parlist.
onixVisitor.prototype.visitParlist = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#conditional.
onixVisitor.prototype.visitConditional = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#if_elseif.
onixVisitor.prototype.visitIf_elseif = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#if_else.
onixVisitor.prototype.visitIf_else = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#for_loop.
onixVisitor.prototype.visitFor_loop = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#range_loop.
onixVisitor.prototype.visitRange_loop = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#for_each_loop.
onixVisitor.prototype.visitFor_each_loop = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#while_loop.
onixVisitor.prototype.visitWhile_loop = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#repeat_loop.
onixVisitor.prototype.visitRepeat_loop = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#think_loop.
onixVisitor.prototype.visitThink_loop = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#declaration.
onixVisitor.prototype.visitDeclaration = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#constDecUnit.
onixVisitor.prototype.visitConstDecUnit = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#constDeclaration.
onixVisitor.prototype.visitConstDeclaration = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#initializer.
onixVisitor.prototype.visitInitializer = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#varDecUnit.
onixVisitor.prototype.visitVarDecUnit = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#varDeclaration.
onixVisitor.prototype.visitVarDeclaration = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#arrayInitializer.
onixVisitor.prototype.visitArrayInitializer = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#arrayDecUnit.
onixVisitor.prototype.visitArrayDecUnit = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#arrayDeclaration.
onixVisitor.prototype.visitArrayDeclaration = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#assignmentUnit.
onixVisitor.prototype.visitAssignmentUnit = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#assignment.
onixVisitor.prototype.visitAssignment = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#assignOp.
onixVisitor.prototype.visitAssignOp = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#unaryOp.
onixVisitor.prototype.visitUnaryOp = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#propOp.
onixVisitor.prototype.visitPropOp = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#primaryExpression.
onixVisitor.prototype.visitPrimaryExpression = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#postfixExpression.
onixVisitor.prototype.visitPostfixExpression = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#exp.
onixVisitor.prototype.visitExp = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#multiplicative.
onixVisitor.prototype.visitMultiplicative = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#additive.
onixVisitor.prototype.visitAdditive = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#shift.
onixVisitor.prototype.visitShift = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#relational.
onixVisitor.prototype.visitRelational = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#equality.
onixVisitor.prototype.visitEquality = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#bitAnd.
onixVisitor.prototype.visitBitAnd = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#bitXor.
onixVisitor.prototype.visitBitXor = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#bitOr.
onixVisitor.prototype.visitBitOr = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#boolAnd.
onixVisitor.prototype.visitBoolAnd = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#boolOr.
onixVisitor.prototype.visitBoolOr = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#expList.
onixVisitor.prototype.visitExpList = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#number.
onixVisitor.prototype.visitNumber = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#string.
onixVisitor.prototype.visitString = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#type.
onixVisitor.prototype.visitType = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#unary.
onixVisitor.prototype.visitUnary = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by onixParser#identifier.
onixVisitor.prototype.visitIdentifier = function(ctx) {
  return this.visitChildren(ctx);
};



exports.onixVisitor = onixVisitor;