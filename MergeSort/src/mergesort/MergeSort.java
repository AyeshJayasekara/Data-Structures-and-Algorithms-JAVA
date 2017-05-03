/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;

/**
 *
 * @author ejkpa
 */
public class MergeSort {
    private static int []a;
    public void sort(){
		int []tempArray = new int[a.length];
		mergeSort(tempArray,0,a.length-1);
	}
	
	private void mergeSort(int []tempArray,int lowerIndex,int upperIndex){
		if(lowerIndex == upperIndex){
			return;
		}else{
			int mid = (lowerIndex+upperIndex)/2;
			mergeSort(tempArray, lowerIndex, mid);
			mergeSort(tempArray, mid+1, upperIndex);
			merge(tempArray,lowerIndex,mid+1,upperIndex);
		}
	}
	
	private void merge(int []tempArray,int lowerIndexCursor,int higerIndex,int upperIndex){
		int tempIndex=0;
		int lowerIndex = lowerIndexCursor;
		int midIndex = higerIndex-1;
		int totalItems = upperIndex-lowerIndex+1;
		while(lowerIndex <= midIndex && higerIndex <= upperIndex){
			if(a[lowerIndex] < a[higerIndex]){
				tempArray[tempIndex++] = a[lowerIndex++];
			}else{
				tempArray[tempIndex++] = a[higerIndex++];
			}
		}
		
		while(lowerIndex <= midIndex){
			tempArray[tempIndex++] = a[lowerIndex++];
		}
		
		while(higerIndex <= upperIndex){
			tempArray[tempIndex++] = a[higerIndex++];
		}
		
		for(int i=0;i<totalItems;i++){
			a[lowerIndexCursor+i] = tempArray[i];
		}
	}
	
	public void printArray(){
		for(int i : a){
			System.out.print(i+" ");
		}
	}
	

    public MergeSort(int size) {
        a = new int[size];
        int item = 0;
		for(int i=0;i<size;i++){
			item = (int)(Math.random()*100); 
			a[i] = item;
		}
    }
        
    
}
