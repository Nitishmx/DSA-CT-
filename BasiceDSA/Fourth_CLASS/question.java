package Fourth_CLASS;

// import java.util.Scanner;

public class question {
    public static void main(String[] args) {
        
        int maxs=Integer.MIN_VALUE;
  int arr[]={1,1,3,58,11,1,1,1,1};

  
  int n=arr.length;
  int max=0;
  for(int j=0;j<arr.length;j++){
      if (arr[j]>max) {
          max=arr[j];
      }
  }
  int size=max+1;
  int hash[]=new int[size];
  for(int i=0;i<n;i++){
      int index=arr[i];
      hash[index]++;
    }
    for(int i=0;i<hash.length;i++){
    //     System.out.println(i);
    //   System.out.print(hash[i]);
    if (maxs<hash[i]) {
        maxs=hash[i];

        
    }
  }
  for(int i=0;i<hash.length;i++){
    if (hash[i]==maxs) {
        
        System.out.println(i);
    }
  }
}

}
