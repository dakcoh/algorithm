import java.io.*;

class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        int videoLen = toSec(video_len);
        int posTime = toSec(pos);
        int opStart = toSec(op_start);
        int opEnd = toSec(op_end);

        if (opStart <= posTime && posTime <= opEnd)
            posTime = opEnd;
        
        for (String s : commands) {
            if (s.equals("next")) {
                posTime += 10;
                if(videoLen < posTime)
                    posTime = videoLen;
            } else if (s.equals("prev")) {
                if ((posTime - 10) < 0) 
                    posTime = 0;
                else
                    posTime -= 10;
                
            }

            if (opStart <= posTime && posTime <= opEnd)
                posTime = opEnd;

        }
        answer = toFomatTime(posTime);

        return answer;
    }

    public static int toSec(String time) {
        String[] part = time.split(":");
        return Integer.parseInt(part[0]) * 60 + Integer.parseInt(part[1]);
    }

    public static String toFomatTime(int time) {
        int min = time / 60;
        int sec = time % 60;

        return String.format("%02d:%02d", min, sec);
    }
}