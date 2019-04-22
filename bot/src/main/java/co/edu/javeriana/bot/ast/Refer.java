package co.edu.javeriana.bot.ast;

import java.util.Map;

public class Refer implements ASTNode {

	private String name;
	
	
	
	public Refer(String name) {
		super();
		this.name = name;
	}



	@Override
	public Object execute(Map<String, Object> symbolTable) {
		System.out.println(name);
		return symbolTable.get(name);
	}

}
