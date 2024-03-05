package serviceImpl;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import service.CrawlerService;

import java.io.IOException;

public class CrawlerServiceImpl implements CrawlerService {
    @Override
    public void findNamesFromWeb() throws IOException {
        Document doc = Jsoup.connect("https://music.bugs.co.kr/chart").get();
    }
}
