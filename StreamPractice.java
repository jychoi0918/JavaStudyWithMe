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
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};  //�Է��� �迭
		byte[] outSrc = null;				   //��¹��� �迭 (�ޱ� ���� �������)
		byte[] temp = new byte[10];			   //�ӽ÷� ���� �迭 
		
		
		ByteArrayInputStream input = null;	   //�־��� ������ input (����ִ�.) ����
		ByteArrayOutputStream output = null;   //������ ������ output(����ִ�.) ����
		
		input = new ByteArrayInputStream(inSrc); //�־���  �������� input�̸� �迭 �ֱ�
		output = new ByteArrayOutputStream();    //������ �������� output�̴� 
		
		input.read(temp,0,8);   //temp ��� �迭�� index 0 ���� 8���� �迭 �о� �־��ֱ� 
		output.write(temp,0,5); //temp�� index 0 ���� 5���� �迭 ����ϱ� 
		
		
		
		int data = 0;
		
		while((data=input.read())!=-1) { //byte�� �ϳ��� �о� data�� �־��ش�. 
			output.write(data);		     //byte�迭�� ���� �׻� -1
		}
		outSrc = output.toByteArray();
		System.out.println("Input Src: "+Arrays.toString(inSrc)); //�迭�̴� Arrays.toString���� ��
		System.out.println("Temp Src: "+Arrays.toString(temp)); //�迭�̴� Arrays.toString���� ��
		System.out.println("Output Src: "+Arrays.toString(outSrc)); //temp���� ���� ���� 0~4��� �� input�� �����ִ� ������ �͵��� ���
	}
	
	static public void byteStrEx2() {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};  //�Է��� �迭
		byte[] outSrc = null;				   //��¹��� �迭 (�ޱ� ���� �������)
		byte[] temp = new byte[4];			   //�ӽ÷� ���� �迭 
		
		ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		
		try {
			while(input.available()>0) {
//				input.read(temp);
//				output.write(temp); => ��� ����� [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 6, 7]
				//						temp�� ������ ���� �� 2������ �о� �帮�� �޺κ� �� 6,7�� ������ �Ϳ� �����ֱ� ������
				int len = input.read(temp);//�� int�� ����ϳı�? byte�迭������ -1�̱⶧���� ,������ ������ �о��ش�?
				output.write(temp,0,len);  //�о�� ���� ��ŭ�� 
			}
		} catch (IOException e) {
			// TODO: handle exception
		}
		
		outSrc = output.toByteArray();
		
		System.out.println("Input Src: "+Arrays.toString(inSrc)); //�迭�̴� Arrays.toString���� ��
		System.out.println("Temp Src: "+Arrays.toString(temp)); 
		System.out.println("Output Src: "+Arrays.toString(outSrc)); //temp���� ���� ���� 0~4��� �� input�� �����ִ� ������ �͵��� ���
		
		
		
	}
	public static void main(String[] args) {
	//	byteStrEx1();
	//	byteStrEx2();
		
	}
}
 
 
	 
 

 
