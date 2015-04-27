package edu.ycp.UnitTests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.ModelClasses.Algorithms;
import edu.ycp.ModelClasses.DataGenerativeInfo;
import edu.ycp.ModelClasses.DataOperations;
import edu.ycp.ModelClasses.Tree;
import edu.ycp.ModelClasses.TreeNode;

public class Tests {
	int[] arr1;
	int[] arr2;
	int[] mergeSortWorkArray;
	int[] arrMode;
	Algorithms algorithms;
	DataOperations dataOps;
	DataGenerativeInfo dataForArr1;
	Tree tree1;
	TreeNode node1;
	TreeNode node2;
	TreeNode node3;
	TreeNode node4;

	@Before
	public void setUp() {
		//////////////////// array 1 for bubble sort
		arr1 = new int[6];		

		arr1[0] = 3;
		arr1[1] = 2;
		arr1[2] = 1;
		arr1[3] = 10;
		arr1[4] = 4;
		arr1[5] = 4;	
		////////////////////

		///////////////////MERGESORT STUFF
		arr2 = new int[6];
		arr2[0] = 4;
		arr2[1] = 100;
		arr2[2] = 9;
		arr2[3] = 0;
		arr2[4] = 2;
		arr2[5] = 9001;

		mergeSortWorkArray = new int[arr2.length];
		for(int i = 0; i < mergeSortWorkArray.length; i++) {
			mergeSortWorkArray[i] = 0;
		}
		////////////////////

		///////////////////TREE-STUFF
		tree1 = new Tree();
		node1 = new TreeNode(1);
		node2 = new TreeNode(6);
		node3 = new TreeNode(5);
		node4 = new TreeNode(10);

		/////////////////////

		///////////////////EXTRAS
		arrMode = new int[]{1,2,2,3};


		// our algorithms for making music
		algorithms = new Algorithms();
		dataOps = new DataOperations();
		dataForArr1 = new DataGenerativeInfo();
		/////////////////////////

	}

	@Test
	public void test() {		
		algorithms.BubbleSort(arr1);
		for(int i = 0; i < arr1.length-1; i++) {
			assertEquals(true, ( arr1[i+1] >= arr1[i] ));
		}		
	}

	@Test
	public void testModeElement() {
		int mode = dataOps.getModeEleOfSortedArray(arrMode);
		assertEquals(true, (2 == mode) );
	}

	@Test
	public void testBubbleSortWithGenInfo() {
		dataForArr1 = algorithms.BubbleSortWithGenInfo(arr1);
		assertEquals(true, dataForArr1.getLargestEle() == arr1[arr1.length-1]);
		assertEquals(true, dataForArr1.getSmallestEle() == arr1[0]);
		assertEquals(true, dataForArr1.getModeEle() == 4);
		assertEquals(true, dataForArr1.getMeanEle() == 4.0);
		assertEquals(true, dataForArr1.getRange() == 9);
		assertEquals(true, dataForArr1.getNumElements() == 6);		
	}

	@Test
	public void testMergeSort() {
		algorithms.mergeSort(arr2, mergeSortWorkArray, arr2.length);
		for(int i = 0; i < arr2.length-1; i++) {
			assertEquals(true, ( arr2[i+1] >= arr2[i] ));
		}		
	}

	@Test
	public void testBinarySearch() {
		algorithms.mergeSort(arr1, mergeSortWorkArray, arr1.length);

		assertEquals(0, algorithms.binarySearch(arr1, 1, 0, arr1.length));
		assertEquals(1, algorithms.binarySearch(arr1, 2, 0, arr1.length));
		assertEquals(2, algorithms.binarySearch(arr1, 3, 0, arr1.length));
		assertEquals(5, algorithms.binarySearch(arr1, 10, 0, arr1.length));
	}

	@Test
	public void testInsertNode() {
		tree1.insert(2);
		assertEquals(2, tree1.getRoot().getValue());
		tree1.insert(1);
		assertEquals(1, tree1.getRoot().getLeft().getValue());
		tree1.insert(4);
		assertEquals(4, tree1.getRoot().getRight().getValue());
		tree1.insert(3);
		assertEquals(3, tree1.getRoot().getRight().getLeft().getValue());
	}

	@Test 
	public void testFindNode() {
		tree1.insert(2);
		tree1.insert(1);
		tree1.insert(4);
		tree1.insert(3);
		assertEquals(2, tree1.findNode(tree1.getRoot(), 2).getValue());
		assertEquals(1, tree1.findNode(tree1.getRoot(), 1).getValue());
		assertEquals(4, tree1.findNode(tree1.getRoot(), 4).getValue());
		assertEquals(3, tree1.findNode(tree1.getRoot(), 3).getValue());
		assertEquals(null, tree1.findNode(tree1.getRoot(), 5));
	}
	
	@Test
	public void testFindMaxNode() {
		tree1.insert(2);
		tree1.insert(1);
		tree1.insert(4);
		tree1.insert(3);
		assertEquals(4, tree1.findMaxNode(tree1.getRoot()).getValue());
	}
	
	@Test public void testFindMinNode() {
		tree1.insert(2);
		tree1.insert(1);
		tree1.insert(4);
		tree1.insert(3);
		assertEquals(1, tree1.findMinNode(tree1.getRoot()).getValue());
	}
}
