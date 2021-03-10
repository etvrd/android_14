public class ArrayCheck {
    private Integer[] arr;

    public ArrayCheck(Integer[] arr) {
        this.arr = arr;
    }

    public boolean getArrCheck (){
        boolean flag = true, flag1 = false, flag4 = false;
        for (Integer integer : arr) {
            if (integer == 1)
                flag1 = true;
            if (integer == 4)
                flag4 = true;
            if (integer != 1 && integer != 4)
                flag = false;
        }
        return (flag && flag1 && flag4);
    }
}