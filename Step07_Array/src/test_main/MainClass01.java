package test_main;

public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		//int type 5개를 저장하고 있는 배열
		int[] nums={10, 20, 30, 40, 50};
		//double type 5개를 저장하고 있는 배열
		double[] nums2={10.1, 10.2, 10.3, 10.4, 10.5};
		//boolean type 5개를 저장하고 있는 배열
		boolean[] truth={true, false, false, true, true};
		//String type (참조데이터 type) 5개를 저장하고 있는 배열
		String[] names={"김구라", "해골", "원숭이", "주뎅이", "덩어리"};
		
		//배열의 각각의 방 참조하기
		int result1=nums[0]; //10
		double result2=nums2[1]; //10.2
		boolean result3=truth[2]; //false
		String result4=names[3]; //"주뎅이"
		
		//nums 배열을 복제해서 새로운 배열을 얻어내서 a에 대입하기
		int[] a=nums.clone();
		//nums 안에 있는 배열의 참조값을 b에 대입하기
		int[] b=nums;
		
		//배열의 방의 갯수
		int size=nums.length;
	}
}
