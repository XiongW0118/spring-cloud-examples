package springcloudexamplebizb.springcloudexamplebizb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    /**
     * 示例方法
     *
     * @return
     */
    @GetMapping
    public String sayHello() {
        return "Hello,This is Biz-B Service.";
    }
}
