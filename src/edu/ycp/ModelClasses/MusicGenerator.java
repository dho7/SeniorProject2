package edu.ycp.ModelClasses;

public class MusicGenerator {
	
	DataGenerativeInfo data;
	
	public MusicGenerator(DataGenerativeInfo data) {
		this.data = data;
	}
	
	public int[] getNotes() {
		int[] notes = new int[data.getSize()];
		
		//generate 8 note sequence
		notes[0] = ((data.getNumElements() * data.getIndexMoveCount()[0]) + 20) % 100;
		notes[1] = ((data.getRange() * data.getIndexMoveCount()[1]) + 20) % 100;
		notes[2] = ((data.getModeEle() * data.getIndexMoveCount()[2]) + 20) % 100;
		notes[3] = ((data.getSize() * data.getIndexMoveCount()[3]) + 20) % 100;
		notes[4] = ((data.getLargestEle() * data.getIndexMoveCount()[4]) + 20) % 100;
		notes[5] = ((int)(data.getMeanEle() * data.getIndexMoveCount()[5]) + 20) % 100;
		notes[6] = ((data.getSmallestEle() * data.getIndexMoveCount()[6]) + 20) % 100;
		notes[7] = ((data.getLargestEle() * data.getIndexMoveCount()[7]) + 20) % 100;		
		
		return notes;
	}
	
	public int[] getJazzNotes() {
		int[] notes = new int[data.getSize()];
		
		int modalNote = 0;
		
		return notes;
	}
}
