package test;

import java.util.*;
interface ISignUp{
	// ����Ƿ��� n��Ӧ�İ༶����
    // ���û��ʣ������뷵�� false ������ѧ������������ð༶������ true
	public void addStudent(int n);
}
interface IParams{
	public int getBig();//�������
	public int getMedium();//�а�����
	public int getSmall();//С������
	public void getPlanSignUp(int n);
}
public  class SchoolSystem implements ISignUp,IParams {
	int Big;//��
	int Medium;//��
	int Small;//С
	int arr[];
	
 
	public int getBig() {
		Scanner in=new Scanner(System.in);
		System.out.print("���Ŀǰʣ�������Ϊ��");
		Big=in.nextInt();
		return Big;
	}
	public int getMedium() {
		Scanner in=new Scanner(System.in);
		System.out.print("�а�Ŀǰʣ�������Ϊ��");
		Medium=in.nextInt();
		return Medium;
	}
	public int getSmall() {
		Scanner in=new Scanner(System.in);
		System.out.print("С��Ŀǰʣ�������Ϊ��");
		Small=in.nextInt();
		return Small;
	}
	public void getPlanSignUp(int n) {
		Scanner in=new Scanner(System.in);
		arr=new int[n];
		System.out.print("1,2,3�ֱ�����С��\n");
		System.out.print("�����������ѧ��ѧ�����Ա����İ��\n");
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
   		}
	}
	public void addStudent(int n) {
		System.out.print("ѧ��������ѧ�Ľ��Ϊ��");
		for(int i=0;i<n;i++) {
			if(arr[i]==1) {
				if(Big>0) {
					Big=Big-1;
					System.out.print(true+" ");
				}
				else
					System.out.print(false+" ");
			}
			if(arr[i]==2) {
				if(Medium>0) {
					Medium=Medium-1;
					System.out.print(true+" ");
				}
				else
					System.out.print(false+" ");
			}
			if(arr[i]==3) {
				if(Small>0) {
					Small=Small-1;
					System.out.print(true+" ");
				}
				else
					System.out.print(false+" ");
			}
		}
	}
	
	public void ruxue() {
		System.out.println("��ϲ��ѧ�ɹ�");
	}
    public static void main(String args[]) {
    	Scanner in=new Scanner(System.in);
    	SchoolSystem sc=new SchoolSystem();
    	System.out.print("�����������ѧ��ѧ����������Ϊ��");
    	int n=in.nextInt();
    	sc.getPlanSignUp(n);
    	sc.getBig();
    	sc.getMedium();
    	sc.getSmall();
    	sc.addStudent(n);
    	sc.ruxue();
    	in.close();
    }
}