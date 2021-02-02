package sist.com.io2;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import sist.com.obj.basic5.Main;

 public  class StreamPractice {
	
	static public void byteStrEx1() {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};  //입력할 배열
		byte[] outSrc = null;				   //출력받을 배열 (받기 위해 비워놓음)
		byte[] temp = new byte[10];			   //임시로 받을 배열 
		
		
		ByteArrayInputStream input = null;	   //넣어줄 파이프 input (비어있다.) 선언
		ByteArrayOutputStream output = null;   //배출할 파이프 output(비어있다.) 선언
		
		input = new ByteArrayInputStream(inSrc); //넣어줄  파이프는 input이며 배열 넣기
		output = new ByteArrayOutputStream();    //배출할 파이프는 output이다 
		
		input.read(temp,0,8);   //temp 라는 배열에 index 0 부터 8개의 배열 읽어 넣어주기 
		output.write(temp,0,5); //temp의 index 0 부터 5개의 배열 출력하기 
		
		
		
		int data = 0;
		
		while((data=input.read())!=-1) { //byte를 하나씩 읽어 data에 넣어준다. 
			output.write(data);		     //byte배열의 끝은 항상 -1
		}
		outSrc = output.toByteArray();
		System.out.println("Input Src: "+Arrays.toString(inSrc)); //배열이니 Arrays.toString으로 읽
		System.out.println("Temp Src: "+Arrays.toString(temp)); //배열이니 Arrays.toString으로 읽
		System.out.println("Output Src: "+Arrays.toString(outSrc)); //temp에서 부터 받은 0~4출력 뒤 input에 남아있는 나머지 것들을 출력
	}
	
	static public void byteStrEx2() {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};  //입력할 배열
		byte[] outSrc = null;				   //출력받을 배열 (받기 위해 비워놓음)
		byte[] temp = new byte[4];			   //임시로 받을 배열 
		
		ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		
		try {
			while(input.available()>0) {
//				input.read(temp);
//				output.write(temp); => 출력 결과는 [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 6, 7]
				//						temp의 마지막 수행 후 2개만을 읽어 드리고 뒷부분 의 6,7은 이전의 것에 남아있기 때문에
				int len = input.read(temp);//왜 int를 사용하냐구? byte배열은끝이 -1이기때문에 ,마지막 갯수를 읽어준다?
				output.write(temp,0,len);  //읽어온 길이 만큼만 
			}
		} catch (IOException e) {
			// TODO: handle exception
		}
		
		outSrc = output.toByteArray();
		
		System.out.println("Input Src: "+Arrays.toString(inSrc)); //배열이니 Arrays.toString으로 읽
		System.out.println("Temp Src: "+Arrays.toString(temp)); 
		System.out.println("Output Src: "+Arrays.toString(outSrc)); //temp에서 부터 받은 0~4출력 뒤 input에 남아있는 나머지 것들을 출력
		
		
		
	}
	public static void main(String[] args) {
	//	byteStrEx1();
	//	byteStrEx2();
		
	}
}
 
 
	 
 

 
