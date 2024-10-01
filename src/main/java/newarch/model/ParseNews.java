package newarch.model;

//import lombok.AllArgsConstructor;
//import newarch.service.NewsService;
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//import org.jsoup.select.Elements;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
//import java.io.IOException;
//
//@Component
//@AllArgsConstructor
//public class ParseNews {
//
//    private final NewsService newsService;
//
//    @Scheduled(fixedDelay = 100)
//    public static String readWebpageJSoup(String address) {
//        String pageContents = "The page contents of address: <" + address + "> were not read! \n";
//
//        try {
//            //Document webDocument = Jsoup.connect(address).get();
//            //Document webDocument = Jsoup.connect("https://yandex.ru/pogoda/ru-RU/date/march/5?lat=54.629565&lon=39.741914").get();
//            Document webDocument = Jsoup.connect("https://ria.ru").get();
//            pageContents = webDocument.title() + "\n";
//            pageContents += webDocument.text();
//            pageContents = pageContents.trim();
//            System.out.println();
//            Elements titles = webDocument.getElementsByClass("cell-list__item-title");
//            for (int i = 0; i < titles.size(); i++) {
//                System.out.println(titles.get(i));
//
//            }
//
//        }
//        catch (IllegalArgumentException badAddress) {
//            pageContents += badAddress.getMessage();
//        }
//        catch (IOException ioError) {
//            pageContents += ioError.getMessage();
//        }
//
//        return pageContents;
//    }
//}
