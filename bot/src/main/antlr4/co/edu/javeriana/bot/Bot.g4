grammar Bot;

@header {

import org.jpavlich.bot.*;

}

@parser::members {

private Bot bot;

public BotParser(TokenStream input, Bot bot) {
    this(input);
    this.bot = bot;
}

}


 
program: sentence*;
		

sentence: up | down | left | right | drop | pick;

up: UP expression SEMICOLON
	{System.out.println("Subir");};
down: DOWN expression SEMICOLON
	{System.out.println("Bajar");};
left: LEFT expression SEMICOLON
	{System.out.println("Izquierda");};
right: RIGHT expression SEMICOLON
	{System.out.println("Derecha");};
drop: DROP SEMICOLON
	{System.out.println("Agarrar");};
pick: PICK SEMICOLON
	{System.out.println("Tomar");};
	
expression returns [Object value]: 
			NUMBERS{$value = $NUMBERS.text; };



// Los tokens se escriben a continuación de estos comentarios.
// Todo lo que esté en líneas previas a lo modificaremos cuando hayamos visto Análisis Sintáctico
PROGRAM: 'program';
VAR: 'var';
PRINTLN: 'println';

IF: 'if';
UP: 'up';
DOWN: 'down';
RIGHT: 'right';
LEFT: 'left';
PICK: 'pick';
DROP: 'drop';
LOOK: 'look';
VARIABLE: 'let';
fragment DIGIT: [0-9];
fragment DIGITS: DIGIT+;
NUMBERS: DIGITS('.'DIGITS)?('E'[+-]?DIGITS)?;
BOOL: 'true'|'false';
fragment LETTER: [a-zA-Z];
STRING: LETTER*;
ID: LETTER(LETTER|DIGITS)*;
BEGIN: 'begin';
END: 'end';
ELSE: 'else';
WHILE: 'while';
GT: '>';
LT: '<';
EQ: '==';
GEQ: '>=';
LEQ: '<=';
NEQ: '!=';
AND: 'and';
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
ASSIGN: '=';
FUNCTION: 'function';
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