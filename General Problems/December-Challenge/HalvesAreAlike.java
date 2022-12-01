/*
1704. Determine if String Halves Are Alike

https://leetcode.com/problems/determine-if-string-halves-are-alike/
*/

class HalvesAreAlike {
    public boolean halvesAreAlike(String s) {
        String first = s.substring(0, s.length()/2).toLowerCase();
        String second = s.substring(s.length()/2, s.length()).toLowerCase();
        int firstCount = 0;
        int secondCount = 0;

        for(int i = 0; i < first.length(); i++){
            char f = first.charAt(i);
            char se = second.charAt(i);
            
            System.out.println(f);
            System.out.println(se);


            if(f == 'a' || f == 'e' || f == 'i' || f == 'o' || f == 'u'){
                firstCount++;
            }

            if(se == 'a' || se == 'e' || se == 'i' || se == 'o' || se == 'u'){
                secondCount++;
            }
        }

        return firstCount == secondCount;
    }
}
