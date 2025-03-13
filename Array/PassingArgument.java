package Array;



public class PassingArgument {
    public static void update(int mark []) {
        for(int i = 0 ; i < mark.length; i++){
            mark[i] = mark[i]+1;
        }
    }
    public static void main(String[] args) {
        int mark[] = {97,98,99};

        //update
        update(mark);

        for(int i = 0 ; i < mark.length; i++){
            System.out.println(mark[i]+ " ");
        }
    }
}
