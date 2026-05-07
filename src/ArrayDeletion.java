public class ArrayDeletion {
    public static void main(String[] args) {
        int[]arr={100,101,102,103,104,105};//Original Array
        System.out.println("Array before deletion:");
        for(int i=0;i<arr.length;i++){//Displaying the above array
            System.out.println(arr[i]);
        }
        int indexPos=3;
        int j=0;
        int[]newArr=new int[arr.length-1];//Creating new Array
        for(int i=0;i<arr.length;i++){//Traversing the array
            if(i==indexPos){//checking if the index number is same as i
                continue;//it will skip the index number(3)
            }
            newArr[j]=arr[i];//it will count j same as i
            j++;//incrementing j
        }
        System.out.println("Array after deletion:");
        for(int no:newArr){//Displaying all new Array
            System.out.println(no+"");
        }
    }
}
