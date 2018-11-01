package exercise13;

public class WreckBeach {

    public static int maxStamina(int[] stair, int stamina)throws InsufficientStaminaException {
        int maxStamina= findStamina(stair,0,stamina);
        if(maxStamina<=0) {
            System.out.println(maxStamina);
            throw new InsufficientStaminaException();
        }
        return maxStamina;
    }

    private static int findStamina(int[] stair, int index, int stamina){
        if(index >= stair.length) {
            return stamina;
        }
        if(index==stair.length-2){
            int normal= findStamina(stair, index+1, stamina-stair[index]);
            int big= findStamina(stair,index+2, stamina-stair[index]-1);
            return Math.max(normal,big);
        }
        if(index==stair.length-1){
            int a= Math.min(1,stair[index]); //pick the smallest of doing these--> if you only have one step, you can just skip that and lose 1 or you can lose that
            return stamina-a;
        }

        int normal= findStamina(stair, index+1, stamina-stair[index]);
        int big= findStamina(stair,index+2, stamina-stair[index]-1);
        int jump= findStamina(stair, index+3, stamina-stair[index]-2);
        return findMax(normal,big,jump);
    }

    private static int findMax(int a,int b, int c){
        if(a>b && b>c) return a;
        if(b>a && a>c) return b;
        if(a>c && c>b) return a;
        if(c>a && a>b) return c;
        if(b>c && c>a) return b;
        else return c;
    }

}
