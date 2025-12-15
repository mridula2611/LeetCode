class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        boolean bulky =false;
        boolean heavy =false;
        long vol = 1L*width*length*height;
        if(length >= 10000 || width >= 10000 || height >= 1000 || vol>=1000000000){
            bulky = true;
        }
        if(mass>=100)
         heavy = true;
        if(bulky && heavy)
        return "Both";
        if(bulky)
        return "Bulky";
        if(heavy)
        return "Heavy";
        else
        return "Neither";  
    }
}