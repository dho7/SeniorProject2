package edu.ycp.Main;

import java.util.Scanner;

import edu.ycp.ModelClasses.Algorithms;
import edu.ycp.ModelClasses.DataGenerativeInfo;
import edu.ycp.ModelClasses.MusicGenerator;
import edu.ycp.ModelClasses.Synth;

public class Main {
	public static void main(String[] args) {
		int dataSize = 8;
		int[] data = new int[dataSize];
		int index = 0;
		Synth synth;
		Algorithms algs = new Algorithms();
		DataGenerativeInfo genInfo;
		MusicGenerator musicGen;
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter " + dataSize + " positive integers.");

		int numberRead = 2;

		try {
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
			genInfo = algs.BubbleSortWithGenInfo(data);
			musicGen = new MusicGenerator(genInfo);
			int[] notes = musicGen.getNotes();

			synth = new Synth(notes);
			synth.play();
		} finally {
			keyboard.close();
		}
	}
}
