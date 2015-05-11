package edu.ycp.ModelClasses;

import java.util.Random;

public class MergeSortMusicGenerator {

	private MergeSortDataGenerativeInfo data;

	public MergeSortMusicGenerator(MergeSortDataGenerativeInfo data) {
		this.data = data;
	}

	public int[] getNotes() {
		int[] notes = new int[data.getSize()];		

		//generate randomly
		NoteOperations nops = new NoteOperations();
		int root = data.getNumSplits() % nops.getNumNoteValues();
		for(Notes note : Notes.values()) {
			if(root == note.ordinal()) {
				root = note.getValue();
			}
		}

		notes[0] = root;
		Random r = new Random(System.currentTimeMillis());
		for(int i = 1; i < data.getSize(); i++) {
			notes[i] = root + (r.nextInt(13));
		}

		return notes;
	}	
	public int[] getMajorPentatonicNotes(){
		//make notes array the size of the data array
		int[] notes = new int[data.getSize()];
		//holds the steps that formulate a major pentatonic scale including octave
		int[] steps = new int[]{0, 2, 4, 7, 9, 12};
		NoteOperations nops = new NoteOperations();

		// set the root based on the number of splits done in the algorithm
		int root = data.getNumSplits() % nops.getNumNoteValues();
		for(Notes note : Notes.values()) {
			if(root == note.ordinal()) {
				root = note.getValue();
			}
		}

		//randomly pick steps from the array that will generate a one octave major pentatonic
		//selection
		notes[0] = root;
		Random r = new Random(System.currentTimeMillis());
		for(int i = 1; i < data.getSize(); i++) {
			notes[i] = root + steps[r.nextInt(6)];
		}
		return notes;
	}
	
	public int[] getMinorPentatonicNotes() {
		//see majorpentatonicnotes method
		int[] notes = new int[data.getSize()];
		int[] steps = new int[]{0, 3, 5, 7, 10, 12};
		NoteOperations nops = new NoteOperations();
		
		int root = data.getNumSplits() % nops.getNumNoteValues();
		for(Notes note : Notes.values()) {
			if(root == note.ordinal()) {
				root = note.getValue();
			}
		}
		
		notes[0] = root;
		Random r = new Random(System.currentTimeMillis());
		for(int i = 1; i < data.getSize(); i++) {
			notes[i] = root + steps[r.nextInt(6)];
		}
		return notes;
	}
	
	public int[] getMajorBluesNotes() {
		//see majorpentatonicnotes method
		int[] notes = new int[data.getSize()];
		int[] steps = new int[]{0, 2, 3, 4, 7, 9, 12};
		NoteOperations nops = new NoteOperations();
		
		int root = data.getNumSplits() % 	nops.getNumNoteValues();
		for(Notes note : Notes.values()) {
			if(root == note.ordinal()) {
				root = note.getValue();
			}
		}
		
		notes[0] = root;
		Random r = new Random(System.currentTimeMillis());
		for(int i = 1; i < data.getSize(); i++) {
			notes[i] = root + steps[r.nextInt(7)];
		}
		return notes;
	}
	
	public int[] getMinorBluesNotes() {
		//see majorpentatonicnotes method
		int[] notes = new int[data.getSize()];
		int[] steps = new int[]{0, 3, 5, 6, 7, 10, 12};
		NoteOperations nops = new NoteOperations();
		
		int root = data.getNumSplits() % 	nops.getNumNoteValues();
		for(Notes note : Notes.values()) {
			if(root == note.ordinal()) {
				root = note.getValue();
			}
		}
		
		notes[0] = root;
		Random r = new Random(System.currentTimeMillis());
		for(int i = 1; i < data.getSize(); i++) {
			notes[i] = root + steps[r.nextInt(7)];
		}
		return notes;
	}
}
