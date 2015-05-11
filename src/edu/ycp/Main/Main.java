package edu.ycp.Main;

import java.util.Random;
import java.util.Scanner;

import edu.ycp.ModelClasses.Algorithms;
import edu.ycp.ModelClasses.BubbleSortDataGenerativeInfo;
import edu.ycp.ModelClasses.BubbleSortMusicGenerator;
import edu.ycp.ModelClasses.MergeSortDataGenerativeInfo;
import edu.ycp.ModelClasses.MergeSortMusicGenerator;
import edu.ycp.ModelClasses.Synth;
import edu.ycp.ModelClasses.TreeDataGenerativeInfo;
import edu.ycp.ModelClasses.TreeMusicGenerator;

public class Main {
	public static void main(String[] args) {
		//variables#############
		int dataSize = 1;
		int[] data = null;
		int index = 0;
		int whichAlgorithm = 0;
		int numberRead = 0;
		int numAlgorithms = 3;
		boolean dataSizeOk = false;
		boolean entryStyleOk = false;
		boolean manualInput = false;		
		Random r = null;
		Synth synth = null;
		Algorithms algs = new Algorithms();
		Scanner keyboard = new Scanner(System.in);
		//###############################

		//determine the data size for the array
		while(!dataSizeOk) {
			System.out.println("Enter the data size for the algorithms (1 - 1,000,000)");
			dataSize = keyboard.nextInt();
			if(dataSize < 1 || dataSize > 1000000) {
				dataSizeOk = false;
			}
			else {
				dataSizeOk = true;
			}
		}

		data = new int[dataSize];

		// have user decide if they want to manually enter the data or have it created randomly
		while(!entryStyleOk) {
			System.out.println("Press 1 for manual data entry or 2 for random data entry");
			int entryDecision = keyboard.nextInt();
			if(entryDecision == 1) {
				manualInput = true;
				entryStyleOk = true;
			}
			else if(entryDecision == 2) {				
				entryStyleOk = true;
				r = new Random(System.currentTimeMillis());
				for(int i = 0; i < dataSize; i++) {
					data[i] = r.nextInt(1000);
				}
			}
			else {
				entryStyleOk = false;
			}
		}			

		// determine what formula of music generation the user wants
		int genDecision = 0;
		do {
			System.out.println("Press 1 for random music generation or 2 for major pentatonic generation\n"
					+ " 3 for minor pentatonic, 4 for major blues, or 5 for minor blues");
			genDecision = keyboard.nextInt();
		} while(genDecision < 1 || genDecision > 5);
		
		//decide whether to use bubblesort - mergesort - or bst
		while(whichAlgorithm < 1 || whichAlgorithm > numAlgorithms) {
			System.out.println("Enter 1 for Bubblesort, 2 for Mergesort, 3 for Trees");		
			whichAlgorithm = keyboard.nextInt();
		}

		//let the user manually enter the numbers
		if(manualInput) {
			System.out.println("Enter " + dataSize + " positive integers.");
			do  {
				//read number and add it to array
				numberRead = keyboard.nextInt();
				if(numberRead > -1) {
					data[index] = numberRead;
					index++;
				} else {
					System.out.println("no negatives!");				
				}
			} while(index < dataSize);
		}

		try {				
			//print numbers for debug
			for(int num : data) {
				//System.out.println(num);
			}

			//start playing the music
			System.out.println("Jamming out!");
			
			//genInfo (data about the data) to generate music notes
			int[] notes = null;
			switch(whichAlgorithm) {
			case 1:
				BubbleSortDataGenerativeInfo bsGenInfo;
				BubbleSortMusicGenerator bsMusicGen;

				bsGenInfo = algs.BubbleSortWithGenInfo(data);
				bsMusicGen = new BubbleSortMusicGenerator(bsGenInfo);

				//music gen decision "tree"
				if(genDecision == 1) {
					notes = bsMusicGen.getNotes(); 
				}
				else if(genDecision == 2) {
					notes = bsMusicGen.getMajorPentatonicNotes();
				}
				else if(genDecision == 3) {
					notes = bsMusicGen.getMinorPentatonicNotes();
				}
				else if(genDecision == 4) {
					notes = bsMusicGen.getMajorBluesNotes();
				}
				else if(genDecision == 5) {
					notes = bsMusicGen.getMinorPentatonicNotes();
				}
				else {
					//room for expansion
				}
				synth = new Synth(notes);
				synth.play();
				break;
			case 2:
				//mergesort
				int[] workArray = new int[dataSize];
				MergeSortDataGenerativeInfo msGenInfo;
				MergeSortMusicGenerator msMusicGen;

				msGenInfo = algs.getMergeSortGenInfo(data, workArray, dataSize);					
				msMusicGen = new MergeSortMusicGenerator(msGenInfo);

				//music gen decision "tree"
				if(genDecision == 1) {
					notes = msMusicGen.getNotes();
				}
				else if(genDecision == 2) {
					notes = msMusicGen.getMajorPentatonicNotes();
				}
				else if(genDecision == 3) {
					notes = msMusicGen.getMinorPentatonicNotes();
				}
				else if(genDecision == 4) {
					notes = msMusicGen.getMajorBluesNotes();
				}
				else if(genDecision == 5) {
					notes = msMusicGen.getMinorBluesNotes();
				}
				else {
					//room for expansion
				}				
				synth = new Synth(notes);
				synth.play();
				break;
			case 3:
				//tree
				TreeDataGenerativeInfo treeGenInfo;
				TreeMusicGenerator tMusicGen;

				treeGenInfo = algs.getTreeDataGenerativeInfo(data);
				tMusicGen = new TreeMusicGenerator(treeGenInfo);

				//music gen decision "tree"
				if(genDecision == 1) {
					notes = tMusicGen.getNotes();
				}
				else if(genDecision == 2) {
					notes = tMusicGen.getMajorPentatonicNotes();
				}
				else if(genDecision == 3) {
					notes = tMusicGen.getMinorPentatonicNotes();
				}
				else if(genDecision == 4) {
					notes = tMusicGen.getMajorBluesNotes();
				}
				else if(genDecision == 5) {
					notes = tMusicGen.getMinorBluesNotes();
				}
				else {
					//room for expansion
				}				
				synth = new Synth(notes);
				synth.play();
				break;
			}				

		} finally {
			keyboard.close();
		}
	}
}
