public class State {

    State parent;
    int lastMove;
    int x,y;
    final int UP=1,DOWN=2,LEFT=3,RIGHT=4;
    public static final int MWIDTH=30,MHEIGHT=30,BLOCK=20;

    public State(){

    }

    //constructor
    public State(int x, int y){
        this.x = x;
        this.y = y;
    }



    public boolean isSolved(){
        if(x==MWIDTH-1 && y==MHEIGHT-1){
            return true
        }else{
            return false;
        }

    }



    public State[] adjacentStates()
    {
        //go through each valid direction, get the state, make an array of these, return it
        int[] dirs=allMoves();
        //make an array of states, same size
        State[] adj=new State[dirs.length];
        //call move on each valid direction
        for(int i=0; i<dirs.length; i++)
            adj[i]=move(dirs[i]);
        return adj;
    }


    public int[] allMoves()
    {
        //let's count how many moves we can have
        int count=0;
        if(canMove(UP)) count++;
        if(canMove(DOWN)) count++;
        if(canMove(LEFT)) count++;
        if(canMove(RIGHT)) count++;

        //make the array
        int[] moves=new int[count];

//suppose my valid moves were DOWN,LEFT  DOWN at index 0, LEFT at index 1
        //say moves[0]=DOWN, moves[1]=LEFT

        //put them in the array (order is arbitrary)
        count=0;
        if(canMove(UP)) moves[count++]=UP;
        if(canMove(DOWN)) moves[count++]=DOWN;
        if(canMove(LEFT)) moves[count++]=LEFT;
        if(canMove(RIGHT)) moves[count++]=RIGHT;

        return moves;
    }

}

 //boolean[][] visited=new boolean[MWIDTH][MHEIGHT] <-- belongs in Maze.dfs()