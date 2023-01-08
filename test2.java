public class test2 {
    public static void main(String[] args) {
        double[] myList = {2,3,4,5,6,7,8,9};
        int sum = 0;
        double max = myList[0];
        for(int i = 0; i < myList.length; i++){
            sum += myList[i];
            if(myList[i] > max){
                max = myList[i];
            }
        }
        System.out.println(sum);
        int max1 = (int) max;
        System.out.println(max1);
    }
}
