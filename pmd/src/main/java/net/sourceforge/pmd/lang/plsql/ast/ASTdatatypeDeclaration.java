/* Generated By:JJTree: Do not edit this line. ASTDatatypeDeclaration.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=net.sourceforge.pmd.lang.ast.AbstractNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.sourceforge.pmd.lang.plsql.ast;

public
class ASTDatatypeDeclaration extends SimpleNode {
  public ASTDatatypeDeclaration(int id) {
    super(id);
  }

  public ASTDatatypeDeclaration(PLSQLParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(PLSQLParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=d4533d7aa434bb3ef0b4d31a6cf07a1e (do not edit this line) */