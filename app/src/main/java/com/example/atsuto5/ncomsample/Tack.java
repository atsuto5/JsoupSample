package com.example.atsuto5.ncomsample;

import android.os.AsyncTask;
import android.util.Log;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by Atsuto5 on 2017/03/22.
 */
public class Tack extends AsyncTask {

    private final String TAG = "Task";

    @Override
    protected Object doInBackground(Object[] params) {

        try {
            Document doc = Jsoup.connect("https://developer.ntt.com/ja/blog/cat01").get();

            //説明文取得
            Elements images = doc.select(".group-header .field__items [property=content:encoded]");
            for (Element element : images) {
                System.out.println(element.text());
            }


//            //リンクURL取得
//            Elements images = doc.select(".group-header  [property=dc:title] a");
//            for (Element element : images) {
//                System.out.println(element.attr("href"));
//            }



            //画像URL取得
//            Elements images = doc.select(".group-header img");
//            for (Element element : images) {
//                System.out.println(element.attr("src"));
//            }


//            //タイトル取得
//            Elements elements = doc.select(".group-header a");
//            for (Element element : elements) {
//                System.out.println(element.text());
//            }


        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }
}
