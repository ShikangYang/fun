package com.vipjoy.joy.client.task;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class MeiTuanTask {

    private  static final Log log = LogFactory.getLog(MeiTuanTask.class);

    private static final String PARENTURL="http://bj.meituan.com/category/zuliaoxiuxian";
    private static final String URL="http://bj.meituan.com/shop/315081";
    private static final String AGENT="Chrome/26.0.1410.64 Safari/537.31";

    private  static void taskMeituan() {
        try {

            Document   parentDocument = Jsoup.connect(PARENTURL).userAgent(AGENT).get();
            Elements parent = parentDocument.select(".poi-tile-nodeal");
            String imgs = parent.select("a img").attr("src");
            String parentUrl = parent.select(".poi-tile__info a ").attr("href");
            String shopName = parent.select(".poi-tile__info .link").text();
            String tag = parent.select(".extra a ").text();
            String junjia = parent.select(".poi-tile__money .price ").text();
            String qishijiage = parent.select(".poi-tile__money .value ").text();


            log.info(imgs);
            log.info(parentUrl);
            log.info(shopName);
            log.info(tag);
            log.info(junjia);
            log.info(qishijiage);




            Document   document = Jsoup.connect(parentUrl).userAgent(AGENT).get();
            Elements elements = document.getElementsByClass("cf");
            Elements header = elements.select(".fs-section__left");
            String title = header.select(".title").text();
            String addressAndPhone = header.select("p.under-title").text();

            Elements es = elements.select(".fs-section__right");
            String score = es.select(".biz-level strong").text();
            String category = es.select(".tag").text();
            String count = es.select(".counts").text();

            Elements select = elements.select(".item");
            String   tle = select.select("a").text();
            String img = select.select("a img").attr("src");
            String date = select.select(".item__duedate").text();
            String price = select.select(".item__price").text();

            Elements content = elements.select(".poi-section");
            String contentTitle = content.select(".content-title").text();
            String shopImg = content.select(".img-wrapper img").attr("src");
            String yingyeshijian = content.select(".field-group").text();


            Elements pingjia = elements.select(".poi-section");

            log.info(title);
            log.info(addressAndPhone);
            log.info("============================");
            log.info(score);
            log.info(category);
            log.info(count);
            log.info("============================");
            log.info(tle);
            log.info(img);
            log.info(date);
            log.info(price);
            log.info("============================");
            log.info(contentTitle);
            log.info(shopImg);
            log.info(yingyeshijian);

            //log.info(pingjia);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static void main(String[] args) {
        taskMeituan();

    }
}
