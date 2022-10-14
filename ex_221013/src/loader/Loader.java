package loader;



import front.Front;

public class Loader {

	public static void main(String[] args) {

		Front frontend = new Front();

		frontend.aaa();

//		System.out.print("구구단 입력 : \n");
//		int num = sc.nextInt(); sc.nextLine();
//		for(int index=0;index<roomLength;index++){
//			storage[index] = num*(index+1);
//			
//			System.out.println(num+" x "+ (index+1)+" = "+storage[index]);
//		}
		
		int roomLength = 9;
		int[] storage = new int[roomLength];
		
		int[] root = new int[2];
		root[0] = 3;
		root[1] = 9;

		for (int gugu = root[0]; gugu < root[1] + 1; gugu++) {

			for (int index = 0; index < roomLength; index++) {
				storage[index] = gugu * (index + 1);

				System.out.print(gugu + "단\n");
				System.out.println(gugu + " x " + (index + 1) + " = " + storage[index]);
			}

		}

	}

}
