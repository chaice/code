class for2 {
	public static void main(String[] args) {
		int sum=0;
		int m=0;
		for(int i=0;i<=50;i++){
			if(i%2!=0){
				System.out.println(i);
				sum +=i;
				m++;

			}
		}
        System.out.println("�ܺ�Ϊ:"+sum);
		System.out.println("����Ϊ:"+m);
	}
}
