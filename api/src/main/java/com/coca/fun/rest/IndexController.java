package com.coca.fun.rest;


import com.coca.fun.service.utils.AesException;
import com.coca.fun.service.utils.SHA1Utils;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import weixin.popular.api.MenuAPI;
import weixin.popular.api.MessageAPI;
import weixin.popular.api.TokenAPI;
import weixin.popular.bean.BaseResult;
import weixin.popular.bean.menu.Button;
import weixin.popular.bean.menu.MenuButtons;
import weixin.popular.bean.token.Token;
import weixin.popular.support.TokenManager;
import weixin.popular.util.SignatureUtil;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class IndexController extends BaseController {


    private final static String APPID="wx175870782335e611";
    private final static String APPSSECRET="bcbb8fc98bc8337557c6319e704419f8";
    private final static String PATERNERKEY="123456";

    private String accessToken;


    @RequestMapping(value = "/")
    public String index(String signature,String timestamp,
                        String nonce,String echostr) throws AesException {

        Map<String,String> value=new LinkedHashMap<>();
        value.put("signature",signature);
        value.put("timestamp",timestamp);
        value.put("nonce",nonce);
        value.put("echostr",echostr);
        SHA1Utils.getSHA1(PATERNERKEY, timestamp, nonce, signature);

        logger.info(new Gson().toJson(value));
        return echostr;
    }

    @RequestMapping(value = "/hello")
    public String helloWorld() {


        return "ok";
    }

    @RequestMapping(value = "/msg")
    public BaseResult menu() {

        Token token = TokenAPI.token(APPID, APPSSECRET);

        return MessageAPI.messageCustomSend(token.getAccess_token(),"哈哈哈哈");
    }
}
