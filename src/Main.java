import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int LinearSearch(String menu[],String order){
        for(int i=0; i< menu.length;i++){
            if(menu[i]==order){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String menu[]={"samosa","idli","menduvada","french fries"};
        String order="samosa" ;

//        int numbers[]={2,3,4,5,6,7,8,12,23};
//        int key=3;
        int index=LinearSearch(menu,order);
        if(index==-1){
            System.out.println(" iteam not found");
        }
        else{
            System.out.println("iteam is at index:"+ index);
        }

    }
}