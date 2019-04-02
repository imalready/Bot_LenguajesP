package co.edu.javeriana.bot.ast;

public class Read implements ASTNode {
	private ASTNode data;
	
	public Read(ASTNode data) {
		super();
		this.data = data;
	}

	@Override
	public Object execute() {
		System.out.println(data.execute());
		return null;
	}

}
