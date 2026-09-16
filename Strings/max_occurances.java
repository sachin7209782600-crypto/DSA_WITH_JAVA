public class max_occurances {
    public static void main(String[] args) {
        String sc="abcabdcbadcba";
        int i=0,c=0;
        char ch;
        for (int j = 0; j < sc.length(); j++) {
            int count=0;
            for (int j2 = j+1; j2 < sc.length(); j2++) {
                if(sc.charAt(i)==sc.charAt(j))
                {
                  count++;
                }
                c=Math.max(count, c);
                if(count>c)
                {
                    ch=sc.charAt(j);
                }
            }
        }
    }
}
