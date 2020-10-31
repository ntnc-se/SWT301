/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codelearn;

/**
 *
 * @author gf63
 */
public class NewClass {
    
    static int[][] boxBlur(int[][] image) {
    int[][] result = new int[image.length - 2][image[0].length - 2];
    for (int i = 0;i < result.length; i++)
        for (int j = 0; j < result[i].length; j++){
            result[i][j] = 0;
            for (int u = i; u <= i + 2; u++)
                for (int v = j; v <= j + 2; v++)
                    result[i][j] += image[u][v];
            result[i][j] = Math.floorDiv(result[i][j], 9);
        }
    
    return result;
}


    
    public static void main(String[] args) {
        /* Hahaaaaaa tao hay vai lonn
    }
}
