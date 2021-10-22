Find a path between the pixels

Description :
You are given an array matrix of pixels having values ‘0’ and ‘1’. 
Write a program to identify if there exists a path between the 
coordinates (0,0) and (x,y) in the matrix, given the condition that
you can move only along the ‘1’s. If there is a path between (0,0) and 
the given coordinates then print “ path found” else print “ path not found”.

Constraints : Use a stack for your solution

Input: The codeshould take the five lines of input from the users :
🌟 The first line should be the number of rows in the input pixel matrix.
🌟 The next line should be the number of columns in the pixel matrix.
🌟 The third line should be the elements of the matrix.
🌟 Next take the x-coordinate of the pixel to which the path is to be found as input.
🌟 The y-coordinate of the pixel matrix to which the path is to be found.

Note: 
Input matrix should consist of elements 1 and 0.

Output: Only one line of output which will display "path found" if there exists a path between the given coordinates of the matrix, else "path not found" will be shown.

Sample Test case:
Input :
4
4
1 0 0 0
1 1 0 1
0 1 0 0
1 1 1 1
3
3

Output :
path found

Explanation:
There will 4 rows and 4 columns according to the first two lines of input. 
Next input is a 4*4 matrix of pixel values and then the x and y coordinates of the destination are given. 
The code needs to find if there exists a path between (0,0) and (3,3).

Input :
4                                                                                                                        
4                                                                                                                        
1 0 0 0                                                                                                                  
1 1 0 1                                                                                                                  
0 1 0 0                                                                                                                  
1 1 1 1                                                                                                                  
2                                                                                                                        
3
  
output :
path not found

SOLUTION : 

import java.util.*;

//The basic structure of a node of a stack. move will keep track of the direction in which you can move next.
//If the value of move is 0, move up; similarly, for 1, move left; for 2, move down; for 3, move right; and if the value is 4, you have reached where you started.

public class Source {


    class Node {
        int x, y;
        int move;

        Node(int i, int j) {
            x = i;
            y = j;
            move = 0;
        }
    }

//This method will check if there exists a path between (0,0) and (px, py). Initially, the method is taking the number of rows and columns of the input pixel matrix. 

    public boolean findPath(int n, int m, int[][] pixel, boolean[][] visited, int px, int py) {

        if (n == 0 || m == 0) {
            System.out.println("invalid input");
            System.exit(0);
        }


        //Taking the coordinates of the destination pixel as input

        // Initially starting at (0, 0).

        int i = 0, j = 0;

        Stack<Node> stack = new Stack<Node>();

        Node temp = new Node(i, j);

        stack.push(temp);

        while (!stack.empty()) {

//The node present on the top of the stack will be seen and further steps will be decided according to the
//value of the 'move' it contains.

            temp = stack.peek();
            int d = temp.move;
            i = temp.x;
            j = temp.y;

//Increase the value of move by 1, and accordingly traverse the path in the direction suggested by the value of move.
            temp.move++;
            stack.pop();
            stack.push(temp);

//If the value of x- and y-coordinates have now become equal to the coordinates of the pixel given in the question, return
//true because path exists between them.

            if (i == px && j == py) {
                return true;
            }

            //Moving according to the value of 'move' while making sure that the '0' entry in the matrix is not traversed and no pixel is visited twice.
            if (d == 0) {

                if (i - 1 >= 0 && pixel[i - 1][j] != 0 && visited[i - 1][j]) {

                    Node temp1 = new Node(i - 1, j);
                    visited[i - 1][j] = false;
                    stack.push(temp1);

                }
            }

            // Checking the left direction
            else if (d == 1) {
                if (j - 1 >= 0 && pixel[i][j - 1] != 0 && visited[i][j - 1]) {

                    Node temp1 = new Node(i, j - 1);
                    visited[i][j - 1] = false;
                    stack.push(temp1);

                }
            }

            // Checking the down direction
            else if (d == 2) {
                if (i + 1 < n && pixel[i + 1][j] != 0 && visited[i + 1][j]) {

                    Node temp1 = new Node(i + 1, j);
                    visited[i + 1][j] = false;
                    stack.push(temp1);

                }
            } else if (d == 3) {
                if (j + 1 < m && pixel[i][j + 1] != 0 && visited[i][j + 1]) {

                    Node temp1 = new Node(i, j + 1);
                    visited[i][j + 1] = false;
                    stack.push(temp1);

                }
            } else {

                visited[temp.x][temp.y] = true;
                stack.pop();
            }


        }

        return false;

    }

    public static void main(String[] args) {
        Source obj = new Source();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        boolean[][] visited = new boolean[n][m];

        int[][] pixel = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                visited[i][j] = true;
                pixel[i][j] = in.nextInt();
            }
        }

        int px = in.nextInt();
        int py = in.nextInt();

        if (obj.findPath(n, m, pixel, visited, px, py)) {
            System.out.println("path found");
        } else {
            System.out.println("path not found");
        }

    }
}

