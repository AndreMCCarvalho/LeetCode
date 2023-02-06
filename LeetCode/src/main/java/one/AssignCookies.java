package main.java.one;

public class AssignCookies {

    public static void main(String[] args) {
        new AssignCookies().findContentChildren(new int[]{1,2,3}, new int[]{1,2});
    }

    public int findContentChildren(int[] g, int[] s){
        if (s == null || s.length == 0) return 0;

        int contentChildren = 0;
        int children = 0;
        int cookies = 0;

        while (children < g.length & cookies < s.length) {
            if (g[children] - s[cookies] <= 0) {
                s[cookies] = Math.abs(g[children] - s[cookies]);
                children++;
                contentChildren++;
            }
            else {
                g[children] = Math.abs(g[children] - s[cookies]);
                cookies++;
            }
        }

        return contentChildren;
    }

}
