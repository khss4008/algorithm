import java.util.*;
class Solution {
    
    int[] dx = {1,0,-1,0};
    int[] dy = {0,1,0,-1};
    
    public int solution(int[][] maps) {
        int answer = 0;
        
        int[][] visit = new int[maps.length][maps[0].length];
        
        bfs(maps,visit);
        answer = visit[maps.length-1][maps[0].length-1];
        
        if(answer == 0 ) answer = -1;
        
        return answer;
    }
    
    public void bfs(int [][] maps, int[][] visit){
        int x = 0;
        int y = 0;
        visit[x][y] = 1;
        Queue<int[]> queue = new LinkedList();
        queue.add(new int[]{x,y});
        
        while(!queue.isEmpty()){
            int[] cur = queue.remove();
            int curX = cur[0];
            int curY = cur[1];
            
            
            for(int i=0; i<4;i++){
                int nX = curX+dx[i];
                int nY = curY+dy[i];

            
            if(nX < 0 || nX> maps.length-1 || nY < 0 || nY>maps[0].length-1) continue;
            if(visit[nX][nY] == 0 && maps[nX][nY] == 1){
                visit[nX][nY] = visit[curX][curY] + 1;
                queue.add(new int[]{nX,nY});
            }
            }
            
        }
    }
    
}