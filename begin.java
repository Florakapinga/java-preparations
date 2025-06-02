class begin{

    public static void main(String[] args) {

        //declare and initialize a 3*3 2D array with interger from 1 to 9

        int[][] matrix={

            { 1,2,3},
            {4,5,6},
            { 7,8,9}
        };
//program to print a 2D array
for(int i=0; i< matrix.length; i++){
for (int j=0; j<matrix [i].length;j++){

    System.out.println(matrix [i][j] +"");
}

}
// find the sum of all elements in a 2D arrays

int sum =0;
for(int []row:matrix){
    for (int num : row ){
        sum+=num;
    }

}
System.out.println("sum: " +sum);
//find the maximum element in the 2D array
int max=matrix[0][0];
for (int[] row :matrix){
    for (int num : row){
        if (num >max){
            max=num;
        }
    }
}
System.out.println("Max: "+ max);

//transponse a 2D matrix

int [][] transpose = new int[3][3];
for (int i=0; i<3; i++){
    for (int j =0;j <3; j++){
transpose[j][i]=matrix[i][j];
    }
}
// multiply two 2D matrices
int [][] a= matrix ;
int [][] b= matrix;
int [][] result =new int [3][3];
for(int i=0; i<3 ; i++){
for (int j=0;j<3;j++){
    for(int k= 0; k<3; k++){
        result[i][j] += a[i][k] *b[k] [j];
    }
}
}

    }

}