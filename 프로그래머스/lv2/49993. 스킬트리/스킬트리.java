class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        //배열 개수만큼 돌기
        for(String tree : skill_trees){
            //문자열 길이만큼 돌기
            
            //StringBuilder 만들기
            StringBuilder sb = new StringBuilder(tree);
            String newTree = "";
            for(int i=0; i<tree.length();i++){
                //스킬트리 길이만큼 돌기
                for(int j=0; j<skill.length();j++){
                    if(skill.charAt(j) == tree.charAt(i)){
                        newTree+=String.valueOf(tree.charAt(i));
                        break;
                    }
                }
            }
            System.out.println("뉴트리 =>"+newTree);
            boolean[] check = new boolean[newTree.length()];
            for(int i=0; i<check.length;i++){
                check[i] = true;
            }
            
            // for(int i=0; i<newTree.length;i++){
            //     if(newTree.charAt(i) != skill.charAt(i))
            // }
            if(skill.indexOf(newTree)==0) answer++;
        }
        //
        
        return answer;
    }
}