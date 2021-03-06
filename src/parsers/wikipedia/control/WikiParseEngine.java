package parsers.wikipedia.control;

import control.Global;
import hibernate.queries.InsertManager;
import hibernate.queries.Select;
import parsers.wikipedia.WordParser;

import org.jsoup.Jsoup;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class WikiParseEngine {

    public static void main(String[] args) {
        WikiParseEngine goGoGadget = new WikiParseEngine();

        for (String strId : new String[] { "1000",
                "2001-3000",
                "3001-4000",
                "4001-5000",
                "5001-6000",
                "6001-7000",
                "7001-8000",
                "8001-9000",
                "9001-10000" }) {
            goGoGadget.run(strId, 10000);
        }
    }

    public void run(String pstrId,
                    int pintLimit) {
        List<String> strFrequencyList = getFrequencyList(pstrId);

        int i = 0;
        while (i < strFrequencyList.size() && i < (pintLimit*2)) {
        	System.out.println("------------------------  " + i + "  ------------------------");
        	String strWord = strFrequencyList.get(i+1);

        	if (!Select.isInDB(strWord)) {
        		int intRank = Integer.parseInt(strFrequencyList.get(i));
        		System.out.println("Rank: "+intRank);

        		int _index = strWord.indexOf(" ");
        		if (_index > 0) {
        			strWord = strWord.substring(0, _index);
        			runOneWord(strWord.substring(_index), intRank);
        		}
        		runOneWord(strWord, intRank);
        	}
        	i += 2;
        }
    }

    public void runOneWord(String pstrWord,
                            int pintRank) {
    	Elements eleWikiPage = WikiLanguageElementsBuilder.build(pstrWord);
    	if (!eleWikiPage.isEmpty()) {
    		WordParser wg = new WordParser();
    		wg.setMstrWord(pstrWord);
    		wg.setMeleSpanish(eleWikiPage);
    		wg.setRank(pintRank);
    		InsertManager.insert(wg.parse());
    		wg.parse().forEach(n -> n.print());
    	}
    }

    public List<String> getFrequencyList(String pstrId) {
        List<String> strRankLemmaList = new ArrayList<>();
        Elements eleTdAll = new Elements();

        try {
            eleTdAll = Jsoup.parse(new URL("https://en.wiktionary.org/wiki/Wiktionary:Frequency_lists/Spanish" + pstrId), Global.TIMEOUT)
                    .select("td");
        } catch (MalformedURLException m) {
            m.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < eleTdAll.size(); i++) {
            if (i % 4 == 0 || i % 4 == 3) {
                strRankLemmaList.add(eleTdAll.get(i).text().replace(".", "").trim());
            }
        }
        return strRankLemmaList;
    }
}
