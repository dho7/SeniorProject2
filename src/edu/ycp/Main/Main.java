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

		for(int num : data) {
			System.out.println(num);
		}
		
		genInfo = algs.BubbleSortWithGenInfo(data);
		musicGen = new MusicGenerator(genInfo);
		int[] notes = musicGen.getNotes();

		synth = new Synth(notes);
		synth.play();
	}
}
