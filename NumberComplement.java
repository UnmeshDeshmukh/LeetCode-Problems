
public class NumberComplement {
	public static String convertToBinary(int num){
		
		StringBuilder sb = new StringBuilder();
        int temp;
        while(num>0){
        	temp = num%2;
        	sb.append(temp);
        	num = num/2;
        }
     
        return sb.reverse().toString();
    }
    public static int findComplement(int num) {
        String complement = convertToBinary(num);
        StringBuilder result = new StringBuilder();
       
        for(int i=0;i<complement.length();i++){
        	
        	if(complement.charAt(i)=='0'){     		
        		result.append(1);
        	}else if(complement.charAt(i)=='1'){
        		result.append(0);
        	}
        }
        return Integer.parseInt(result.toString(),2);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		int complementNumber = findComplement(num);
		System.out.println("The complement number is :"+ complementNumber);
	}

}
