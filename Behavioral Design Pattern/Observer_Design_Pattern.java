import java.util.ArrayList;
import java.util.List;

interface Channal {
    public void update(Object o);
}

class News_Channel implements Channal {
    private String news;

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    @Override
    public void update(Object news) {
        this.setNews((String) news);
    }
}


class News_Agency{
    private String news;
    private List<Channal> channels = new ArrayList<>();
    
    public void Add_Observer(Channal channal){
        this.channels.add(channal);
    }

    public void Remove_Observer(Channal channal){
        this.channels.remove(channal);
    }

    public void setNews(String news){
        this.news = news;

        for(Channal channal : this.channels){
            channal.update(this.news);
        }

    }


}

public class Observer_Design_Pattern {

}
