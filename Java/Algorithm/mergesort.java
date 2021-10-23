/**
 * mergesort
 */
public class mergesort {
static void merge(int left,int mid,int right,int arr[]){
    int left_[]=new int[mid-left+1];
    int right_[]=new int[right-mid];
    for(int i=0;i<left_.length;++i){
        left_[i]=arr[left+i];
    }
    for(int i=0;i<right_.length;++i){
        right_[i]=arr[(mid+1)+i];
    }
    int i=0;
    int j=0;
    int k=left;
    while(i<left_.length&&j<right_.length){
        if(left_[i]<=right_[j]){
            arr[k++]=left_[i];
            ++i;
        }
        else{
            arr[k++]=right_[j];
            ++j;
        }
    }
    while(i<left_.length){
        arr[k++]=left_[i++];
    }
    while(j<right_.length){
        arr[k++]=right_[j++];
    }
}
static void sort(int left,int right,int arr[]){
    if(left<right){
        int mid=(left+right)/2;
        sort(left,mid,arr);
        sort(mid+1,right,arr);
        merge(left,mid,right,arr);
    }
}
    public static void main(String[] args) {
        int arr[]={5,4,1,2,3,5};
        for(int elements:arr){
            System.out.print(elements+" ");
            
        }
        sort(0, arr.length-1, arr);
        System.out.println();
        System.out.println("Sorted Order");
        for(int elements:arr){
            System.out.print(elements+" ");
        }
    }
}