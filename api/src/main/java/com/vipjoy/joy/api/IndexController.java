package com.vipjoy.joy.api;


import com.google.gson.Gson;
import com.vipjoy.joy.service.utils.AesException;
import com.vipjoy.joy.service.utils.SHA1Utils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import weixin.popular.api.MenuAPI;
import weixin.popular.api.MessageAPI;
import weixin.popular.api.TokenAPI;
import weixin.popular.bean.BaseResult;
import weixin.popular.bean.message.EventMessage;
import weixin.popular.bean.token.Token;
import weixin.popular.support.TokenManager;
import weixin.popular.util.XMLConverUtil;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class IndexController extends BaseController {


    @RequestMapping(value = "/init", method = RequestMethod.POST)
    public void index(HttpServletRequest request) throws AesException, IOException {
        EventMessage eventMessage = XMLConverUtil.convertToObject(EventMessage.class, request.getInputStream());
        logger.info("{}", new Gson().toJson(eventMessage));

    }

    @RequestMapping(value = "/init", method = RequestMethod.GET)
    public String index(HttpServletRequest request,
                        String signature, String timestamp,
                        String nonce, String echostr) throws AesException {
        Map<String, String> value = new LinkedHashMap<>();
        value.put("signature", signature);
        value.put("timestamp", timestamp);
        value.put("nonce", nonce);
        value.put("echostr", echostr);
        SHA1Utils.getSHA1(PATERNERKEY, timestamp, nonce, signature);

        logger.info(new Gson().toJson(value));
        return echostr;

    }

    @RequestMapping(value = "/menu")
    public BaseResult menu() {
        String token = TokenManager.getToken(APPID);

        return MenuAPI.menuCreate(token, menuJson);
    }


    private final static String menuJson = " {\n" +
            "     \"button\":[\n" +
            "     {\t\n" +
            "          \"type\":\"click\",\n" +
            "          \"name\":\"今日歌曲\",\n" +
            "          \"key\":\"V1001_TODAY_MUSIC\"\n" +
            "      },\n" +
            "      {\n" +
            "           \"name\":\"菜单\",\n" +
            "           \"sub_button\":[\n" +
            "           {\t\n" +
            "               \"type\":\"view\",\n" +
            "               \"name\":\"搜索\",\n" +
            "               \"url\":\"http://www.soso.com/\"\n" +
            "            },\n" +
            "            {\n" +
            "               \"type\":\"click\",\n" +
            "               \"name\":\"赞一下我们\",\n" +
            "               \"key\":\"V1001_GOOD\"\n" +
            "            }]\n" +
            "       }]\n" +
            " }";

}
