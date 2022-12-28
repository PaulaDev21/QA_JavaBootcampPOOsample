import br.com.pauladev.dio.bootcamp.gtf.qa.poobootcamp.domain.*;
import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        List<Content> contents = new ArrayList<>();

        contents.add(new Course());
        contents.add(new Mentorship());

        System.out.println(contents);

    }
}
