package co.edu.javeriana.bot.ast;

import java.util.Map;

public class MenorQue implements ASTNode {
	private ASTNode operand1;
	private ASTNode operand2;
	
	
	public MenorQue(ASTNode operand1, ASTNode operand2) {
		super();
		this.operand1 = operand1;
		this.operand2 = operand2;
	}


	@Override
	public Object execute(Map<String, Object> SymbolTable) {
		System.out.println((int)operand2.execute(SymbolTable));
		return (int)operand1.execute(SymbolTable) < (int)operand2.execute(SymbolTable);
	}

}
