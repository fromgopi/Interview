package com.example.systemdesign.webbrowser;

public class WebPage {

    private String url;
    private int visitCount;


    WebPage(String url){
        this.url = url;
        this.visitCount = 0;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(int visitCount) {
        this.visitCount = visitCount;
    }

    public void visted(){
        this.visitCount++;
    }
}



