package com.netshoes.problems.problem1.impl;

public class CharData {
	private int count;
	private boolean valido;

	public CharData(int count) {
		super();
		this.count = count;
		this.valido = true;
	}
	public CharData(int count, boolean valido) {
		super();
		this.count = count;
		this.valido = valido;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public boolean isValido() {
		return valido;
	}
	public void setValido(boolean valido) {
		this.valido = valido;
	}
	@Override
	public String toString() {
		return "CharData [count=" + count + ", valido=" + valido + "]";
	}
	public void addCount(int count) {
		this.count += count;
	}

}
