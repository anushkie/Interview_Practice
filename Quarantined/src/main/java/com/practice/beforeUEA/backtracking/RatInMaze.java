package com.practice.beforeUEA.backtracking;

import java.util.Scanner;

public class RatInMaze {

    private int maze[][];
    int x0,y0, xf,yf;
    int N, count;
    String s;
    boolean b;

    RatInMaze(int N, int x0, int y0, int xf, int yf){
        this.N = N; this.x0 = x0; this.y0 = y0;
        this.xf = xf; this.yf=yf;

        maze = new int[N][N];
        s="";
        count = 1;
        b=false;
    }

    boolean IsSafe(int x, int y){
        if(x>=0 && x<N && y>=0 && y<N && maze[x][y]==1)
            return true;
        return false;
    }

    void Move(int x, int y){
        String s1, s2, backup_s;
        s1=Integer.toString(x);
        s2 = Integer.toString(y);
        s = s+"("+s1+","+s2+"),";
        backup_s = s;
        // if we arrive at the destination, print path
        if(x==xf && y==yf){
            System.out.println("Path["+count+"]="+s);
            count++;
            b=true;
        }
        if(IsSafe(x,y+1)){ s=backup_s; Move(x,y+1);}
        if(IsSafe(x+1,y)){ s=backup_s; Move(x+1,y);}

    }

    public static void main(String[] args){
        int N, x0, y0, xf, yf;
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter N, x0, y0, xf, yf respectively: ");
        N = s.nextInt();
        x0= s.nextInt();
        y0= s.nextInt();
        xf= s.nextInt();
        yf= s.nextInt();
        int n;
        RatInMaze m = new RatInMaze(N,x0, y0,xf,yf);
        System.out.println("Now enter the maze elements: ");
        for(int i=0; i<N; i++)
            for(int j=0; j<N; j++)
            {
                n=s.nextInt();
                m.maze[i][j] = n;
            }
        m.Move(x0, y0);
        if(m.b==false){ System.out.println("No solution is possible! :'("); }
    }



}
