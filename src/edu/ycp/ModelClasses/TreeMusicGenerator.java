package edu.ycp.ModelClasses;

import java.util.Random;

public class TreeMusicGenerator {
	
	private TreeDataGenerativeInfo data;
	
	public TreeMusicGenerator(TreeDataGenerativeInfo data) {
		this.data = data;
	}
	
	public int[] getNotes() {
		//generate selection randomly
		int[] notes = new int[data.getSize()];
		
		NoteOperations nops = new NoteOperations();
		int root = (data.getMaxValue() - data.getMinValue()) % nops.getNumNoteValues();
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
		//see majorpentatonicnotes method in mergesortmusicgenerator
		int[] notes = new int[data.getSize()];
		int[] steps = new int[]{0, 2, 4, 7, 9, 12};
		NoteOperations nops = new NoteOperations();

		int root = (data.getMaxValue() - data.getMinValue()) % nops.getNumNoteValues();
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
	
	public int[] getMinorPentatonicNotes() {
		//see majorpentatonicnotes method in mergesortmusicgenerator
		int[] notes = new int[data.getSize()];
		int[] steps = new int[]{0, 3, 5, 7, 10, 12};
		NoteOperations nops = new NoteOperations();
		
		int root = (data.getMaxValue() - data.getMinValue()) % 	nops.getNumNoteValues();
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
		//see majorpentatonicnotes method in mergesortmusicgenerator
		int[] notes = new int[data.getSize()];
		int[] steps = new int[]{0, 2, 3, 4, 7, 9, 12};
		NoteOperations nops = new NoteOperations();
		
		int root = (data.getMaxValue() - data.getMinValue()) % 	nops.getNumNoteValues();
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
		//see majorpentatonicnotes method in mergesortmusicgenerator
		int[] notes = new int[data.getSize()];
		int[] steps = new int[]{0, 3, 5, 6, 7, 10, 12};
		NoteOperations nops = new NoteOperations();
		
		int root = (data.getMaxValue() - data.getMinValue()) % 	nops.getNumNoteValues();
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
