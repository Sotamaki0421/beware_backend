package jp.sotamaki.beware;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HomeRestController {

    @RequestMapping(value = "/resthello")
    String Hello() {
        return String.format("Hello.\nIt works!\n現在時刻は%sです｡ ", LocalDateTime.now());
    }

}
