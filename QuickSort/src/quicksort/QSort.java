/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

/**
 *
 * @author ejkpa
 */
public class QSort {
    private int []a;  
	public void Startsort(){
		int left = 0;
		int right = a.length-1;			
		quickSort(left, right);
	}		
	private void quickSort(int left,int right){
		
		//end condition
		if(left >= right)
			return;	
		//last value as pivot
		int pivot = a[right];
		int partition = partition(left, right, pivot);
		
		// Recurtion?
		quickSort(0, partition-1);
		quickSort(partition+1, right);
	}
	
	private int partition(int left,int right,int pivot){
		int leftCursor = left-1;
		int rightCursor = right;
		while(leftCursor < rightCursor){
			while(a[++leftCursor] < pivot);
			while(rightCursor > 0 && a[--rightCursor] > pivot);
			if(leftCursor >= rightCursor){
				break;
			}else{
				swap(leftCursor, rightCursor);
			}
		}
		swap(leftCursor, right);
		return leftCursor;
	}
	private void swap(int left,int right){
		int temp = a[left];
		a[left] = a[right];
		a[right] = temp;
	}
    public QSort(int size) {
            int item = 0;
            a = new int[size];
		for(int i=0;i<size;i++){
			item = (int)(Math.random()*100); 
			a[i] = item;
		}
        
    }
    public void printArray(){
		for(int i : a){
			System.out.print(i+" ");
		}
	}

        
        
    
}
