package me.maweiyi;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maweiyi on 10/1/16.
 */
public class Builder {
    private List<Sender> list = new ArrayList<>();

    public void produceMailSender(int count){
        for(int i=0; i<count; i++){
            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int count){
        for(int i=0; i<count; i++){
            list.add(new SmsSender());
        }
    }
}
