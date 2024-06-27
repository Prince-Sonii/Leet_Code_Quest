import java.util.Arrays;

class Day37 {
    //Qno. 455 Assign Cookies
    //Solution
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int ig=0;
        int is=0;
        int count=0;
        while(ig<g.length && is<s.length) {
            if(g[ig]<s[is]) {
                ig++;
                is++;
                count++;
            } else if(s[is]<g[ig]) {
                is++;
            } else {
                count++;
                ig++;
                is++;
            }
        }
        return count;
    }
}