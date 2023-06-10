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
        String word = getString();
        if(word == null)
            return false;

        boolean detectionCapUseFlag = false;

        int wordLen = word.length();
        int firstLetterCapCount =  0;
        int rightCaseCapsCount =  0;


        if (Character.isUpperCase(word.charAt(0)))
            firstLetterCapCount++;

        for(int i = 1 ; i < wordLen; i++) {
            if (Character.isUpperCase(word.charAt(i)))
                rightCaseCapsCount++;
        }
        //case one
        if((rightCaseCapsCount+firstLetterCapCount )== wordLen || rightCaseCapsCount == 0) {
            detectionCapUseFlag = true;
        }else if ((firstLetterCapCount+rightCaseCapsCount) == 1){
            detectionCapUseFlag = true;
        }else {
        // do nothing
        }
            return detectionCapUseFlag;
    }

}

