package theThirdWork;

public class PyramidPrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int line = 8;
		int column = (line * 2 - 1) * 2 - 1;
		for(int i = 0;i < 8;i++) {
			int flag = 0;
			int number = 0;
			for(int j = 1;j <= column;j++) {
				if(j <= 15 - (2 * (i+1) - 1)) {
					System.out.print(" ");
				}else if(j <= 15){
					if(flag == 0) {
						System.out.print((int)Math.pow(2, number));
						if(i == 0) {
							System.out.println();
							break;
						}
						if(j != 15)number++;
						flag = 1;
					}else {
						System.out.print(" ");
						flag = 0;
					}
				}else {
					if(flag == 0) {
						number--;
						System.out.print((int)Math.pow(2, number));
						if(number == 0) {
							System.out.println();
							break;
						}
						flag = 1;
					}else {
						System.out.print(" ");
						flag = 0;
					}
				}
			}
		}
	}

}
