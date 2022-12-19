package test;

import java.util.*;
interface ISignUp{
	// 检查是否有 n对应的班级名额
    // 如果没有剩余名额，请返回 false ，否则学生将报名进入该班级并返回 true
	public void addStudent(int n);
}
interface IParams{
	public int getBig();//大班名额
	public int getMedium();//中班名额
	public int getSmall();//小班名额
	public void getPlanSignUp(int n);
}
public  class SchoolSystem implements ISignUp,IParams {
	int Big;//大
	int Medium;//中
	int Small;//小
	int arr[];
	
 
	public int getBig() {
		Scanner in=new Scanner(System.in);
		System.out.print("大班目前剩余的名额为：");
		Big=in.nextInt();
		return Big;
	}
	public int getMedium() {
		Scanner in=new Scanner(System.in);
		System.out.print("中班目前剩余的名额为：");
		Medium=in.nextInt();
		return Medium;
	}
	public int getSmall() {
		Scanner in=new Scanner(System.in);
		System.out.print("小班目前剩余的名额为：");
		Small=in.nextInt();
		return Small;
	}
	public void getPlanSignUp(int n) {
		Scanner in=new Scanner(System.in);
		arr=new int[n];
		System.out.print("1,2,3分别代表大小班\n");
		System.out.print("请输入今年入学的学生各自报名的班别：\n");
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
   		}
	}
	public void addStudent(int n) {
		System.out.print("学生报名入学的结果为：");
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
		System.out.println("恭喜入学成功");
	}
    public static void main(String args[]) {
    	Scanner in=new Scanner(System.in);
    	SchoolSystem sc=new SchoolSystem();
    	System.out.print("请输入今年入学的学生总体人数为：");
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