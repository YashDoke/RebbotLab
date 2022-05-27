public class ArrayPrograms {

    public void printArray(int[] arr1){
        System.out.print("Array: ");
        for(int i=0; i<arr1.length; i++){
        System.out.print(arr1[i]+" ");
        }   
    }
        public void arraySum(int[] arr1){
            int sum = 0;
            for(int i=0; i<arr1.length; i++){
                sum = sum + arr1[i];
            }
            System.out.println("\nSum: "+sum);
        

        }
        public void arrayAverage(int[] arr1){
            int sum = 0;
            for(int i=0; i<arr1.length; i++){
                sum = sum + arr1[i];
            }
            System.out.println("Average: "+sum/arr1.length);
        }

        public void arrayMax(int[] arr2){
            int max = arr2[0];
            for(int i=0; i<arr2.length; i++){
                if(arr2[i]>max){
                    max = arr2[i];
                }
            }
            System.out.println("Max: "+max);
        }

        public void arrayMin(int[] arr2){
            int min = arr2[0];
            for(int i=0; i<arr2.length; i++){
                if(arr2[i]<min){
                    min = arr2[i];
                }
            }
            System.out.println("Min: "+min);
        }

        public void arrayReverse(int[] arr1){
            int[] arr3 = new int[arr1.length];
            for(int i=0;i<arr1.length;i++){
                arr3[i] = arr1[arr1.length-1-i];
            }
            System.out.print("Reverse: ");
            for(int i =0;i<arr3.length;i++){
                System.out.print(arr3[i]+" ");
            }
        }
    
        

    public static void main(String[] args) {
        int arr1[] = {10,20,30,40,50,60};
        int arr2[] = {11,45,26,12,43,56};

        ArrayPrograms obj = new ArrayPrograms();
        obj.printArray(arr1);
        obj.arraySum(arr1);
        obj.arrayAverage(arr2);
        obj.arrayMax(arr2);
        obj.arrayMin(arr2);
        obj.arrayReverse(arr1);
    }

}
