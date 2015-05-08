package edu.ycp.ModelClasses;

import java.util.Random;

public class MergeSortMusicGenerator {

	private MergeSortDataGenerativeInfo data;
	
	public MergeSortMusicGenerator(MergeSortDataGenerativeInfo data) {
		this.data = data;
	}
	
	public int[] getNotes() {
		int[] notes = new int[data.getSize()];
		
		Random r = new Random(System.currentTimeMillis());
		NoteOperations noteValues = new NoteOperations();
		
		//generate 8 note sequence
		notes[0] = Notes.A.getValue() + (data.getNumElements() % noteValues.getNumNoteValues());
		notes[1] = notes[0] + (data.getNumMerges() % noteValues.getOctave());
		notes[2] = notes[0] + (r.nextInt() % noteValues.getOctave());
		notes[3] = notes[0] + (r.nextInt() % noteValues.getOctave());
		notes[4] = notes[0] + noteValues.getOctave();
		notes[5] = notes[0] + noteValues.getOctave() + (data.getNumMerges() % noteValues.getOctave());
		notes[6] = notes[0] + noteValues.getOctave() + (r.nextInt() % noteValues.getOctave());
		notes[7] = notes[0] + noteValues.getOctave() + (r.nextInt() % noteValues.getOctave());
		
		return notes;
	}	
}
