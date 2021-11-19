/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo07group.squad6;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Manoj Kota
 */
@Controller
public class Squad6IndexController {
    private static final String GREETING_MESSAGE = "Welcome to our 542 Zoo!";
    private static final String GOODBYE_MESSAGE = "Thank you for visiting our zoo!";
    private static final int NUMBER_ANIMAL_TYPES = 60;

    /**
     * The @GetMapping annotation ensures that HTTP GET requests to / are mapped
     * to the index() method.Example:
     * https://spring.io/guides/gs/serving-web-content/
     *
     *
     * @param idParam - the id provided in the URL
     * @param model - the model that holds information from controller to view
     * @return
     */
    @GetMapping(path = "/")
    public String index(
            @RequestParam(name = "id", required = false, defaultValue = "0") String idParam,
            Model model) {
        model.addAttribute("id", idParam);
        model.addAttribute("name", "World");
        model.addAttribute("greeting", GREETING_MESSAGE);

        model.addAttribute("customAnimalGroup", getCustomAnimalGroup(idParam));
        // associated with index.hmtl in src/main/resources/templates
        return "index";
    }

    /**
     * Map GET request to "/about" to about() method.
     *
     * @return filename from src/main/resources/templates folder
     */
    @GetMapping(path = "/about")
    public String about() {
        return "about";
    }

    /**
     * Map GET request to "/games" to games() method.
     *
     * @return filename from src/main/resources/templates folder
     */
    @GetMapping(path = "/games")
    public String games() {
        return "games";
    }

    /**
     * Map GET request to "/persons" to persons() method.
     *
     * @return filename from src/main/resources/templates folder
     */
    @GetMapping(path = "/persons")
    public String persons() {
        return "persons";
    }
    
    
    

    /**
     * Map GET request to "/rides" to rides() method.
     *
     * @return filename from src/main/resources/templates folder
     */
    @GetMapping(path = "/rides")
    public String rides() {
        return "rides";
    }

    /**
     * Map GET request to "/vehicles" to vehicles() method.
     *
     * @return filename from src/main/resources/templates folder
     */
    @GetMapping(path = "/vehicles")
    public String vehicles() {
        return "vehicles";
    }

    private String getCustomAnimalGroup(String id) {
        // Create a stream to hold the output
        var newStream = new ByteArrayOutputStream();
        var newPrintStream = new PrintStream(newStream);
        // IMPORTANT: Save the old System.out!
        PrintStream old = System.out;
        // Tell Java to use your special stream
        System.setOut(newPrintStream);

        var intID = Integer.parseInt(id);

        switch (intID) {
            case 1 -> {
                        DoctorGroup.create();
                        DoctorGroup.run();
                    }
                    case 2 -> {
                        LegalAdvisorGroup.create();
                        LegalAdvisorGroup.run();
                    }
                    case 3-> {
                        RegistrarGroup.create();
                        RegistrarGroup.run();
                    }
                    case 4-> {
                        VeterinarianGroup.create();
                        VeterinarianGroup.run();
                    }
                    case 5-> {
                        SoftwaredevGroup.create();
                        SoftwaredevGroup.run();
                    }
                    case 6-> {
                        GuideGroup.create();
                        GuideGroup.run();
                    }
                    case 7-> {
                        TrainerGroup.create();
                        TrainerGroup.run();
                    }
                    case 8-> {
                        ZoologistGroup.create();
                        ZoologistGroup.run();
                    }
                    case 9-> {
                        ZoocoordinatorGroup.create();
                        ZoocoordinatorGroup.run();
                    }
                    case 10-> {
                       VisitorServiceManagerGroup.create();
                        VisitorServiceManagerGroup.run();
                    }



                    
                    default -> {
                    }

        }
        // Put things back
        System.out.flush();
        System.setOut(old);
        String stringOutput = newStream.toString();
        return stringOutput;
    }


    
}
