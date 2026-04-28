@RestController
public class TestController {

    @GetMapping("/")
    public String test() {
        return "Backend Working ✅";
    }
}