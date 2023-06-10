public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        boolean detectionCapUseFlag = false;
        String word = getString();
        int wordLen = word.length();
        int rightCaseCapsCount =  0;
        for(int i = 0 ; i < wordLen; i++) {
            if (Character.isUpperCase(word.charAt(i)))
                rightCaseCapsCount++;
        }
        //case one
        if(rightCaseCapsCount == wordLen) {
            detectionCapUseFlag = true;
        }
        return detectionCapUseFlag;
    }

}

