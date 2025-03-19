package Algorithm.sorting;

public class MergeSortMain {

    public static void merge(int l1, int r1, int l2, int r2, int[] arr) {
        int n = r1 - l1+1;
        int m = r2 - l2+1;

        int[] a = new int[n];
        int[] b = new int[m];

        for(int i=l1;i<=r1;i++) a[i-l1] = arr[i];
        for(int i=l2;i<=r2;i++) b[i-l2] = arr[i];

        int i=0;
        int j=0;
        int k=l1;

        while (i<n && j < m) {
            if(a[i] <= b[j] ) {
                arr[k] = a[i];
                i++;
            }
            else {
                arr[k] = b[j];
                j++;
            }
            k++;
        }

        while(i<n) {
            arr[k] = a[i];
            i++;
            k++;
        }
        while(j<m) {
            arr[k] = b[j];
            j++;
            k++;
        }
        return ;
    }

    public static void mergeSort(int l, int r, int[] arr) {
        if(l >= r) return ;

        int mid = (l + r) / 2;

        mergeSort(l,mid,arr);
        mergeSort(mid+1,r,arr);

        merge(l,mid,mid + 1, r,arr);

    }
    public static void sort(int[] arr) {
        int l=0;
        int r=arr.length-1;

        mergeSort(l,r,arr);
    }
    public static void main(String[] args) {
        int[] arr = new int[]{4,2,8,6,3,7,5,3,1};

        MergeSortMain.sort(arr);

        for(int x : arr) System.out.print(x + " ");

    }
}
