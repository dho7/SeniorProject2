package edu.ycp.ModelClasses;

import java.util.Random;

public class TreeMusicGenerator {
	
	private TreeDataGenerativeInfo data;
	
	public TreeMusicGenerator(TreeDataGenerativeInfo data) {
		this.data = data;
	}
	
	public int[] getNotes() {
		int[] notes = new int[data.getSize()];
		
		Random r = new Random(0);
		NoteOperations noteValues = new NoteOperations();
		
		//generate 8 note sequence
		notes[0] = Notes.A.getValue() + (data.getNumElements() % noteValues.getNumNoteValues());
		notes[1] = notes[0] + (data.getRange() % noteValues.getOctave());
		notes[2] = notes[1] + noteValues.getOctave();
		notes[3] = notes[1];
		notes[4] = notes[1] + (data.getMaxValue() % noteValues.getOctave());
		notes[5] = notes[1] + (data.getMinValue() % noteValues.getOctave());
		notes[6] = notes[1] + noteValues.getOctave();
		notes[7] = notes[0] + noteValues.getOctave();
		
		return notes;
	}
}
