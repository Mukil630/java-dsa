public class MoveZeros {

    public static void main(String[] args) {

        int arr[] = {1,0,2,0,4,0,5};

        int index = 0;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] != 0) {

                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;

                index++;
            }
        }

        System.out.println("Array After Moving Zeros:");

        for(int num : arr) {

            System.out.print(num + " ");
        }
    }
}
