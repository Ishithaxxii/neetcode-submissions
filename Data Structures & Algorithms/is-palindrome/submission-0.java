class Solution {
    public boolean isPalindrome(String s) 
    {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int left = 0;
        int right = s.length()-1;

        while(left<right)
        {
            char l = s.charAt(left);
            char r = s.charAt(right);

            if(l != r)
            {
                return false;
            }
            left ++;
            right --;
        }

        return true;
    }
}
