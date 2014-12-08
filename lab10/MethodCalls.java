public class MethodCalls{
    
    public static void main(String []  arg){
        
    int a=784,b=22,c;
        
    c=addDigit(a,3);
    System.out.println("Add 3 to "+a+" to get "+c);
        
    c=addDigit(addDigit(c,4),5);
    System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
    System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        
    c=join(a,b);
    System.out.println("Join "+a+" to "+b+" to get "+c);
    System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
    System.out.println("Join -9 and -90 to get "+join(-9,-90));
    }
    
    public static int join(int a, int b){
        String answerOne = String.valueOf(a);
        String answerTwo = String.valueOf(b);
        String answer = "";
        String answerThree, answerFour;
        int num;
        if(a<0 && b<0){
                a *=-1;
                b *=-1;
                answerThree = String.valueOf(a);
                answerFour= String.valueOf(b);
                answer = (answerThree+answerFour);
                num = Integer.parseInt(answer);
                return num;
            }
            else{
                answer = (answerOne+answerTwo);
                num = Integer.parseInt(answer);
                return num;
            }
    }
    
    
    public static int addDigit(int a, int b){
        String answerOne = String.valueOf(a);
        String answerTwo = String.valueOf(b);
        String answer = "";
        String answerThree;
        int num;
        if(b>=0 && b<= 9){
            if(a<0){
                a *=-1;
                answerThree = String.valueOf(a);
                answer = (answerTwo+answerThree);
                num = Integer.parseInt(answer);
                num *= -1;
                return num;
            }
            answer = (answerTwo + answerOne);
            num = Integer.parseInt(answer);
            return num;
        }
        else{
            answer = answerOne+answerTwo;
            num = Integer.parseInt(answer);
            num *=-1;
            return num;
        }
    }
}  