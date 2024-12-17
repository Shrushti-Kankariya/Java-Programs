// program to print all numbers divisible bt 3 and 5 both usinf for loop

class ForDiv3Or5{
	public static void main(String[] args){
	
		int i = 1;
		for(;;){	
			
			if(i%3==0 && i%5==0){
				System.out.println(i);
				i++;
				if(i>100){
					break;
				}
			}
		}
	}
}