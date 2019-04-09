grammar Bot;

@header {

import org.jpavlich.bot.*;
import java.util.Map;
import java.util.HashMap;

}

@parser::members {

private Bot bot;

public BotParser(TokenStream input, Bot bot) {
    this(input);
    this.bot = bot;
}
Map<String, Object> symbolTable = new HashMap<String, Object>();
}

 
function: FUNCTION ID BRACKET_OPEN
	{
		List<ASTNode> body = new ArrayList<ASTNode>();
	}
	(sentence {body.add($sentence.node);})*
	BRACKET_CLOSE
	{
		for(ASTNode n : body){
			n.execute();
		}
	};
			

sentence returns [ASTNode node]: println {$node = $println.node} | conditional {$node = $conditional.node};

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
	
println returns [ASTNode node]: WRITELN expression SEMICOLON
	{node = new Println($expression.node)};
	
conditional returns [ASTNode node]: IF PAR_OPEN expression PAR_CLOSE 
			{
				List<ASTNode> body = new ArrayList<ASTNode>();
			}
			BRACKET_OPEN (s1 = sentence {body.add($s1.node);})* BRACKET_CLOSE
			ELSE
			{
				List<ASTNode> elseBody = new ArrayList<ASTNode>();
			}
			BRACKET_OPEN (s2 = sentence {elseBody.add($s2.node);})* BRACKET_CLOSE
			{
				$node = new if($expression.node,body,elseBody)
			};
	
expression returns [ASTNode node]:
		t1=factor {$node = $t1.node;}
			(MAS t2=factor {$node = new Addition($node, $t2.node);}
				| MENOS t2=factor {$node = Minus($node, $t2.node);})*;
				
factor returns [ASTNode node]: 
		t1=term {$node = $t1.node} 
			(MULT t2=term {$node = new Multiplication($node, $t2.node);}
				| DIV t2=term {$node = new Division($node, $t2.node);}
			)*;
			
term returns [ASTNode node]:
		NUMERO{$node = new Constant(Integer.parseInt($NUMERO.text));}
		| BOOL {$node = new Constant(Boolean.parseBoolean($BOOL.text));}
		| PAR_OPEN expression {$node = $expression.node;} PAR_CLOSE;

// Los tokens se escriben a continuación de estos comentarios.

FUNCTION: 'function';
LET: 'let';
PRINTLN: 'println';
UP: 'up';
DOWN: 'down';
RIGHT: 'right';
LEFT: 'left';
PICK: 'pick';
DROP: 'drop';
LOOK: 'look';
fragment DIGIT: [0-9];
fragment DIGITS: DIGIT+;
NUMERO: DIGITS('.'DIGITS)?('E'[+-]?DIGITS)?;
BOOL: 'true'|'false';
fragment LETTER: [a-zA-Z];
STRING: LETTER*;
ID: LETTER(LETTER|DIGITS)*;
BEGIN: 'begin';
END: 'end';
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

WS
:
	[ \t\r\n]+ -> skip
;