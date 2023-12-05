public class Digits {
    public int transform(String line) throws Exception {
        int a;

        if(line.equals("10")||line.equals("X")){
            a = 10;
        }else if(line.equals("1")||line.equals("I")){
            a = 1;
        }else if(line.equals("2")||line.equals("II")){
            a = 2;
        }else if(line.equals("3")||line.equals("III")){
            a = 3;
        }else if(line.equals("4")||line.equals("IV")){
            a = 4;
        }else if(line.equals("5")||line.equals("V")){
            a = 5;
        }else if(line.equals("6")||line.equals("VI")){
            a = 6;
        }else if(line.equals("7")||line.equals("VII")){
            a = 7;
        }else if(line.equals("8")||line.equals("VIII")){
            a = 8;
        }else if(line.equals("9")||line.equals("IX")){
            a = 9;
        }else{
            throw new Exception();
        }

        return a;
    }

    public int count(String a, int b, int c){
        int rez = 0;
        if(a.contains("+")){
            rez = b+c;
        }if(a.contains("-")){
            rez = b-c;
        }if(a.contains("*")){
            rez = b*c;
        }if(a.contains("/")){
            rez = b/c;
        }
        return rez;
    }

    public String secondDigit (int d){
        String a = "";
        if (d == 10) {
            a = "X";
        } else if (d == 1) {
            a = "I";
        } else if (d == 2) {
            a = "II";
        } else if (d == 3) {
            a = "III";
        } else if (d == 4) {
            a = "IV";
        } else if (d == 5) {
            a = "V";
        } else if (d == 6) {
            a = "VI";
        } else if (d == 7) {
            a = "VII";
        } else if (d == 8) {
            a = "VIII";
        } else if (d == 9) {
            a = "IX";
        } else if (d == 20) {
            a = "XX";
        } else if (d == 30) {
            a = "XXX";
        } else if (d == 40) {
            a = "XL";
        } else if (d == 50) {
            a = "L";
        } else if (d == 60) {
            a = "LX";
        } else if (d == 70) {
            a = "LXX";
        } else if (d == 80) {
            a = "LXXX";
        } else if (d == 90) {
            a = "XC";
        } else if (d == 100) {
            a = "C";
        }
        return a;
    }

    public String reverse( int d) throws Exception {
        String a;

        if((d>10)&&(d<20)){
            d = d - 10;
            a = "X" + secondDigit(d);
        }else if((d>20)&&(d<30)){
            d = d - 20;
            a = "XX" + secondDigit(d);
        }else if((d>30)&&(d<40)){
            d = d - 30;
            a = "XXX" + secondDigit(d);
        }else if((d>40)&&(d<50)){
            d = d - 40;
            a = "XL" + secondDigit(d);
        }else if((d>50)&&(d<60)){
            d = d - 50;
            a = "L" + secondDigit(d);
        }else if((d>60)&&(d<70)){
            d = d - 60;
            a = "LX" + secondDigit(d);
        }else if((d>70)&&(d<80)){
            d = d - 70;
            a = "LXX" + secondDigit(d);
        }else if((d>80)&&(d<90)){
            d = d - 80;
            a = "LXXX" + secondDigit(d);
        }else if((d>90)&&(d<100)){
            d = d - 90;
            a = "XC" + secondDigit(d);
        }else if(d<0){
            throw new Exception();
        }else
            a = secondDigit(d);

        return a;
    }
}
