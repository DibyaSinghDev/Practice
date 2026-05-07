public class ArrayInsertion {
    public static void main(String[] args) {
        int[]arr={100,101,102,103,104,105};//Original Array
        System.out.println("Array before insertion:");
        for(int i=0;i<arr.length;i++){//Displaying the mentioned array above
            System.out.println(arr[i]);
        }
        int indexPos=1;
        int element=110;
        int[]newArr=new int[arr.length+1];//Creating new Array
        for(int i=0;i<indexPos;i++){//Copy & pasting all the elements till IndexPosition(1)
            newArr[i]=arr[i];
        }
        newArr[indexPos]=element;//Inserting the particular element at the index number(1)
        for(int i=indexPos;i<arr.length;i++){//Copy & pasting all the remaining elements
            newArr[i+1]=arr[i];
        }
        System.out.println("Array after insertion:");
        for(int no:newArr){//Traversing all the elements of new Array
            System.out.println(no+"");
        }
    }
}
