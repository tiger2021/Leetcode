package Hot100;

/**
 * @ClassName H48旋转图像
 * @Author 小镇做题家
 * @Function:
 */
public class H48旋转图像 {
    /*
    * 解题步骤：
    * （1）先镜像对称（左上到右下）
    * （2）再进行翻转（竖直的边为对称轴）
    * */
    public void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for(int j=0;j<=i;++j){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for(int j=0;j<matrix.length/2;++j){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j]=temp;
            }
        }

    }
}
