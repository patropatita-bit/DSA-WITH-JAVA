class Solution {
    public String restoreString(String s, int[] indices) {
         
        Map<Integer,String> m=new HashMap<>();
        for(int i=0;i<s.length();i++){

            m.put(indices[i],String.valueOf(s.charAt(i)));
        }
       
       StringBuilder sb=new StringBuilder();

    for(int i=0;i<s.length();i++){

        sb.append(m.get(i));
    }

return sb.toString();
 }
}