package youer;
import java.util.*;
interface ISignUp{
	// ����Ƿ��� n��Ӧ�İ༶����
    // ���û��ʣ������뷵�� false ������ѧ������������ð༶������ true
	public void addStudent(int n);
}
interface IParams{
	public int getBig();
	public int getMedium();
	public int getSmall();
	public void getPlanSignUp(int n);
}
public  class SchoolSystem implements ISignUp,IParams {
	int Big;
	int Medium;
	int Small;
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
					System.out.print(false+" \n");
			}
		}
	}
	public void shengyu(int n) {
		int sum1=0,sum2=0,sum3=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==1) {
				sum1=sum1+1;
			}
			if(arr[i]==2) {
				sum2=sum2+1;
			}
			if(arr[i]==3) {
				sum3=sum3+1;
		}
		}
		if(Big>sum1) {
			int a=Big-sum1;
			System.out.println("��໹����ѧ��"+a);
		}	
		else System.out.println("��໹����ѧ��0");
		if(Medium>sum2) {
			int b=Medium-sum2;
			System.out.println("�а໹����ѧ��"+b);
		}	
		else System.out.println("�а໹����ѧ��0");
		if(Small>sum3) {
			int c=Small-sum3;
			System.out.println("С�໹����ѧ��"+c);
		}	
		else System.out.println("С�໹����ѧ��0");
		
		
		
		
		
		
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
    	
    	sc.shengyu(n);
    	sc.addStudent(n);
    	in.close();
    }
}