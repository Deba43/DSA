package Sorting;

import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        int children[] = { 1, 2 };
        int cookies[] = { 1, 2, 3 };
        System.out.println(findContentChildren(children, cookies));
    }

    public static int findContentChildren(int[] children, int[] cookies) {
        Arrays.sort(children);
        Arrays.sort(cookies);

        int child = 0;
        for (int cookie = 0; child < children.length && cookie < cookies.length; cookie++) {
            if (cookies[cookie] >= children[child]) {
                child++;
            }
        }

        return child;
    }

}
