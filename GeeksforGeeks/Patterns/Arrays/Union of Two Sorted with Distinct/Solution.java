class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        List<Integer> union = new ArrayList<>();
        int n = a.length;
        int m = b.length;
        int i =0;
        int j=0; 
        while(i<n&&j<m){
            if(a[i]<=b[j]){
                if(union.isEmpty()||union.get(union.size()-1)!=a[i]){
                    union.add(a[i]);
                }
                    i++;
            }
            else{
                   if(union.isEmpty()||union.get(union.size()-1)!=b[j]){
                    union.add(b[j]);
                }
                    j++;
                
            }
        }
        while(i<n){
               if(union.isEmpty()||union.get(union.size()-1)!=a[i]){
                    union.add(a[i]);
                }
                    i++;
            
        }
        while(j<m){
               if(union.isEmpty()||union.get(union.size()-1)!=b[j]){
                    union.add(b[j]);
                }
                    j++;
        }
        return new ArrayList(union);
    }
}
