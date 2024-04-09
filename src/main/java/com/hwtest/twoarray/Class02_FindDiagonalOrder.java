package com.hwtest.twoarray;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-06 1:13
 * @usage 1. 对角线条数:row+col-1
 * 2. 对角线编号为偶数,左下右上遍历,为奇数,右上左下遍历
 * 3. 当向上遍历时,行索引-1,列索引+1,直到矩阵边缘为止
 * 当i<row,对角线遍历的起点位置 i,0
 * 当i>=row,对角线遍历的起点位置为(row-1,i-row+1)
 * 4. 当向下遍历时,行索引+1,列索引-1
 * 当i<col,对角线遍历的起点位置为(0,i)
 * 当i>=col,对角线遍历的起点位置为(i-col+1,col-1)
 */
public class Class02_FindDiagonalOrder {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};
        for (int i : getSum(arr)) {
            System.out.println(i);
        }
    }

    public static int[] getSum(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int[] res = new int[row * col];
        int pos = 0;
        for (int i = 0; i < row + col - 1; i++) {
            if (i % 2 == 0) {
                int x = i < row ? i : row - 1;
                int y = i < row ? 0 : i - row + 1;
                while (x >= 0 && y < col) {
                    res[pos] = mat[x][y];
                    pos++;
                    x--;
                    y++;
                }
            } else {
                int x = i < col ? 0 : i - col + 1;
                int y = i < col ? i : col - 1;
                while (x < row && y >= 0) {
                    res[pos] = mat[x][y];
                    pos++;
                    x++;
                    y--;
                }
            }
        }
        return res;
    }
}
