package EasyTasks;

public class Task14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        boolean notTheSame = false;
        int countLetter = 0;
        int minCountLetterArr = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < minCountLetterArr) {
                minCountLetterArr = strs[i].length();
            }
        }
        if(minCountLetterArr == 0){return "";}
        while (!notTheSame && countLetter < minCountLetterArr) {
            for (int i = 0; i < strs.length - 1; i++) {
                if (strs[i].charAt(countLetter) != strs[i + 1].charAt(countLetter)) {
                    return strs[0].substring(0,countLetter);
                }
            }
            countLetter++;
        }


        return strs[0].substring(0,countLetter);
    }
}
