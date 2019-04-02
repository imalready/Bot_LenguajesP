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

 
function: sentence*;
		

sentence returns [ASTNode node]: up | down | left | right | drop | pick | read | conditional;

up: UP expression SEMICOLON
	{
		//symbolTable.put("up",$expression.value);
		bot.up($expression.value);
		System.out.println("Subir");
	};
down: DOWN expression SEMICOLON
	{
		//symbolTable.put("down",$expression.value);
		bot.down($expression.value);
		System.out.println("Bajar");
	};
left: LEFT expression SEMICOLON
	{
		//symbolTable.put("left",$expression.value);
		bot.left($expression.value);
		System.out.println("Izquierda");
	};
right: RIGHT expression SEMICOLON
	{
		//symbolTable.put("right",$expression.value);
		bot.right($expression.value);
		System.out.println("Derecha");
	};
pick: PICK SEMICOLON
	{
		bot.pick();
		System.out.println("Tomar");
	};
drop: DROP SEMICOLON
	{
		bot.drop();
		System.out.println("Soltar");
	};
read returns [ASTNode node]: READ expression SEMICOLON
	{node = new Read($expression.node)};
	
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
				| MENOS t2=factor {$node = Minus($node, $t2.node);}
			)*;
factor returns [int value]: 
		t1=term {$value = (int)$t1.value;} 
			(MULT t2=term {$value = (int)$value * (int)$t2.value;})*;
			
dividendo returns [int value]: 
		t1=term {$value = (int)$t1.value;} 
			(MULT t2=term {$value = (int)$value / (int)$t2.value;})*;
term returns [ASTNode node]:
		NUMERO{}
		| BOOL {};

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