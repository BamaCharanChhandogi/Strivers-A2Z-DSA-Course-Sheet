public class TrappingWater {
    public static long trappingWater(int arr[], int size) { 
        // Your code here\
        int n=size;
        int ngl[]=new int[n];
        int nfr[]=new int[n];
         ngl[0]=arr[0];
        for(int i=1;i<n;i++){
            ngl[i]=Math.max(ngl[i-1],arr[i]);
            
        }
        //ngl
        nfr[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            nfr[i]=Math.max(nfr[i+1],arr[i]);
        }
        
        long stored=0;
        for(int j=0;j<n;j++){
            stored+=(Math.min(ngl[j],nfr[j])-arr[j]);
        }
        return stored;
    }
    public static void main(String[] args) {
        int  arr[]={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trappingWater(arr,arr.length));
    }
}
