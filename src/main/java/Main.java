import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Main {
    private static Gson gson = new Gson();
    public static void main(String[] args) throws IOException, InterruptedException {

        int lastId= 0;
        String address = "ENTER ADDRESS";
        String api = "ENTER API";

        while (true){
            try{
                URL url = new URL("https://api.etherscan.io/api?module=account&action=tokennfttx&contractaddress="+address +"&page=1&offset=1&apikey="+ api +"&sort=desc");
                InputStreamReader reader = new InputStreamReader(url.openStream());
                Dto dto = gson.fromJson(reader, Dto.class);
                int currentID = Integer.parseInt(dto.getResult().get(0).getTokenID());

                if ( currentID != lastId){
                    lastId = currentID;
                    System.out.println("Token id :" + lastId );
                }
                Thread.sleep(450);
            }
            catch (JsonSyntaxException e){
                Thread.sleep(350);
                System.out.println("error");
            }
        }
    }
}
