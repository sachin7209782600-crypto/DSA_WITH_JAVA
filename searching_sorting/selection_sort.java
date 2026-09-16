public class selection_sort {
    public static void main(String[] args) {
          int wow []={2,8,1,9,54,29};
          int smallest=wow[0];
          for (int i = 0; i < wow.length; i++) {
            for (int j = i; j < wow.length; j++) {
               if(smallest>wow[j])
               {
                smallest=wow[j];
                wow[j]=wow[i];
               }
            }
           wow[i]=smallest;
           if(i>wow.length)
           {
               smallest=wow[i+1];
           }
          }
          System.out.println("selection sorted array is:-");
          for (int i = 0; i < wow.length; i++) {
              System.out.print(wow[i]+" ");
          }
    }
}
