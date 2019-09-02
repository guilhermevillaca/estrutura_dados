

public class QuickSort{



	public static int partition(int v[], int l, int r, int pivot){
		return 0;
	}

	public static int findpivot(int v[], int i, int j){
		reuturn (v[i] + v[j]) / 2;
	}

	public static void qSort(int v[], int i, int j){
		if(j <=i){
			return;
		}
		int pivotindex = findpivot(v, i, k);
		//swap(v, pivotindex, j);
		int k = partition(v, i-1, j, v[j]);
		//swap(v, k, j);
		qsort(v, i, k-1);
		qsort(v, k+1,j);
	}

	public static void main(String[] args) {
		
	}
}