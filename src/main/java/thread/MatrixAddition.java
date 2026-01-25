package main.java.thread;

/**
 * Adding a Two dimensional matrix 
 * using multi threading concept.
 * 
 */
public class MatrixAddition {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		final int [][] twoDimMat = {{2,4,5},{5,5,9},{6,4,3}};
		Thread rowThreads [] = new Thread [twoDimMat.length];
		RowAdditionThread rows [] = new RowAdditionThread [twoDimMat.length];
		
		for(int i=0; i < twoDimMat.length; i++) {
			rows [i] = new RowAdditionThread(twoDimMat[i]);
			rowThreads [i] = new Thread(rows [i]);
			try {
				rowThreads[i].start();
				rowThreads[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		int [] rowResults = new int [twoDimMat.length];
		for(int i=0; i < twoDimMat.length; i++) {
			rowResults[i] = rows [i].getAddedResult();
		}
		
		RowAdditionThread result =  new RowAdditionThread(rowResults);
		Thread resultThread = new Thread(result);
		resultThread.start();
		System.out.println("Matrix Addition = " + result.getAddedResult());
	}

}

class RowAdditionThread implements Runnable {
	
	private int [] rowElements;
	private int addedResult = -1;
	
	public RowAdditionThread(int [] rowElements) {
		this.rowElements = rowElements;
	}
	
	public void run() {
		//muting the negative result
		this.addedResult = 0;
		for(int element: rowElements) {
			this.addedResult = this.addedResult + element;
		}
	}
	
	public int getAddedResult() {
		return addedResult;
	}
}
