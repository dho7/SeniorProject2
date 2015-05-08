package edu.ycp.ModelClasses;

public enum Notes {
//A-G, flats and sharps
	A(57),
	As(58),
	Bb(58),
	B(59),
	C(60),
	Cs(61),
	Db(61),
	D(62),
	Ds(63),
	Eb(63),
	E(64),
	F(65),
	Fs(66),
	Gb(66),
	G(67),
	Gs(68),
	Ab(68);
	
	private int value;
	
	Notes(int value){
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}	
}
