
class java15{
	public static void main(String[] args) {
		//1
		System.out.println(halvingsum(127));
		//2
		System.out.println(filternum("abc12d7A56DGFHF"));
		//3
		System.out.println(fibonacci(33));
		//4
        int [] arr={1,2,3,4,5,6,7,8,9};
		sum(arr,8);
	}
	static double halvingsum(int num){
		if(num==1){
			return 1;
			
			
		}
		return num+halvingsum(num/2);
}
    static String filternum(String mix){
    	mix=mix.toLowerCase();
    	String alpt=mix.replaceAll("['a','b','c','d','e','f','g','h','i,'j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']","");
    	
    	return alpt;
    }
    static int fibonacci(int no){
    	int start=0;
    	int second=1;
    	int value=0;
    	int ans=0;
    	
    	while (second<no){
    		if(second%2==0){
    			ans=ans+value;
    		}
    		value=start+second;
    		start=second;
    		second=value;
    		
    	}
    	return ans;
 
    
    }
   
    	
    	static void sum(int[] num, int value){
    		for(int i=0;i<num.length;i++){
    			for(int j=1;j<num.length;j++){
                  if(num[i]+num[j]==value){
                  	System.out.println(num[i]+","+num[j]);
                  }
    			}
    		}
    	}
    }