package com.netshoes.problems.problem1.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.netshoes.problems.problem1.api.Stream;

// NAO RENOMEAR ESSA CLASSE!
public class SearchVowel {

    private static List<Character> vogais = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

	// TODO sua implementacao! Fique a vontade para criar suas classes/interfaces caso julgue necessario.

    // NAO ALTERAR ESSA ASSINATURA!
    public static char firstChar(Stream input) {
        // TODO sua implementacao! Nesse ponto deve ser feita a adaptacoes necessarias para que os testes executem com sucesso
    	Map<Character, CharData> countChar = new HashMap<>();
    	char firstBeforeChar = 0;
    	char secondBeforeChar = 0;
    	char character = 0;

    	StringBuilder inputStr = new StringBuilder();

    	while(input != null && input.hasNext()) {
    		secondBeforeChar = firstBeforeChar;
    		firstBeforeChar = character;
    		character = input.getNext();
    		inputStr.append(character);

    		if (vogais.contains(character)) {
				boolean valido = ehConsoante(firstBeforeChar) && vogais.contains(secondBeforeChar);
				CharData charData = countChar.getOrDefault(character, new CharData(0));
				charData.addCount(1);
				if (!valido)
					charData.setValido(valido);
				countChar.put(character, charData);
    		}
    	}

    	char firstChar = '0';
    	for (Character caracter : countChar.keySet()) {
    		CharData charData = countChar.get(caracter);
    		if (charData.getCount() == 1) {
    			if (charData.isValido()) {
    				if (firstChar == '0') {
    					firstChar = caracter;
    				} else {
    					int posCaracter = inputStr.indexOf(String.valueOf(caracter));
    					int posCaracterAnt = inputStr.indexOf(String.valueOf(firstBeforeChar));

    					if (posCaracter < posCaracterAnt)
    						firstChar = caracter;

    				}
    			}
    		}
    	}

        return firstChar;
    }

	private static boolean ehConsoante(char character) {
		return !vogais.contains(character) && ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z'));
	}

}
