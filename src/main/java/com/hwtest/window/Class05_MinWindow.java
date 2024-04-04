package com.hwtest.window;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-05 0:44
 * @usage
 */
public class Class05_MinWindow {
    public static void main(String[] args) {
        System.out.println(minWindow("adcgssc", "cs"));
    }
    public static String minWindow(String S, String T) {
        //准备工作
        char[] s = S.toCharArray();
        char[] t = T.toCharArray();
        int[] cnt = new int[128]; // 用于存储字符串 T 中每个字符的出现次数
        int count = 0; // 用于记录需匹配的字符数的变量
        for(int i = 0; i < t.length; i++){
            cnt[t[i] - 'A']++;
            count++;
        }
        //核心代码
        int l = 0, start = -1, end = s.length;
        for(int r = 0; r < s.length; r++){
            // 当遇到 S 中的字符时，检查并更新计数数组
            if(--cnt[s[r] - 'A'] >= 0){
                count--; // 减少需要匹配的字符计数
            }
            //当count为0时，说明已经全部匹配完成，接下来就是右移左指针寻找最小字符串
            while(count == 0){
                //此时左指针不能继续收缩
                if (++cnt[s[l] - 'A'] > 0) {
                    //记录下标
                    if(r - l < end - start){
                        start = l;
                        end = r;
                    }
                    count++; // 增加计数，接下来l++后，一个字符将不再包含在窗口中
                }
                l++;
            }
        }
        // 返回最小窗口子串，如果没有找到有效窗口，则返回空字符串
        return start == -1 ? "" : S.substring(start, end + 1);
    }

}
