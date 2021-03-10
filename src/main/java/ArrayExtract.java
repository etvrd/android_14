import java.util.ArrayList;

public class ArrayExtract {
    private Integer[] arr;
    private ArrayList <Integer> newArr = new ArrayList<>();

    public ArrayExtract(Integer[] arr) {
        this.arr = arr;
    }

    public ArrayList<Integer> getNewArr (){
        boolean flag = false, lastNum = false;
        try{
            for (int i : arr) {
                if (i == 4){
                    if (flag) lastNum = true;
                    flag = true;
                }
                if (flag && !lastNum && i != 4){
                    newArr.add(i);
                }
                if (flag && lastNum){
                    newArr.clear();
                    lastNum = false;
                }
            }
            if (!flag){
                throw new RuntimeException("В массиве должна быть хотя бы одна четверка.");
            }
        } catch (RuntimeException e){
            e.printStackTrace();
        }
        return newArr;
    }
}

