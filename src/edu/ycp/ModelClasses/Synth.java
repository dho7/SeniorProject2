package edu.ycp.ModelClasses;

import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;

public class Synth {
	int[] notes;	
	
	public int[] getNotes() {
		return notes;
	}

	public void setNotes(int[] notes) {
		this.notes = notes;
	}

	public Synth(int[] notes) {
		this.notes = notes; 
	}
	
	public void play(){
		try{
			//get synthesizer and midi channel to play notes
			Synthesizer synth = MidiSystem.getSynthesizer();
			synth.open();
			MidiChannel channel = synth.getChannels()[0];
			
			//play note for 1s
			for (int note : notes) {
	              channel.noteOn(note, 50);
	              try {
	                  Thread.sleep(1000);
	              } catch (InterruptedException e) {
	                  break;
	              } finally {
	                  channel.noteOff(note);
	              }
	          }
			
			//..can't..
		} catch (MidiUnavailableException e) {
			e.printStackTrace();
		}
	}
}
