package co.edu.javeriana.bot.ast;

import java.util.List;
import java.util.Map;

public class Ciclo implements ASTNode {
	private ASTNode condition;
	private List<ASTNode> body;
	
	@Override
	public Object execute(Map<String, Object> SymbolTable) {
		while ((boolean)condition.execute(SymbolTable)){
			for(ASTNode n: body){
				n.execute(SymbolTable);
			}
						
		}
		return null;
	}




	public Ciclo(ASTNode condition, List<ASTNode> body) {
		super();
		this.condition = condition;
		this.body = body;
		
	}

}
