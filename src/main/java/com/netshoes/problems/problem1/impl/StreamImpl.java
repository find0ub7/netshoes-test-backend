package com.netshoes.problems.problem1.impl;


import com.netshoes.problems.problem1.api.Stream;

// NAO RENOMEAR ESSA CLASSE!
public class StreamImpl implements Stream {

    // TODO sua implementacao! Fique a vontade para criar suas classes/interfaces caso julgue necessario.

    private String stream;
    private int index = 0;

	// Nao alterar esse construtor!
    public StreamImpl(String stream) {
		this.stream = stream;
    }

    @Override
    public char getNext() {
        return stream.charAt(index++);
    }

    @Override
    public boolean hasNext() {
        return stream != null && stream.length() > index;
    }
}
