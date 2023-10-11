package Q3040;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int[] arr = new int[9];
		boolean flag = false;
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


		for (int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
			a += arr[i];
		}
		// 모든 값을 던한뒤 값을 찾기

		int b = a - 100;
		
		boolean d = b == 0;

		for (int k = 0; k < arr.length; k++) {
			for (int j = k + 1; j < arr.length; j++) {
				// 두 요소의 합이 list에 존재하지 않으면 담기
				if (b == (arr[k] + arr[j])) {
					arr[j] = arr[k] = -1;
					
					break;
				}
			}
		}
	    for (int i = 0; i < 9; i++) {
	         if (arr[i] != -1) {
	            bw.write(String.valueOf(arr[i]));
	            bw.newLine();
	         }
	      }

		
	      bw.flush();
	      bw.close();
	      br.close();

		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
		System.out.println(Arrays.toString(arr));                                                                                                                                                                          

	}

}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               