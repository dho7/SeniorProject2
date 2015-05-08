package edu.ycp.Main;

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
		int dataSize = 8;
		int[] data = new int[dataSize];
		int index = 0;
		int whichAlgorithm = 0;
		int numberRead = 0;
		int numAlgorithms = 3;
		Synth synth;
		Algorithms algs = new Algorithms();
		
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter 1 for Bubblesort, 2 for Mergesort, 3 for Trees, enter any other number to quit");		

		whichAlgorithm = keyboard.nextInt();		

		



		try {
			if(whichAlgorithm < 1 || whichAlgorithm > numAlgorithms) {
				//end
			}
			else {
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

				//print numbers for debug
				for(int num : data) {
					System.out.println(num);
				}

				//genInfo (data about the data) to generate music notes
				int[] notes = null;
				switch(whichAlgorithm) {
				case 1:
					BubbleSortDataGenerativeInfo bsGenInfo;
					BubbleSortMusicGenerator bsMusicGen;
					
					bsGenInfo = algs.BubbleSortWithGenInfo(data);
					bsMusicGen = new BubbleSortMusicGenerator(bsGenInfo);
					
					notes = bsMusicGen.getNotes();
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
					
					notes = msMusicGen.getNotes();
					synth = new Synth(notes);
					synth.play();
					break;
				case 3:
					//tree
					TreeDataGenerativeInfo treeGenInfo;
					TreeMusicGenerator tMusicGen;
					
					treeGenInfo = algs.getTreeDataGenerativeInfo(data);
					tMusicGen = new TreeMusicGenerator(treeGenInfo);
					
					notes = tMusicGen.getNotes();
					synth = new Synth(notes);
					synth.play();
					break;
				}

				
			}
		} finally {
			keyboard.close();
		}
	}
}
