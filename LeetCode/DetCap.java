class DetCap {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        String word2 = word.toLowerCase();
        int k = 0;

        for (int i = 0; i < n; i++) {
            char ch1 = word.charAt(i);
            char ch2 = word2.charAt(i);

            if ((ch2 - ch1) == 32) k++;
        }

        if (k == 0) return true;
        if (k == n) return true;
        if (k == 1 && Character.isUpperCase(word.charAt(0))) return true;

        return false;
    }
}
