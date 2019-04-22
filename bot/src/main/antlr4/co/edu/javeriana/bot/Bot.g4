grammar Bot;

@header {

import org.jpavlich.bot.*;
import java.util.Map;
import java.util.HashMap;
import co.edu.javeriana.bot.ast.*;

}

@parser::members {

private Bot bot;

public BotParser(TokenStream input, Bot bot) {
    this(input);
    this.bot = bot;
}
Map<String, Object> symbolTable = new HashMap<String, Object>();
}

 
function: FUNCTION ID PAR_OPEN LET ID PAR_CLOSE BEGIN
	{
		List<ASTNode> body = new ArrayList<ASTNode>();
		Map<String,Object> symbolTable = new HashMap<String,Object>();
	}
	(sentence {body.add($sentence.node);})*
	END
		{
		for(ASTNode n : body){
			n.execute(symbolTable);
		}
	}
	SEMICOLON
	;
			

sentence returns [ASTNode node]: println {$node = $println.node;} 
				| conditional {$node = $conditional.node;}
				| decl {$node = $decl.node;}
				| assign {$node = $assign.node;}
				| decl_assign {$node = $decl_assign.node;}
				| cycle {$node = $cycle.node;}
				;

up returns [ASTNode node]:
	UP expression SEMICOLON
	;
	
down returns [ASTNode node]:
	DOWN expression SEMICOLON
	;
	
left returns [ASTNode node]:
	LEFT expression SEMICOLON
	;
	
right returns [ASTNode node]:
	RIGHT expression SEMICOLON
	;
	
pick returns [ASTNode node]:
	PICK expression SEMICOLON
	;
	
drop returns [ASTNode node]:
	DROP expression SEMICOLON
	;
	
println returns [ASTNode node]: PRINTLN expression SEMICOLON
	{$node = new Println($expression.node);};
	
conditional returns [ASTNode node]: IF PAR_OPEN statement PAR_CLOSE 
			{
				List<ASTNode> body = new ArrayList<ASTNode>();
			}
			BEGIN (s1 = sentence {body.add($s1.node);})* END
			ELSE
			{
				List<ASTNode> elseBody = new ArrayList<ASTNode>();
			}
			BEGIN (s2 = sentence {elseBody.add($s2.node);})* END SEMICOLON
			{
				$node = new If($statement.node,body,elseBody);
			};

cycle returns [ASTNode node]: WHILE PAR_OPEN statement PAR_CLOSE
			{
				List<ASTNode> body = new ArrayList<ASTNode>();
			}
			BEGIN (s1 = sentence {body.add($s1.node);})* END
			{
				$node = new Ciclo($statement.node,body);
			}
			SEMICOLON;
			
decl returns [ASTNode node]:
	LET ID SEMICOLON {$node = new Decl($ID.text);}
;

assign returns [ASTNode node]:
	ID ASSIGN expression SEMICOLON {$node = new Assign($ID.text, $expression.node);}
;

decl_assign returns [ASTNode node]:
	LET ID ASSIGN expression SEMICOLON {$node = new Decl($ID.text);
		$node = new Assign($ID.text, $expression.node);
	}
;

expression returns [ASTNode node]:
		t1=factor {$node = $t1.node;}
			(MAS t2=factor {$node = new Addition($node, $t2.node);}
				| MENOS t2=factor {$node = new Minus($node, $t2.node);})*;
statement returns [ASTNode node]:
		t1=factor {$node = $t1.node;}
			(GT t2=factor {$node = new MayorQue($node, $t2.node);}
				| LT t2=factor {$node = new MenorQue($node, $t2.node);}
				| EQ t2=factor {$node = new IgualQue($node, $t2.node);})*;
factor returns [ASTNode node]: 
		t1=term {$node = $t1.node;} 
			(MULT t2=term {$node = new Multiplication($node, $t2.node);}
				| DIV t2=term {$node = new Division($node, $t2.node);}
			)*;
			
term returns [ASTNode node]:
		NUMERO{$node = new Constant(Integer.parseInt($NUMERO.text));}
		| BOOL {$node = new Constant(Boolean.parseBoolean($BOOL.text));}
		| ID {$node = new Refer($ID.text);}
		| PAR_OPEN expression {$node = $expression.node;} PAR_CLOSE;

// Los tokens se escriben a continuación de estos comentarios.

FUNCTION: 'function';
END: 'end';
LET: 'let';
PRINTLN: 'println';
BEGIN: 'begin';
UP: 'up';
DOWN: 'down';
RIGHT: 'right';
LEFT: 'left';
PICK: 'pick';
DROP: 'drop';
LOOK: 'look';
BOOL: 'true'|'false';
IF: 'if';
ELSE: 'else';
WHILE: 'while';
GT: '>';
LT: '<';
ENTRE: '<>';
EQ: '==';
GEQ: '>=';
LEQ: '<=';
NEQ: '!=';
AND: 'and';
OR: 'or';
NOT: 'not';
MAS: '+';
MENOS: '-';
MULT: '*';
DIV: '/';
ASSIGN: '=';
READ: 'read';
WRITELN: 'writeln';
SEMICOLON: ';';
PAR_OPEN: '(';
PAR_CLOSE: ')';
BRACKET_OPEN: '{';
BRACKET_CLOSE: '}';
fragment QUOTE: '"';
WRITE: 'write';
ID: (LETTER|'_')(LETTER|DIGITS|'_')*;
fragment DIGIT: [0-9];
fragment DIGITS: DIGIT+;
NUMERO: DIGITS('.'DIGITS)?('E'[+-]?DIGITS)?;
fragment LETTER: [a-zA-Z];
STRING: LETTER*;
WS:
	[ \t\n\r]+ -> skip
;