import java.util.HashMap;

public class IDandPasswords {

    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDandPasswords(){

        logininfo.put("BAKHODIR","SOLIEV");
        logininfo.put("bakh17","bakh2022");
        logininfo.put("user","bakh17");
        logininfo.put("LOGout","Aff1212121?!");

    }

    public HashMap getLoginInfo(){
        return logininfo;
    }
}
