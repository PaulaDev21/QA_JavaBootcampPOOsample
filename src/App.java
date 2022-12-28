import br.com.pauladev.dio.bootcamp.gtf.qa.poobootcamp.domain.*;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.io.FileReader;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {

    private static Set<Content> contents = new HashSet<>();
    private static Set<Dev> devs = new LinkedHashSet<>();
    private static Bootcamp bootcamp;

    public static void main(String[] args) throws Exception {

        readTestData("./resources/testdata/bootcamptestdata.txt");

        System.out.println(bootcamp);

    }

    private static void readTestData(String filePath)
            throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(filePath, StandardCharsets.UTF_8));

        readDevs(reader);
        readContents(reader);
        readBootcamp(reader);

        reader.close();
    }

    private static void readDevs(BufferedReader reader)
            throws IOException {
        if (!reader.readLine().equals("devs:")) {
            throw new IOException("Devs not found in file!");
        } else {
            String devName = reader.readLine();
            Dev dev;
            do {
                dev = new Dev(devName);
                devs.add(dev);
                devName = reader.readLine();
            } while (!devName.equals(""));
        }
    }

    private static void readContents(BufferedReader reader)
            throws IOException {
        String starterString = reader.readLine();
        if (!starterString.equals("curso:") && !starterString.equals("mentoria:")) {
            throw new IOException("No content information found in file!");
        } else {
            String title, description;
            int workload;
            Content cont = null;
            LocalDate date;
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
            do {
                if (starterString.equals("curso:")) {
                    title = reader.readLine();
                    description = reader.readLine();
                    workload = Integer.parseInt(reader.readLine());

                    cont = new Course(title, description, workload);
                } else if (starterString.equals("mentoria:")) {
                    title = reader.readLine();
                    description = reader.readLine();
                    date = LocalDate.parse(reader.readLine(), formatter);

                    cont = new Mentorship(title, description, date);
                }
                contents.add(cont);
                starterString = reader.readLine();
            } while (!starterString.equals(""));
        }
    }

    private static void readBootcamp(BufferedReader reader)
            throws IOException {
        String starterString = reader.readLine();
        if (!starterString.equals("bootcamp:")) {
            throw new IOException("No bootcamp information found in file!");
        } else {
            String name = reader.readLine(),
                    description = reader.readLine();

            bootcamp = new Bootcamp(name, description);
            bootcamp.setContents(contents);
        }

    }

}
