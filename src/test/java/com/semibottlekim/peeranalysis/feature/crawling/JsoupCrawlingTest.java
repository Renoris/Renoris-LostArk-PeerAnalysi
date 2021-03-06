package com.semibottlekim.peeranalysis.feature.crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class JsoupCrawlingTest {

    @Test
    public void Jsoup_검색시_성공적으로_HTML을_불러올수_있어야한다() throws IOException {
        //given
        String url = "https://lostark.game.onstove.com/Profile/Character/%EC%97%90%ED%94%8C%EB%A6%BF";
        String title = "로스트아크 - 전투정보실";

        //when
        Document doc = Jsoup.connect(url).get();

        //then
        assertThat(doc.title()).isEqualTo(title);
    }

    @Test
    public void crawling시_성공적으로_캐릭터이름을_가져올수있어야한다() throws IOException {
        //given
        String url = "https://lostark.game.onstove.com/Profile/Character/%EC%97%90%ED%94%8C%EB%A6%BF";
        String targetDivClass = "profile-character-info__name";
        String characterName = "에플릿";

        //when
        Document doc = Jsoup.connect(url).get();

        //then
        Elements target = doc.body().getElementsByClass(targetDivClass);
        String result = target.attr("title");
        assertThat(result).isEqualTo(characterName);
    }
}
