package co.edu.javeriana.bot.ast;

public class Minus implements ASTNode {
	private ASTNode operand1;
	private ASTNode operand2;
	
	public Minus(ASTNode operand1, ASTNode operand2) {
		super();
		this.operand1 = operand1;
		this.operand2 = operand2;
	}

	public Object execute() {
		return (int)operand1.execute() - (int)operand2.execute();
	}

}
