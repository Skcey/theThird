package theThirdWork;

import java.util.Scanner;

public class ShowPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of lines: ");
		int line = input.nextInt(); //金字塔行数
		int column = (line * 2 - 1) * 2 - 1; //金字塔列数
		
		for(int i=1;i<=line;i++) {
			int flag = 0;
			int number = i;
			for(int j=1;j<=column;j++) {
				//金字塔左边部分的空白
				if(j <= (line * 2 - 1)-(i * 2 - 1)) {
					System.out.print(" ");
				}
				//金字塔左边到中间的数字和空格的打印
				else if(j <= line * 2 - 1){
					if(flag == 0) { //判断打印空格还是数字
						System.out.print(number);
						if(number!=1)number--; //确保金字塔右边能从1加起
						flag = 1;
					}else {
						System.out.print(" ");
						flag = 0;
					}
					if(i == 1) {
						System.out.println();
						break;
					}
				}
				//金字塔右边的打印
				else {
					if(flag == 0) {
						number++;
						System.out.print(number);
						flag = 1;
						if(number == i) {
							System.out.println(); //打印到一定大小时结束改行打印，不再输出空格直接空行
							break;
						}
					}else {
						System.out.print(" ");
						flag = 0;
						}
					}
				}
				
			}
		}
		
}
