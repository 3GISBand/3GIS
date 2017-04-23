package com.courseproject.rober_000.guide;

public class Guide {
    String title;
    String description;
    String imgLink;

    public Guide(String title, String description, String imgLink) {
        this.title = title;
        this.description = description;
        this.imgLink = imgLink;
    }

    public static final Guide guides[] = new Guide[]{
            new Guide("First caption", "Mini description", "http://gazel-96.ru/UserFiles/Image/kazan480.jpg"),
            new Guide("Second caption", "Mini description", "http://nomernews.ru/uploads/posts/2017-02/moodys-povysilo-prognoz-poreytingurf-iz-za-prinyatiya-strategii-byudzhetnoy-konsolidacii_1.jpeg"),
            new Guide("First caption", "Mini description", "http://gazel-96.ru/UserFiles/Image/kazan480.jpg"),
            new Guide("Second caption", "Mini description", "http://nomernews.ru/uploads/posts/2017-02/moodys-povysilo-prognoz-poreytingurf-iz-za-prinyatiya-strategii-byudzhetnoy-konsolidacii_1.jpeg"),
            new Guide("First caption", "Mini description", "http://gazel-96.ru/UserFiles/Image/kazan480.jpg"),
    };

    public String getImgLink() {
        return imgLink;
    }

    public void setImgLink(String imgLink) {
        this.imgLink = imgLink;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}