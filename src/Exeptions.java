public class Exeptions {
    public void checkOne(String a) throws Exception {
        if ((a.contains("1") || a.contains("2") || a.contains("3") || a.contains("4") || a.contains("5") || a.contains("6") || a.contains("7") || a.contains("8") || a.contains("9")) && ((a.contains("X") || a.contains("I") || a.contains("V")))) {
            throw new Exception();
        }
    }

    public Integer checkTwo(String a) {
        int f = 1;
        if(a.contains("X") || a.contains("I") || a.contains("V")){
            f = 0;
        }
        return f;

    }

    public void checkThree(String [] str) throws Exception {
        if(str.length > 3){
            throw new Exception();
        }
    }
}
