class Solution {
    public String convert(String s, int numRows) {
        if(s.length() == 0 || numRows==1 || numRows >=s.length())
        {
            return s;
        }

        StringBuilder[] rows = new StringBuilder[numRows];
        for( int i = 0; i<numRows; i++)
        {
            rows[i] = new StringBuilder();
        }

        int currentrow = 0;
        Boolean goingdown = false;

        for(int i = 0;i<s.length();i++)
        {
            rows[currentrow].append(s.charAt(i));
            if(currentrow==0 || currentrow == numRows-1)
            {
                goingdown = !goingdown;
            }

            if(goingdown)
            {
                currentrow++;
            }
            else
            {
                currentrow--;
            }
        }
        StringBuilder result = new StringBuilder();
        for( StringBuilder row : rows)
        {
            result.append(row);
        }
        return result.toString();

    }
}
