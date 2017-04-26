package com.coca.fun.rest;


import com.coca.fun.service.utils.AesException;
import com.coca.fun.service.utils.SHA1Utils;
import com.google.gson.Gson;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import weixin.popular.api.MenuAPI;
import weixin.popular.api.TokenAPI;
import weixin.popular.bean.message.EventMessage;
import weixin.popular.bean.token.Token;
import weixin.popular.bean.xmlmessage.XMLMessage;
import weixin.popular.bean.xmlmessage.XMLTextMessage;
import weixin.popular.util.XMLConverUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class IndexController extends BaseController {


    private final static String APPID="wx71ff2d825b7120e4";
    private final static String APPSSECRET="6d136d616a747e031e66999b1d3d2fbc";
    private final static String PATERNERKEY="123456";



    @RequestMapping(value = "/",method = RequestMethod.POST)
    public void index(HttpServletRequest request,
                      HttpServletResponse response) throws AesException, IOException {

        EventMessage eventMessage = XMLConverUtil.convertToObject(EventMessage.class, request.getInputStream());
        logger.info("{}",new Gson().toJson(eventMessage));

        XMLMessage xmlTextMessage = null;
        if(StringUtils.equals(eventMessage.getMsgType(),"text")){
            if(StringUtils.equals(eventMessage.getContent(),"附近")){
                xmlTextMessage = new XMLTextMessage(
                        eventMessage.getFromUserName(),
                        eventMessage.getToUserName(),
                                "足浴：<a href='http://www.baidu.com'>足浴</a> \n" +
                                "\nKTV：<a href='http://www.google.com'>KTV</a> \n" +
                                "\n店铺：<a href='http://www.vipkid.com.cn'>店铺</a>");
            } else if(StringUtils.equals(eventMessage.getContent(),"休闲")){
                xmlTextMessage = new XMLTextMessage(
                        eventMessage.getFromUserName(),
                        eventMessage.getToUserName(),
                        "休闲娱乐");
            } else if(StringUtils.equals(eventMessage.getContent(),"足浴")){
                xmlTextMessage = new XMLTextMessage(
                        eventMessage.getFromUserName(),
                        eventMessage.getToUserName(),
                        "店铺");
            }else{
                xmlTextMessage = new XMLTextMessage(
                        eventMessage.getFromUserName(),
                        eventMessage.getToUserName(),
                        "请输入你想查找的关键字");
            }
            xmlTextMessage.outputStreamWrite(response.getOutputStream());

        } else if(StringUtils.equals(eventMessage.getMsgType(), "event")){
            if(StringUtils.equals(eventMessage.getEvent(), "subscribe")){
                xmlTextMessage = new XMLTextMessage(
                        eventMessage.getFromUserName(),
                        eventMessage.getToUserName(),
                        "欢迎关注vipjoy\n" +
                                "请输入关键字查询想要的信息\n" +
                                "如：足浴，休闲，附近");
                xmlTextMessage.outputStreamWrite(response.getOutputStream());
            }
        }

    }

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(HttpServletRequest request,
                      String signature,String timestamp,
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


    @RequestMapping(value = "/menu")
    public void menu(HttpServletRequest request, HttpServletResponse response){

        Token token = TokenAPI.token(APPID, APPSSECRET);
        MenuAPI.menuCreate(token.getAccess_token(), menuJson);

    }

    private final static String menuJson=" {\n" +
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
            "                 \"type\":\"miniprogram\",\n" +
            "                 \"name\":\"wxa\",\n" +
            "                 \"url\":\"http://mp.weixin.qq.com\",\n" +
            "                 \"appid\":\"wx286b93c14bbf93aa\",\n" +
            "                 \"pagepath\":\"pages/lunar/index.html\"\n" +
            "             },\n" +
            "            {\n" +
            "               \"type\":\"click\",\n" +
            "               \"name\":\"赞一下我们\",\n" +
            "               \"key\":\"V1001_GOOD\"\n" +
            "            }]\n" +
            "       }]\n" +
            " }";



}
