import java.util.Arrays;

class Solution {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int a = 0; a < commands.length; a++) {
            int[] sort = new int[commands[a][1]-commands[a][0]+1];
            int cnt = 0;
            for (int b = commands[a][0]-1; b < commands[a][1]; b++) {
                sort[cnt]=array[b];
                cnt++;
            }
            Arrays.sort(sort);
            answer[a] = sort[commands[a][2]-1];
        }
        return answer;
    }
    public static void main(String[] args){
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {
                {2, 5, 3},
                {4, 4, 1},
                {1, 7, 3}
        };
        int[] result =  solution(array, commands);
        for (int i = 0; i <result.length; i++) {
            System.out.println(result[i]);
        }
    }
}