public class State {

    State parent;
    int lastMove;
    int x,y;

    public State(){

    }

    //constructor
    public State(int x, int y){

    }

    public boolean isSolved(){
        if(x==MWIDTH-1 && y==MHEIGHT-1){
            return true
        }else{
            return false;
        }

    }

    public Boolean canMove(int direction) {
        return ((maze[x][y] & direction) == 0);
    }


    public allmoves(){
        //get from 8puzzle.java
    }

    public State move(){
        State child = new State(x,y);
    }

    public State getParent(){ return parent; }
    public int getX(){ return x; }
    public int getY(){ return y; }
    public int getLastMove(){return lastMove;}


    public void setParent(State parent){this.parent = parent;}
    public void setX(int x){this.x = x;}
    public void setY(int y){this.y = y;}
    public void setLastMove(int lastMove){this.lastMove = lastMove;}

}
 //boolean[][] visited=new boolean[MWIDTH][MHEIGHT] <-- belongs in Maze.dfs()