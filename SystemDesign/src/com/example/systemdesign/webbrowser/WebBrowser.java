package com.example.systemdesign.webbrowser;

import java.util.*;

public class WebBrowser {

    private PriorityQueue<WebPage> history;
    private HashMap<String, WebPage> webPageMap;

    public WebBrowser() {
        this.history = new PriorityQueue<>(new Comparator<WebPage>() {
            @Override
            public int compare(WebPage o1, WebPage o2) {
                return o2.getVisitCount()-o1.getVisitCount();
            }
        });
        this.webPageMap = new HashMap<>();
    }

    public void navigate(String url){
        if(!this.webPageMap.containsKey(url)){
            printWebPageMap(this.webPageMap);
            this.webPageMap.put(url, new WebPage(url));
            WebPage page = this.webPageMap.get(url);
            page.visted();
            this.history.add(page);
        } else {
          WebPage page = this.webPageMap.get(url);
          this.history.remove(page);
          page.visted();
          this.history.add(page);
        }
    }

    private void printWebPageMap(HashMap<String, WebPage> webPageMap) {



    }

    public List<WebPage> mostVisted(){
        List<WebPage> list = new ArrayList<>();
        Iterator<WebPage> itr = this.history.iterator();

        int count  = 5;
        while(itr.hasNext() && count>0) {
            list.add(itr.next());
            count--;
        }


        return list;
    }

}
