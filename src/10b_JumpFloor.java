public class Solution {
    public int JumpFloor(int target) {
        int p1 = 1;
        int p2 = 2;
        if(target<=0) return  0;
        if(target ==1) return p1;
        if(target == 2) return p2;
        for(int i =3;i<=target;i++){
            int temp  = p1;
            p1 = p2;
            p2 = temp +p2;
        }
        return p2;
    }
}
