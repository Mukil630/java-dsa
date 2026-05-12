public class BinarySearch {

    public static void main(String[] args) {

        int arr[] = {10,20,30,40,50,60};

        int target = 40;

        int start = 0;
        int end = arr.length - 1;

        boolean found = false;

        while(start <= end) {

            int mid = (start + end) / 2;

            if(arr[mid] == target) {

                System.out.println("Element Found at Index: " + mid);

                found = true;
                break;
            }

            else if(target > arr[mid]) {

                start = mid + 1;
            }

            else {

                end = mid - 1;
            }
        }

        if(!found) {

            System.out.println("Element Not Found");
        }
    }
}
