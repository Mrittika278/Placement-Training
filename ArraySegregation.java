import java.util.*;
public class ArraySegregation {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers (-1) :");
        
        while(true)
        {
           int elem = sc.nextInt();
           if(elem == -1)
           {
              break;
           }
           list.add(elem);
           
        }
        System.out.println(list);
        int tgetidx = 0;
        for(int i = 0;i < list.size();i++)
        {
            if(list.get(i) % 10 != 0)
            {
                int odd = list.remove(i);
                list.add(tgetidx,odd);
                tgetidx++;
                
            }
        }
        
        System.out.println(list);

    }
}

    

